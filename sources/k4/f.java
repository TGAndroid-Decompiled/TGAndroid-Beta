package k4;

import c3.b0;
import c3.c0;
import c3.d0;
import e2.m0;
import f2.u;
import java.math.RoundingMode;
public final class f implements c0 {
    public final u f14902a;
    public final int f14903b;
    public final long f14904c;
    public final long d;
    public final long e;

    public f(u uVar, int i10, long j10, long j11) {
        this.f14902a = uVar;
        this.f14903b = i10;
        this.f14904c = j10;
        long j12 = (j11 - j10) / uVar.f10356c;
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
    public final b0 f(long j10) {
        u uVar = this.f14902a;
        long j11 = (uVar.f10355b * j10) / (this.f14903b * 1000000);
        long j12 = this.d;
        long j13 = m0.j(j11, 0L, j12 - 1);
        long j14 = this.f14904c;
        long i10 = i(j13);
        d0 d0Var = new d0(i10, (uVar.f10356c * j13) + j14);
        if (i10 < j10 && j13 != j12 - 1) {
            long j15 = j13 + 1;
            return new b0(d0Var, new d0(i(j15), (uVar.f10356c * j15) + j14));
        }
        return new b0(d0Var, d0Var);
    }

    @Override
    public final long h() {
        return this.e;
    }

    public final long i(long j10) {
        long j11 = j10 * this.f14903b;
        long j12 = this.f14902a.f10355b;
        String str = m0.f8254a;
        return m0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
    }
}
