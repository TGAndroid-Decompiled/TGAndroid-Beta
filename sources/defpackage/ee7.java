package defpackage;

import android.util.Pair;
public final class ee7 implements kv9 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public ee7(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? g8c.T(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair i(long j, long[] jArr, long[] jArr2) {
        double d;
        int f = g8c.f(jArr, j, true);
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
        return g8c.T(((Long) i(j, this.a, this.b).second).longValue());
    }

    @Override
    public final ev9 f(long j) {
        Pair i = i(g8c.i0(g8c.j(j, 0L, this.c)), this.b, this.a);
        hv9 hv9Var = new hv9(g8c.T(((Long) i.first).longValue()), ((Long) i.second).longValue());
        return new ev9(hv9Var, hv9Var);
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
