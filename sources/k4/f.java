package k4;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.d0;
import e2.q;
import java.math.RoundingMode;
public final class f implements b0 {
    public final q f12282a;
    public final int f12283b;
    public final long f12284c;
    public final long d;
    public final long e;

    public f(q qVar, int i10, long j3, long j10) {
        this.f12282a = qVar;
        this.f12283b = i10;
        this.f12284c = j3;
        long j11 = (j10 - j3) / qVar.f7224c;
        this.d = j11;
        this.e = b(j11);
    }

    public final long b(long j3) {
        long j10 = j3 * this.f12283b;
        long j11 = this.f12282a.f7223b;
        String str = d0.f7188a;
        return d0.Y(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        q qVar = this.f12282a;
        long j10 = (qVar.f7223b * j3) / (this.f12283b * 1000000);
        long j11 = this.d;
        long i10 = d0.i(j10, 0L, j11 - 1);
        long j12 = this.f12284c;
        long b10 = b(i10);
        c0 c0Var = new c0(b10, (qVar.f7224c * i10) + j12);
        if (b10 < j3 && i10 != j11 - 1) {
            long j13 = i10 + 1;
            return new a0(c0Var, new c0(b(j13), (qVar.f7224c * j13) + j12));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        return this.e;
    }
}
