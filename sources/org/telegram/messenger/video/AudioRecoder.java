package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
public class AudioRecoder {
    private static final int BYTES_PER_SHORT = 2;
    ArrayList<ag.a> audioInputs;
    private final MediaCodec encoder;
    private boolean encoderDone;
    private ByteBuffer[] encoderInputBuffers;
    private ByteBuffer[] encoderOutputBuffers;
    public final MediaFormat format;
    ag.a mainInput;
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

    public AudioRecoder(ArrayList<ag.a> arrayList, long j3) {
        this.sampleRate = 44100;
        this.audioInputs = arrayList;
        this.totalDurationUs = j3;
        this.mainInput = arrayList.get(0);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10).b() > this.sampleRate) {
                this.sampleRate = arrayList.get(i10).b();
            }
        }
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        this.encoder = createEncoderByType;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.sampleRate, this.channelCount);
        this.format = createAudioFormat;
        createAudioFormat.setInteger("bitrate", 128000);
        createEncoderByType.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        createEncoderByType.start();
        this.encoderInputBuffers = createEncoderByType.getInputBuffers();
        this.encoderOutputBuffers = createEncoderByType.getOutputBuffers();
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
        int remaining = shortBuffer.remaining();
        for (int i10 = 0; i10 < remaining && isInputAvailable(); i10++) {
            boolean z10 = false;
            short s10 = 0;
            for (int i11 = 0; i11 < this.audioInputs.size() && isInputAvailable(); i11++) {
                ag.a aVar = this.audioInputs.get(i11);
                if (aVar.c()) {
                    s10 = (short) ((((short) (aVar.a() * aVar.f437a)) / this.audioInputs.size()) + s10);
                    z10 = true;
                }
            }
            if (z10) {
                shortBuffer.put(s10);
            }
        }
    }

    public void release() {
        try {
            this.encoder.stop();
            for (int i10 = 0; i10 < this.audioInputs.size(); i10++) {
                this.audioInputs.get(i10).d();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public boolean step(MediaCodecVideoConvertor.Muxer muxer, int i10) {
        int dequeueInputBuffer;
        if (!this.encoderInputDone && (dequeueInputBuffer = this.encoder.dequeueInputBuffer(2500L)) >= 0) {
            if (isInputAvailable()) {
                ShortBuffer asShortBuffer = this.encoder.getInputBuffer(dequeueInputBuffer).asShortBuffer();
                mix(asShortBuffer);
                this.encoder.queueInputBuffer(dequeueInputBuffer, 0, asShortBuffer.position() * 2, this.encoderInputPresentationTimeUs, 1);
                this.encoderInputPresentationTimeUs = AudioConversions.shortsToUs(asShortBuffer.position(), this.sampleRate, this.channelCount) + this.encoderInputPresentationTimeUs;
            } else {
                this.encoder.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                this.encoderInputDone = true;
            }
        }
        if (!this.encoderDone) {
            int dequeueOutputBuffer = this.encoder.dequeueOutputBuffer(this.encoderOutputBufferInfo, 2500L);
            if (dequeueOutputBuffer == -1) {
                return this.encoderDone;
            }
            if (dequeueOutputBuffer == -3) {
                this.encoderOutputBuffers = this.encoder.getOutputBuffers();
            }
            if (dequeueOutputBuffer == -2) {
                return this.encoderDone;
            }
            ByteBuffer byteBuffer = this.encoderOutputBuffers[dequeueOutputBuffer];
            MediaCodec.BufferInfo bufferInfo = this.encoderOutputBufferInfo;
            if ((bufferInfo.flags & 2) != 0) {
                this.encoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                return this.encoderDone;
            }
            if (bufferInfo.size != 0) {
                muxer.writeSampleData(i10, byteBuffer, bufferInfo, false);
            }
            if ((this.encoderOutputBufferInfo.flags & 4) != 0) {
                this.encoderDone = true;
            }
            this.encoder.releaseOutputBuffer(dequeueOutputBuffer, false);
        }
        return this.encoderDone;
    }
}
