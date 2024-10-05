package org.telegram.messenger.video;

public class AudioConversions {
    private static final int BYTES_PER_SAMPLE_PER_CHANNEL = 2;
    private static final int BYTES_PER_SHORT = 2;
    private static final long MICROSECONDS_PER_SECOND = 1000000;

    public static long bytesToUs(int i, int i2, int i3) {
        return (i * 1000000) / ((i2 * 2) * i3);
    }

    public static long shortsToUs(int i, int i2, int i3) {
        return bytesToUs(i * 2, i2, i3);
    }

    public static int usToBytes(long j, int i, int i2) {
        double d = j;
        double d2 = i * 2 * i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (int) Math.ceil((d * d2) / 1000000.0d);
    }

    public static int usToShorts(long j, int i, int i2) {
        return usToBytes(j, i, i2) / 2;
    }
}
