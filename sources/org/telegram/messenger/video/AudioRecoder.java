package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public class AudioRecoder {
    private final MediaCodec decoder;
    private ByteBuffer[] decoderInputBuffers;
    private ByteBuffer[] decoderOutputBuffers;
    private final MediaCodec encoder;
    private ByteBuffer[] encoderInputBuffers;
    private ByteBuffer[] encoderOutputBuffers;
    private final MediaExtractor extractor;
    public final MediaFormat format;
    private final int trackIndex;
    private final MediaCodec.BufferInfo decoderOutputBufferInfo = new MediaCodec.BufferInfo();
    private final MediaCodec.BufferInfo encoderOutputBufferInfo = new MediaCodec.BufferInfo();
    private boolean extractorDone = false;
    private boolean decoderDone = false;
    private boolean encoderDone = false;
    private int pendingAudioDecoderOutputBufferIndex = -1;
    private final int TIMEOUT_USEC = 2500;
    public long startTime = 0;
    public long endTime = 0;

    public AudioRecoder(MediaFormat mediaFormat, MediaExtractor mediaExtractor, int i) throws IOException {
        this.extractor = mediaExtractor;
        this.trackIndex = i;
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
        this.decoder = createDecoderByType;
        createDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
        createDecoderByType.start();
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MediaController.AUIDO_MIME_TYPE);
        this.encoder = createEncoderByType;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(MediaController.AUIDO_MIME_TYPE, mediaFormat.getInteger("sample-rate"), mediaFormat.getInteger("channel-count"));
        this.format = createAudioFormat;
        createAudioFormat.setInteger("bitrate", CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT);
        createEncoderByType.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        createEncoderByType.start();
        this.decoderInputBuffers = createDecoderByType.getInputBuffers();
        this.decoderOutputBuffers = createDecoderByType.getOutputBuffers();
        this.encoderInputBuffers = createEncoderByType.getInputBuffers();
        this.encoderOutputBuffers = createEncoderByType.getOutputBuffers();
    }

    public void release() {
        try {
            this.encoder.stop();
            this.decoder.stop();
            this.extractor.unselectTrack(this.trackIndex);
            this.extractor.release();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean step(MP4Builder mP4Builder, int i) throws Exception {
        int dequeueOutputBuffer;
        int dequeueInputBuffer;
        int dequeueOutputBuffer2;
        int dequeueInputBuffer2;
        ByteBuffer byteBuffer;
        if (!this.extractorDone && (dequeueInputBuffer2 = this.decoder.dequeueInputBuffer(2500L)) != -1) {
            if (Build.VERSION.SDK_INT >= 21) {
                byteBuffer = this.decoder.getInputBuffer(dequeueInputBuffer2);
            } else {
                byteBuffer = this.decoderInputBuffers[dequeueInputBuffer2];
            }
            int readSampleData = this.extractor.readSampleData(byteBuffer, 0);
            long sampleTime = this.extractor.getSampleTime();
            long j = this.endTime;
            if (j > 0 && sampleTime >= j) {
                this.encoderDone = true;
                this.decoderOutputBufferInfo.flags |= 4;
            }
            if (readSampleData >= 0) {
                this.decoder.queueInputBuffer(dequeueInputBuffer2, 0, readSampleData, this.extractor.getSampleTime(), this.extractor.getSampleFlags());
            }
            boolean z = !this.extractor.advance();
            this.extractorDone = z;
            if (z) {
                this.decoder.queueInputBuffer(this.decoder.dequeueInputBuffer(2500L), 0, 0, 0L, 4);
            }
        }
        if (!this.decoderDone && this.pendingAudioDecoderOutputBufferIndex == -1 && (dequeueOutputBuffer2 = this.decoder.dequeueOutputBuffer(this.decoderOutputBufferInfo, 2500L)) != -1) {
            if (dequeueOutputBuffer2 == -3) {
                this.decoderOutputBuffers = this.decoder.getOutputBuffers();
            } else if (dequeueOutputBuffer2 != -2) {
                if ((this.decoderOutputBufferInfo.flags & 2) != 0) {
                    this.decoder.releaseOutputBuffer(dequeueOutputBuffer2, false);
                } else {
                    this.pendingAudioDecoderOutputBufferIndex = dequeueOutputBuffer2;
                }
            }
        }
        if (this.pendingAudioDecoderOutputBufferIndex != -1 && (dequeueInputBuffer = this.encoder.dequeueInputBuffer(2500L)) != -1) {
            ByteBuffer byteBuffer2 = this.encoderInputBuffers[dequeueInputBuffer];
            MediaCodec.BufferInfo bufferInfo = this.decoderOutputBufferInfo;
            int i2 = bufferInfo.size;
            long j2 = bufferInfo.presentationTimeUs;
            if (i2 >= 0) {
                ByteBuffer duplicate = this.decoderOutputBuffers[this.pendingAudioDecoderOutputBufferIndex].duplicate();
                duplicate.position(this.decoderOutputBufferInfo.offset);
                duplicate.limit(this.decoderOutputBufferInfo.offset + i2);
                byteBuffer2.position(0);
                byteBuffer2.put(duplicate);
                this.encoder.queueInputBuffer(dequeueInputBuffer, 0, i2, j2, this.decoderOutputBufferInfo.flags);
            }
            this.decoder.releaseOutputBuffer(this.pendingAudioDecoderOutputBufferIndex, false);
            this.pendingAudioDecoderOutputBufferIndex = -1;
            if ((this.decoderOutputBufferInfo.flags & 4) != 0) {
                this.decoderDone = true;
            }
        }
        if (!this.encoderDone && (dequeueOutputBuffer = this.encoder.dequeueOutputBuffer(this.encoderOutputBufferInfo, 2500L)) != -1) {
            if (dequeueOutputBuffer == -3) {
                this.encoderOutputBuffers = this.encoder.getOutputBuffers();
            } else if (dequeueOutputBuffer != -2) {
                ByteBuffer byteBuffer3 = this.encoderOutputBuffers[dequeueOutputBuffer];
                MediaCodec.BufferInfo bufferInfo2 = this.encoderOutputBufferInfo;
                if ((bufferInfo2.flags & 2) != 0) {
                    this.encoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                } else {
                    if (bufferInfo2.size != 0) {
                        mP4Builder.writeSampleData(i, byteBuffer3, bufferInfo2, false);
                    }
                    if ((this.encoderOutputBufferInfo.flags & 4) != 0) {
                        this.encoderDone = true;
                    }
                    this.encoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            }
        }
        return this.encoderDone;
    }
}
