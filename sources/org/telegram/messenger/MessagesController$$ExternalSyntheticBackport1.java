package org.telegram.messenger;
public final class MessagesController$$ExternalSyntheticBackport1 {
    public static long m(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j2) ? j : j - j2;
        } else if (j >= 0) {
            return j % j2;
        } else {
            long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
            if ((j3 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j2)) {
                j2 = 0;
            }
            return j3 - j2;
        }
    }
}