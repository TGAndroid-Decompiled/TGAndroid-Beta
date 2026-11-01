package k4;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.l0;
import f2.u;
import java.math.RoundingMode;
public final class f implements b0 {
    public final u f10864a;
    public final int f10865b;
    public final long f10866c;
    public final long d;
    public final long e;

    public f(u uVar, int i10, long j10, long j11) {
        this.f10864a = uVar;
        this.f10865b = i10;
        this.f10866c = j10;
        long j12 = (j11 - j10) / uVar.f6803c;
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
        u uVar = this.f10864a;
        long j11 = (uVar.f6802b * j10) / (this.f10865b * 1000000);
        long j12 = this.d;
        long j13 = l0.j(j11, 0L, j12 - 1);
        long j14 = this.f10866c;
        long i10 = i(j13);
        c0 c0Var = new c0(i10, (uVar.f6803c * j13) + j14);
        if (i10 < j10 && j13 != j12 - 1) {
            long j15 = j13 + 1;
            return new a0(c0Var, new c0(i(j15), (uVar.f6803c * j15) + j14));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.e;
    }

    public final long i(long j10) {
        long j11 = j10 * this.f10865b;
        long j12 = this.f10864a.f6802b;
        String str = l0.f6165a;
        return l0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
    }
}
