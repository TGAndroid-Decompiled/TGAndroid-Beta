package c4;

import c2.a1;
import h5.d0;
import r3.r;
import r3.s;
import r3.t;
public final class f implements s {
    public final a1 f2255a;
    public final int f2256b;
    public final long f2257c;
    public final long d;
    public final long f2258e;

    public f(a1 a1Var, int i10, long j10, long j11) {
        this.f2255a = a1Var;
        this.f2256b = i10;
        this.f2257c = j10;
        long j12 = (j11 - j10) / a1Var.f2060c;
        this.d = j12;
        this.f2258e = d0.N(j12 * i10, 1000000L, a1Var.f2059b);
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final r f(long j10) {
        a1 a1Var = this.f2255a;
        int i10 = this.f2256b;
        long j11 = (a1Var.f2059b * j10) / (i10 * 1000000);
        long j12 = this.d - 1;
        long i11 = d0.i(j11, 0L, j12);
        int i12 = a1Var.f2060c;
        long j13 = this.f2257c;
        long N = d0.N(i11 * i10, 1000000L, a1Var.f2059b);
        t tVar = new t(N, (i12 * i11) + j13);
        if (N < j10 && i11 != j12) {
            long j14 = i11 + 1;
            return new r(tVar, new t(d0.N(j14 * i10, 1000000L, a1Var.f2059b), (i12 * j14) + j13));
        }
        return new r(tVar, tVar);
    }

    @Override
    public final long g() {
        return this.f2258e;
    }
}
