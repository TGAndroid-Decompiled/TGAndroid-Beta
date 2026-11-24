package defpackage;

import android.os.SystemClock;
import org.telegram.messenger.a;
public abstract class yp3 {
    public static double a;
    public static long b;
    public static final int[] c = new int[0];
    public static final long[] d = new long[0];
    public static final Object[] e = new Object[0];

    public static final int a(int i, int i2, int[] iArr) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 > i2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }

    public static final int b(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 > 0) {
                i2 = i4 - 1;
            } else {
                return i4;
            }
        }
        return ~i3;
    }

    public static synchronized long c() {
        synchronized (yp3.class) {
            if (b != 0 && SystemClock.elapsedRealtime() - b <= 60000) {
                return (long) a;
            }
            return s93.d(a.b).b();
        }
    }

    public static boolean d() {
        if (c() >= 3000000) {
            return true;
        }
        return false;
    }
}
