package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.video.audio_input.AudioInput;

public class AudioRecoder {
    private static final int BYTES_PER_SHORT = 2;
    ArrayList<AudioInput> audioInputs;
    private final MediaCodec encoder;
    private boolean encoderDone;
    private ByteBuffer[] encoderInputBuffers;
    private ByteBuffer[] encoderOutputBuffers;
    public final MediaFormat format;
    AudioInput mainInput;
    private int sampleRate;
    private long totalDurationUs;
    private final int TIMEOUT_USEC = 2500;
    private final int DEFAULT_SAMPLE_RATE = 44100;
    private final int DEFAULT_BIT_RATE = 128000;
    private final int DEFAULT_CHANNEL_COUNT = 2;
    private final MediaCodec.BufferInfo encoderOutputBufferInfo = new MediaCodec.BufferInfo();
    private boolean extractorDone = false;
    private boolean decoderDone = false;
    private boolean encoderInputDone = false;
    private int pendingAudioDecoderOutputBufferIndex = -1;
    private int channelCount = 2;
    private long encoderInputPresentationTimeUs = 0;

    public AudioRecoder(ArrayList<AudioInput> arrayList, long j) throws IOException {
        this.sampleRate = 44100;
        this.audioInputs = arrayList;
        this.totalDurationUs = j;
        this.mainInput = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getSampleRate() > this.sampleRate) {
                this.sampleRate = arrayList.get(i).getSampleRate();
            }
        }
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        this.encoder = mediaCodecCreateEncoderByType;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.sampleRate, this.channelCount);
        this.format = mediaFormatCreateAudioFormat;
        mediaFormatCreateAudioFormat.setInteger("bitrate", 128000);
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        mediaCodecCreateEncoderByType.start();
        this.encoderInputBuffers = mediaCodecCreateEncoderByType.getInputBuffers();
        this.encoderOutputBuffers = mediaCodecCreateEncoderByType.getOutputBuffers();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).start(this.sampleRate, this.channelCount);
        }
    }

    public void release() {
        try {
            this.encoder.stop();
            for (int i = 0; i < this.audioInputs.size(); i++) {
                this.audioInputs.get(i).release();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean step(MediaCodecVideoConvertor.Muxer muxer, int i) {
        int iDequeueInputBuffer;
        if (!this.encoderInputDone && (iDequeueInputBuffer = this.encoder.dequeueInputBuffer(2500L)) >= 0) {
            if (isInputAvailable()) {
                ShortBuffer shortBufferAsShortBuffer = this.encoder.getInputBuffer(iDequeueInputBuffer).asShortBuffer();
                mix(shortBufferAsShortBuffer);
                this.encoder.queueInputBuffer(iDequeueInputBuffer, 0, shortBufferAsShortBuffer.position() * 2, this.encoderInputPresentationTimeUs, 1);
                this.encoderInputPresentationTimeUs += AudioConversions.shortsToUs(shortBufferAsShortBuffer.position(), this.sampleRate, this.channelCount);
            } else {
                this.encoder.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                this.encoderInputDone = true;
            }
        }
        if (!this.encoderDone) {
            int iDequeueOutputBuffer = this.encoder.dequeueOutputBuffer(this.encoderOutputBufferInfo, 2500L);
            if (iDequeueOutputBuffer == -1) {
                return this.encoderDone;
            }
            if (iDequeueOutputBuffer == -3) {
                this.encoderOutputBuffers = this.encoder.getOutputBuffers();
            }
            if (iDequeueOutputBuffer == -2) {
                return this.encoderDone;
            }
            ByteBuffer byteBuffer = this.encoderOutputBuffers[iDequeueOutputBuffer];
            MediaCodec.BufferInfo bufferInfo = this.encoderOutputBufferInfo;
            if ((bufferInfo.flags & 2) != 0) {
                this.encoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return this.encoderDone;
            }
            if (bufferInfo.size != 0) {
                muxer.writeSampleData(i, byteBuffer, bufferInfo, false);
            }
            if ((this.encoderOutputBufferInfo.flags & 4) != 0) {
                this.encoderDone = true;
            }
            this.encoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
        }
        return this.encoderDone;
    }

    private void mix(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        for (int i = 0; i < iRemaining && isInputAvailable(); i++) {
            boolean z = false;
            short next = 0;
            for (int i2 = 0; i2 < this.audioInputs.size() && isInputAvailable(); i2++) {
                AudioInput audioInput = this.audioInputs.get(i2);
                if (audioInput.hasRemaining()) {
                    next = (short) (next + (((short) (audioInput.getNext() * audioInput.getVolume())) / this.audioInputs.size()));
                    z = true;
                }
            }
            if (z) {
                shortBuffer.put(next);
            }
        }
    }

    private boolean isInputAvailable() {
        if (this.encoderInputPresentationTimeUs > this.totalDurationUs) {
            return false;
        }
        return this.mainInput.hasRemaining();
    }
}
