package k4;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.m0;
import f2.t;
import java.math.RoundingMode;
public final class f implements b0 {
    public final t f14099a;
    public final int f14100b;
    public final long f14101c;
    public final long d;
    public final long e;

    public f(t tVar, int i10, long j10, long j11) {
        this.f14099a = tVar;
        this.f14100b = i10;
        this.f14101c = j10;
        long j12 = (j11 - j10) / tVar.f8911c;
        this.d = j12;
        this.e = i(j12);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final a0 f(long j10) {
        t tVar = this.f14099a;
        long j11 = (tVar.f8910b * j10) / (this.f14100b * 1000000);
        long j12 = this.d;
        long j13 = m0.j(j11, 0L, j12 - 1);
        long j14 = this.f14101c;
        long i10 = i(j13);
        c0 c0Var = new c0(i10, (tVar.f8911c * j13) + j14);
        if (i10 < j10 && j13 != j12 - 1) {
            long j15 = j13 + 1;
            return new a0(c0Var, new c0(i(j15), (tVar.f8911c * j15) + j14));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.e;
    }

    public final long i(long j10) {
        long j11 = j10 * this.f14100b;
        long j12 = this.f14099a.f8910b;
        String str = m0.f8375a;
        return m0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
    }
}
