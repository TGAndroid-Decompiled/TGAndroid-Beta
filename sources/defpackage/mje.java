package defpackage;

import java.util.concurrent.TimeUnit;
public abstract class mje {
    public static final long a(long j) {
        long j2 = (j << 1) + 1;
        int i = bs3.d;
        int i2 = ds3.a;
        return j2;
    }

    public static final long b(long j) {
        long j2 = j << 1;
        int i = bs3.d;
        int i2 = ds3.a;
        return j2;
    }

    public static final long c(int i, fs3 fs3Var) {
        if (fs3Var.compareTo(fs3.SECONDS) <= 0) {
            return b(TimeUnit.NANOSECONDS.convert(i, fs3Var.a));
        }
        return d(i, fs3Var);
    }

    public static final long d(long r5, defpackage.fs3 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mje.d(long, fs3):long");
    }
}
