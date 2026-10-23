package k4;

import c3.d0;
import c3.e0;
import c3.f0;
import e2.m0;
import f2.u;
import java.math.RoundingMode;
public final class f implements e0 {
    public final u f14946a;
    public final int f14947b;
    public final long f14948c;
    public final long d;
    public final long e;

    public f(u uVar, int i10, long j10, long j11) {
        this.f14946a = uVar;
        this.f14947b = i10;
        this.f14948c = j10;
        long j12 = (j11 - j10) / uVar.f10371c;
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
    public final d0 f(long j10) {
        u uVar = this.f14946a;
        long j11 = (uVar.f10370b * j10) / (this.f14947b * 1000000);
        long j12 = this.d;
        long j13 = m0.j(j11, 0L, j12 - 1);
        long j14 = this.f14948c;
        long i10 = i(j13);
        f0 f0Var = new f0(i10, (uVar.f10371c * j13) + j14);
        if (i10 < j10 && j13 != j12 - 1) {
            long j15 = j13 + 1;
            return new d0(f0Var, new f0(i(j15), (uVar.f10371c * j15) + j14));
        }
        return new d0(f0Var, f0Var);
    }

    @Override
    public final long h() {
        return this.e;
    }

    public final long i(long j10) {
        long j11 = j10 * this.f14947b;
        long j12 = this.f14946a.f10370b;
        String str = m0.f8259a;
        return m0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
    }
}
