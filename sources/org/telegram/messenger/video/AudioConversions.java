package org.telegram.messenger.video;

public class AudioConversions {
    private static final int BYTES_PER_SAMPLE_PER_CHANNEL = 2;
    private static final int BYTES_PER_SHORT = 2;
    private static final long MICROSECONDS_PER_SECOND = 1000000;

    public static long bytesToUs(int i10, int i11, int i12) {
        return (((long) i10) * 1000000) / ((long) ((i11 * 2) * i12));
    }

    public static long shortsToUs(int i10, int i11, int i12) {
        return bytesToUs(i10 * 2, i11, i12);
    }

    public static int usToBytes(long j10, int i10, int i11) {
        return (int) Math.ceil((j10 * ((double) ((i10 * 2) * i11))) / 1000000.0d);
    }

    public static int usToShorts(long j10, int i10, int i11) {
        return usToBytes(j10, i10, i11) / 2;
    }
}
