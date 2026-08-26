package org.telegram.messenger.audioinfo.mp3;

import androidx.recyclerview.widget.DiffUtil;

public final class MP3Frame$Header {
    public final int bitrate;
    public final int channelMode;
    public final int frequency;
    public final int layer;
    public final int padding;
    public final int protection;
    public final int version;
    public static final int[][] FREQUENCIES = {new int[]{11025, -1, 22050, 44100}, new int[]{12000, -1, 24000, 48000}, new int[]{8000, -1, 16000, 32000}, new int[]{-1, -1, -1, -1}};
    public static final int[][] BITRATES = {new int[]{0, 0, 0, 0, 0}, new int[]{32000, 32000, 32000, 32000, 8000}, new int[]{64000, 48000, 40000, 48000, 16000}, new int[]{96000, 56000, 48000, 56000, 24000}, new int[]{128000, 64000, 56000, 64000, 32000}, new int[]{160000, 80000, 64000, 80000, 40000}, new int[]{192000, 96000, 80000, 96000, 48000}, new int[]{224000, 112000, 96000, 112000, 56000}, new int[]{256000, 128000, 112000, 128000, 64000}, new int[]{288000, 160000, 128000, 144000, 80000}, new int[]{320000, 192000, 160000, 160000, 96000}, new int[]{352000, 224000, 192000, 176000, 112000}, new int[]{384000, 256000, 224000, 192000, 128000}, new int[]{416000, 320000, 256000, 224000, 144000}, new int[]{448000, 384000, 320000, 256000, 160000}, new int[]{-1, -1, -1, -1, -1}};
    public static final int[][] BITRATES_COLUMN = {new int[]{-1, 4, 4, 3}, new int[]{-1, -1, -1, -1}, new int[]{-1, 4, 4, 3}, new int[]{-1, 2, 1, 0}};
    public static final int[][] SIZE_COEFFICIENTS = {new int[]{-1, 72, 144, 12}, new int[]{-1, -1, -1, -1}, new int[]{-1, 72, 144, 12}, new int[]{-1, 144, 144, 12}};
    public static final int[] SLOT_SIZES = {-1, 1, 1, 4};
    public static final int[][] SIDE_INFO_SIZES = {new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{9, -1, 9, 17}};

    public MP3Frame$Header(int i, int i2, int i3) throws MP3Exception {
        int i4 = (i >> 3) & 3;
        this.version = i4;
        if (i4 == 1) {
            throw new MP3Exception("Reserved version");
        }
        int i5 = (i >> 1) & 3;
        this.layer = i5;
        if (i5 == 0) {
            throw new MP3Exception("Reserved layer");
        }
        int i6 = (i2 >> 4) & 15;
        this.bitrate = i6;
        if (i6 == 15) {
            throw new MP3Exception("Reserved bitrate");
        }
        if (i6 == 0) {
            throw new MP3Exception("Free bitrate");
        }
        int i7 = (i2 >> 2) & 3;
        this.frequency = i7;
        if (i7 == 3) {
            throw new MP3Exception("Reserved frequency");
        }
        int i8 = (i3 >> 6) & 3;
        this.channelMode = i8;
        this.padding = (i2 >> 1) & 1;
        int i9 = i & 1;
        this.protection = i9;
        int i10 = i9 != 0 ? 4 : 6;
        i10 = i5 == 1 ? i10 + SIDE_INFO_SIZES[i8][i4] : i10;
        if (getFrameSize() < i10) {
            throw new MP3Exception(DiffUtil.m(i10, "Frame size must be at least "));
        }
    }

    public final int getFrameSize() {
        int[][] iArr = SIZE_COEFFICIENTS;
        int i = this.version;
        int[] iArr2 = iArr[i];
        int i2 = this.layer;
        return (((BITRATES[this.bitrate][BITRATES_COLUMN[i][i2]] * iArr2[i2]) / FREQUENCIES[this.frequency][i]) + this.padding) * SLOT_SIZES[i2];
    }

    public final long getTotalDuration(long j) {
        long j2 = ((long) (this.layer == 3 ? 384 : 1152)) * j * 1000;
        int frameSize = getFrameSize();
        int[] iArr = FREQUENCIES[this.frequency];
        int i = this.version;
        long j3 = j2 / ((long) (iArr[i] * frameSize));
        return (i == 3 || this.channelMode != 3) ? j3 : j3 / 2;
    }
}
