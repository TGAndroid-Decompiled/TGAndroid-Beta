package k4;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.n0;
import f2.u;
import java.math.RoundingMode;
public final class f implements b0 {
    public final u f16380a;
    public final int f16381b;
    public final long f16382c;
    public final long d;
    public final long e;

    public f(u uVar, int i10, long j10, long j11) {
        this.f16380a = uVar;
        this.f16381b = i10;
        this.f16382c = j10;
        long j12 = (j11 - j10) / uVar.f10129c;
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
        u uVar = this.f16380a;
        long j11 = (uVar.f10128b * j10) / (this.f16381b * 1000000);
        long j12 = this.d;
        long j13 = n0.j(j11, 0L, j12 - 1);
        long j14 = this.f16382c;
        long i10 = i(j13);
        c0 c0Var = new c0(i10, (uVar.f10129c * j13) + j14);
        if (i10 < j10 && j13 != j12 - 1) {
            long j15 = j13 + 1;
            return new a0(c0Var, new c0(i(j15), (uVar.f10129c * j15) + j14));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.e;
    }

    public final long i(long j10) {
        long j11 = j10 * this.f16381b;
        long j12 = this.f16380a.f10128b;
        String str = n0.f9691a;
        return n0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
    }
}
