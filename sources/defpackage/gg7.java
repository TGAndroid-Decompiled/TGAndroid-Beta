package defpackage;

import android.util.Pair;
public final class gg7 implements nx9 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public gg7(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? hac.T(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair i(long j, long[] jArr, long[] jArr2) {
        double d;
        int f = hac.f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override
    public final long a() {
        return -1L;
    }

    @Override
    public final long b() {
        return 0L;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final long e(long j) {
        return hac.T(((Long) i(j, this.a, this.b).second).longValue());
    }

    @Override
    public final hx9 f(long j) {
        Pair i = i(hac.i0(hac.j(j, 0L, this.c)), this.b, this.a);
        kx9 kx9Var = new kx9(hac.T(((Long) i.first).longValue()), ((Long) i.second).longValue());
        return new hx9(kx9Var, kx9Var);
    }

    @Override
    public final int g() {
        return -2147483647;
    }

    @Override
    public final long h() {
        return this.c;
    }
}
