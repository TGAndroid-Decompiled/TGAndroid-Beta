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
    private final int o;
    private final Surface outputSurface;
    private final int w;
    private boolean first = true;
    private long lastPositionUs = 0;

    public MediaCodecPlayer(String str, Surface surface) {
        MediaFormat mediaFormat;
        this.outputSurface = surface;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.extractor = mediaExtractor;
        mediaExtractor.setDataSource(str);
        int i = 0;
        while (true) {
            if (i >= this.extractor.getTrackCount()) {
                mediaFormat = null;
                i = -1;
                break;
            } else {
                mediaFormat = this.extractor.getTrackFormat(i);
                if (mediaFormat.getString("mime").startsWith("video/")) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (i == -1 || mediaFormat == null) {
            throw new IllegalArgumentException("No video track found in file.");
        }
        this.extractor.selectTrack(i);
        this.w = mediaFormat.getInteger("width");
        this.h = mediaFormat.getInteger("height");
        if (mediaFormat.containsKey("rotation-degrees")) {
            this.o = mediaFormat.getInteger("rotation-degrees");
        } else {
            this.o = 0;
        }
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
        this.codec = createDecoderByType;
        createDecoderByType.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        createDecoderByType.start();
    }

    public int getWidth() {
        return this.w;
    }

    public int getOrientedWidth() {
        return (this.o / 90) % 2 == 1 ? this.h : this.w;
    }

    public int getHeight() {
        return this.h;
    }

    public int getOrientedHeight() {
        return (this.o / 90) % 2 == 1 ? this.w : this.h;
    }

    public int getOrientation() {
        return this.o;
    }

    public boolean ensure(long j) {
        ByteBuffer inputBuffer;
        if (this.done) {
            return false;
        }
        boolean z = this.first;
        this.first = false;
        long j2 = j * 1000;
        if (!z && j2 <= this.lastPositionUs) {
            return false;
        }
        if (this.extractor.getSampleTime() > j2 || (z && j2 > 1000000)) {
            this.extractor.seekTo(j2, 0);
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
                long j3 = bufferInfo.presentationTimeUs;
                if (j3 >= j2 - 16000) {
                    this.lastPositionUs = j3;
                    this.codec.releaseOutputBuffer(dequeueOutputBuffer, true);
                    return true;
                }
                this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
        }
    }

    public void release() {
        if (this.done) {
            return;
        }
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
