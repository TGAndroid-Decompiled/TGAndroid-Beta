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

public class AudioRecoder {
    private static final int BYTES_PER_SHORT = 2;
    ArrayList<jf.a> audioInputs;
    private final MediaCodec encoder;
    private boolean encoderDone;
    private ByteBuffer[] encoderInputBuffers;
    private ByteBuffer[] encoderOutputBuffers;
    public final MediaFormat format;
    jf.a mainInput;
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

    public AudioRecoder(ArrayList<jf.a> arrayList, long j10) throws IOException {
        this.sampleRate = 44100;
        this.audioInputs = arrayList;
        this.totalDurationUs = j10;
        this.mainInput = arrayList.get(0);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10).b() > this.sampleRate) {
                this.sampleRate = arrayList.get(i10).b();
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
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).e(this.sampleRate, this.channelCount);
        }
    }

    private boolean isInputAvailable() {
        if (this.encoderInputPresentationTimeUs > this.totalDurationUs) {
            return false;
        }
        return this.mainInput.c();
    }

    private void mix(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        for (int i10 = 0; i10 < iRemaining && isInputAvailable(); i10++) {
            boolean z10 = false;
            short sA = 0;
            for (int i11 = 0; i11 < this.audioInputs.size() && isInputAvailable(); i11++) {
                jf.a aVar = this.audioInputs.get(i11);
                if (aVar.c()) {
                    sA = (short) ((((short) (aVar.a() * aVar.f12930a)) / this.audioInputs.size()) + sA);
                    z10 = true;
                }
            }
            if (z10) {
                shortBuffer.put(sA);
            }
        }
    }

    public void release() {
        try {
            this.encoder.stop();
            for (int i10 = 0; i10 < this.audioInputs.size(); i10++) {
                this.audioInputs.get(i10).d();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public boolean step(MediaCodecVideoConvertor.Muxer muxer, int i10) {
        int iDequeueInputBuffer;
        if (!this.encoderInputDone && (iDequeueInputBuffer = this.encoder.dequeueInputBuffer(2500L)) >= 0) {
            if (isInputAvailable()) {
                ShortBuffer shortBufferAsShortBuffer = this.encoder.getInputBuffer(iDequeueInputBuffer).asShortBuffer();
                mix(shortBufferAsShortBuffer);
                this.encoder.queueInputBuffer(iDequeueInputBuffer, 0, shortBufferAsShortBuffer.position() * 2, this.encoderInputPresentationTimeUs, 1);
                this.encoderInputPresentationTimeUs = AudioConversions.shortsToUs(shortBufferAsShortBuffer.position(), this.sampleRate, this.channelCount) + this.encoderInputPresentationTimeUs;
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
                muxer.writeSampleData(i10, byteBuffer, bufferInfo, false);
            }
            if ((this.encoderOutputBufferInfo.flags & 4) != 0) {
                this.encoderDone = true;
            }
            this.encoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
        }
        return this.encoderDone;
    }
}
