package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
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

    public MediaCodecPlayer(String str, Surface surface) throws IOException {
        MediaFormat trackFormat;
        this.outputSurface = surface;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.extractor = mediaExtractor;
        mediaExtractor.setDataSource(str);
        int i = 0;
        while (true) {
            if (i >= this.extractor.getTrackCount()) {
                trackFormat = null;
                i = -1;
                break;
            } else {
                trackFormat = this.extractor.getTrackFormat(i);
                if (trackFormat.getString("mime").startsWith("video/")) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (i == -1 || trackFormat == null) {
            throw new IllegalArgumentException("No video track found in file.");
        }
        this.extractor.selectTrack(i);
        this.w = trackFormat.getInteger("width");
        this.h = trackFormat.getInteger("height");
        if (trackFormat.containsKey("rotation-degrees")) {
            this.o = trackFormat.getInteger("rotation-degrees");
        } else {
            this.o = 0;
        }
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
        this.codec = mediaCodecCreateDecoderByType;
        mediaCodecCreateDecoderByType.configure(trackFormat, surface, (MediaCrypto) null, 0);
        mediaCodecCreateDecoderByType.start();
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
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(10000L);
            if (iDequeueInputBuffer >= 0 && (inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer)) != null) {
                int sampleData = this.extractor.readSampleData(inputBuffer, 0);
                if (sampleData > 0) {
                    this.codec.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.extractor.getSampleTime(), this.extractor.getSampleFlags());
                    this.extractor.advance();
                } else {
                    this.codec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    release();
                    return false;
                }
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer >= 0) {
                long j3 = bufferInfo.presentationTimeUs;
                if (j3 >= j2 - 16000) {
                    this.lastPositionUs = j3;
                    this.codec.releaseOutputBuffer(iDequeueOutputBuffer, true);
                    return true;
                }
                this.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
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
