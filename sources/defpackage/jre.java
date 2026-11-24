package defpackage;

import java.math.RoundingMode;
public abstract class jre {
    public static int a(long j, long j2) {
        if (j > 0 && j2 > 0) {
            long b0 = hac.b0(j, 8000000L, j2, RoundingMode.HALF_UP);
            if (b0 > 0 && b0 <= 2147483647L) {
                return (int) b0;
            }
        }
        return -2147483647;
    }
}
