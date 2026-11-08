package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;
public class MediaCodecPlayer {
    private final MediaCodec codec;
    private boolean done;
    private final MediaExtractor extractor;
    private final int h;
    private final int f25992o;
    private final Surface outputSurface;
    private final int f25993w;
    private boolean first = true;
    private long lastPositionUs = 0;

    public MediaCodecPlayer(String str, Surface surface) {
        MediaFormat mediaFormat;
        this.outputSurface = surface;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.extractor = mediaExtractor;
        mediaExtractor.setDataSource(str);
        int i7 = 0;
        while (true) {
            if (i7 < this.extractor.getTrackCount()) {
                mediaFormat = this.extractor.getTrackFormat(i7);
                if (mediaFormat.getString("mime").startsWith("video/")) {
                    break;
                }
                i7++;
            } else {
                mediaFormat = null;
                i7 = -1;
                break;
            }
        }
        if (i7 != -1 && mediaFormat != null) {
            this.extractor.selectTrack(i7);
            this.f25993w = mediaFormat.getInteger("width");
            this.h = mediaFormat.getInteger("height");
            if (mediaFormat.containsKey("rotation-degrees")) {
                this.f25992o = mediaFormat.getInteger("rotation-degrees");
            } else {
                this.f25992o = 0;
            }
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
            this.codec = createDecoderByType;
            createDecoderByType.configure(mediaFormat, surface, (MediaCrypto) null, 0);
            createDecoderByType.start();
            return;
        }
        throw new IllegalArgumentException("No video track found in file.");
    }

    public boolean ensure(long j3) {
        ByteBuffer inputBuffer;
        if (this.done) {
            return false;
        }
        boolean z9 = this.first;
        this.first = false;
        long j10 = j3 * 1000;
        if (!z9 && j10 <= this.lastPositionUs) {
            return false;
        }
        if (this.extractor.getSampleTime() > j10 || (z9 && j10 > 1000000)) {
            this.extractor.seekTo(j10, 0);
        }
        while (true) {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(10000L);
            if (dequeueInputBuffer >= 0 && (inputBuffer = this.codec.getInputBuffer(dequeueInputBuffer)) != null) {
                int readSampleData = this.extractor.readSampleData(inputBuffer, 0);
                if (readSampleData > 0) {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.extractor.getSampleTime(), this.extractor.getSampleFlags());
                    this.extractor.advance();
                } else {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                    release();
                    return false;
                }
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 10000L);
            if (dequeueOutputBuffer >= 0) {
                long j11 = bufferInfo.presentationTimeUs;
                if (j11 >= j10 - 16000) {
                    this.lastPositionUs = j11;
                    this.codec.releaseOutputBuffer(dequeueOutputBuffer, true);
                    return true;
                }
                this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
        }
    }

    public int getHeight() {
        return this.h;
    }

    public int getOrientation() {
        return this.f25992o;
    }

    public int getOrientedHeight() {
        if ((this.f25992o / 90) % 2 == 1) {
            return this.f25993w;
        }
        return this.h;
    }

    public int getOrientedWidth() {
        if ((this.f25992o / 90) % 2 == 1) {
            return this.h;
        }
        return this.f25993w;
    }

    public int getWidth() {
        return this.f25993w;
    }

    public void release() {
        if (!this.done) {
            this.done = true;
            MediaCodec mediaCodec = this.codec;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.codec.release();
            }
            MediaExtractor mediaExtractor = this.extractor;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
        }
    }
}
