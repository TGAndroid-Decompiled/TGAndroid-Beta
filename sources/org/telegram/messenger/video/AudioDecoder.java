package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;
import org.telegram.messenger.FileLog;
public class AudioDecoder {
    private static final int TIMEOUT_USEC = 0;
    private boolean allInputExtracted;
    private int audioIndex;
    private MediaCodec decoder;
    private boolean decodingDone;
    private long endTimeUs;
    private final MediaExtractor extractor;
    private boolean loopingEnabled;
    private long startTimeUs;
    private int trackIndex;

    public static class DecodedBufferData {
        public ByteBuffer byteBuffer = null;
        public int index = -1;
        public int size = 0;
        public long presentationTimeUs = 0;
        public int flags = 0;
        public int offset = 0;
    }

    public AudioDecoder(String str) {
        this.audioIndex = -1;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.extractor = mediaExtractor;
        mediaExtractor.setDataSource(str);
        init();
    }

    private void init() {
        selectTrack();
        MediaFormat trackFormat = this.extractor.getTrackFormat(this.trackIndex);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
        this.decoder = createDecoderByType;
        createDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
        this.startTimeUs = 0L;
        try {
            this.endTimeUs = this.extractor.getTrackFormat(this.trackIndex).getLong("durationUs");
        } catch (Exception e7) {
            FileLog.e(e7);
            this.endTimeUs = -1L;
        }
    }

    private void selectTrack() {
        int i10 = this.audioIndex;
        this.trackIndex = i10;
        if (i10 == -1) {
            int trackCount = this.extractor.getTrackCount();
            int i11 = 0;
            while (true) {
                if (i11 < trackCount) {
                    String string = this.extractor.getTrackFormat(i11).getString("mime");
                    if (string != null && string.startsWith("audio/")) {
                        this.trackIndex = i11;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
        }
        int i12 = this.trackIndex;
        if (i12 >= 0) {
            this.extractor.selectTrack(i12);
            return;
        }
        throw new RuntimeException("No audio track found in source");
    }

    public DecodedBufferData decode() {
        int usToBytes;
        int limit;
        int dequeueInputBuffer;
        DecodedBufferData decodedBufferData = new DecodedBufferData();
        boolean z10 = false;
        while (!z10 && !this.decodingDone) {
            if (!this.allInputExtracted && (dequeueInputBuffer = this.decoder.dequeueInputBuffer(0L)) >= 0) {
                int readSampleData = this.extractor.readSampleData(this.decoder.getInputBuffer(dequeueInputBuffer), 0);
                if (readSampleData >= 0 && this.extractor.getSampleTime() <= this.endTimeUs) {
                    this.decoder.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.extractor.getSampleTime(), this.extractor.getSampleFlags());
                    this.extractor.advance();
                } else if (this.loopingEnabled) {
                    this.decoder.flush();
                    this.extractor.seekTo(this.startTimeUs, 0);
                } else {
                    this.decoder.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                    this.allInputExtracted = true;
                }
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.decoder.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer >= 0) {
                decodedBufferData.byteBuffer = this.decoder.getOutputBuffer(dequeueOutputBuffer);
                decodedBufferData.index = dequeueOutputBuffer;
                decodedBufferData.size = bufferInfo.size;
                long j3 = bufferInfo.presentationTimeUs;
                decodedBufferData.presentationTimeUs = j3;
                decodedBufferData.flags = bufferInfo.flags;
                decodedBufferData.offset = bufferInfo.offset;
                long j10 = this.startTimeUs;
                if (j3 < j10) {
                    int position = decodedBufferData.byteBuffer.position() + AudioConversions.usToBytes(j10 - j3, getSampleRate(), getChannelCount());
                    if (position <= decodedBufferData.byteBuffer.limit()) {
                        decodedBufferData.byteBuffer.position(position);
                    }
                }
                long bytesToUs = AudioConversions.bytesToUs(decodedBufferData.size, getSampleRate(), getChannelCount()) + decodedBufferData.presentationTimeUs;
                long j11 = this.endTimeUs;
                if (bytesToUs > j11 && (usToBytes = AudioConversions.usToBytes(bytesToUs - j11, getSampleRate(), getChannelCount())) > 0 && (limit = decodedBufferData.byteBuffer.limit() - usToBytes) >= decodedBufferData.byteBuffer.position()) {
                    decodedBufferData.byteBuffer.limit(limit);
                }
                if ((bufferInfo.flags & 4) != 0) {
                    this.decodingDone = true;
                }
                if (decodedBufferData.byteBuffer.remaining() > 0) {
                    z10 = true;
                }
            }
        }
        return decodedBufferData;
    }

    public int getBitrateRate() {
        try {
            try {
                return getOutputMediaFormat().getInteger("bitrate");
            } catch (Exception unused) {
                return getInputMediaFormat().getInteger("bitrate");
            }
        } catch (Exception unused2) {
            return -1;
        }
    }

    public int getChannelCount() {
        try {
            return getOutputMediaFormat().getInteger("channel-count");
        } catch (Exception e7) {
            FileLog.e(e7);
            try {
                return getInputMediaFormat().getInteger("channel-count");
            } catch (Exception e10) {
                FileLog.e(e10);
                return -1;
            }
        }
    }

    public long getDurationUs() {
        try {
            return getOutputMediaFormat().getLong("durationUs");
        } catch (Exception e7) {
            FileLog.e(e7);
            try {
                return getInputMediaFormat().getLong("durationUs");
            } catch (Exception e10) {
                FileLog.e(e10);
                return -1L;
            }
        }
    }

    public long getEndTimeUs() {
        return this.endTimeUs;
    }

    public MediaFormat getInputMediaFormat() {
        try {
            return this.extractor.getTrackFormat(this.trackIndex);
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public MediaFormat getMediaFormat() {
        try {
            if (getOutputMediaFormat() != null) {
                return getOutputMediaFormat();
            }
            return getInputMediaFormat();
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public MediaFormat getOutputMediaFormat() {
        try {
            return this.decoder.getOutputFormat();
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public int getSampleRate() {
        try {
            return getOutputMediaFormat().getInteger("sample-rate");
        } catch (Exception e7) {
            FileLog.e(e7);
            try {
                return getInputMediaFormat().getInteger("sample-rate");
            } catch (Exception e10) {
                FileLog.e(e10);
                return -1;
            }
        }
    }

    public long getStartTimeUs() {
        return this.startTimeUs;
    }

    public boolean isDecodingDone() {
        return this.decodingDone;
    }

    public boolean isLoopingEnabled() {
        return this.loopingEnabled;
    }

    public void release() {
        stop();
        this.decoder.release();
        this.extractor.release();
    }

    public void releaseOutputBuffer(int i10) {
        this.decoder.releaseOutputBuffer(i10, false);
    }

    public void setEndTimeUs(long j3) {
        this.endTimeUs = j3;
        long durationUs = getDurationUs();
        if (j3 < 0) {
            this.endTimeUs = 0L;
        } else if (j3 > durationUs) {
            this.endTimeUs = durationUs;
        }
    }

    public void setLoopingEnabled(boolean z10) {
        this.loopingEnabled = z10;
    }

    public void setStartTimeUs(long j3) {
        this.startTimeUs = j3;
        long durationUs = getDurationUs();
        if (j3 < 0) {
            this.startTimeUs = 0L;
        } else if (j3 > durationUs) {
            this.startTimeUs = durationUs;
        }
    }

    public void start() {
        long j3 = this.startTimeUs;
        if (j3 <= this.endTimeUs) {
            this.extractor.seekTo(j3, 0);
            this.decoder.start();
            this.allInputExtracted = false;
            this.decodingDone = false;
            return;
        }
        StringBuilder sb2 = new StringBuilder("StartTimeUs(");
        sb2.append(this.startTimeUs);
        sb2.append(") must be less than or equal to EndTimeUs(");
        throw new RuntimeException(a4.a.r(sb2, this.endTimeUs, ")"));
    }

    public void stop() {
        this.decoder.stop();
        this.decodingDone = true;
    }

    public AudioDecoder(String str, int i10) {
        this.audioIndex = -1;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.extractor = mediaExtractor;
        mediaExtractor.setDataSource(str);
        this.audioIndex = i10;
        init();
    }
}
