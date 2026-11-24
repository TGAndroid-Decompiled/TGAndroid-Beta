package defpackage;

import java.util.concurrent.TimeUnit;
public abstract class wge {
    public static final long a(long j) {
        long j2 = (j << 1) + 1;
        int i = ts3.d;
        int i2 = vs3.a;
        return j2;
    }

    public static final long b(long j) {
        long j2 = j << 1;
        int i = ts3.d;
        int i2 = vs3.a;
        return j2;
    }

    public static final long c(int i, xs3 xs3Var) {
        if (xs3Var.compareTo(xs3.SECONDS) <= 0) {
            return b(TimeUnit.NANOSECONDS.convert(i, xs3Var.a));
        }
        return d(i, xs3Var);
    }

    public static final long d(long r5, defpackage.xs3 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wge.d(long, xs3):long");
    }
}
