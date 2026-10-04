package k4;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.d0;
import e2.q;
import java.math.RoundingMode;
public final class f implements b0 {
    public final q f14593a;
    public final int f14594b;
    public final long f14595c;
    public final long d;
    public final long f14596e;

    public f(q qVar, int i10, long j3, long j10) {
        this.f14593a = qVar;
        this.f14594b = i10;
        this.f14595c = j3;
        long j11 = (j10 - j3) / qVar.f8576c;
        this.d = j11;
        this.f14596e = b(j11);
    }

    public final long b(long j3) {
        long j10 = j3 * this.f14594b;
        long j11 = this.f14593a.f8575b;
        String str = d0.f8537a;
        return d0.Y(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        q qVar = this.f14593a;
        long j10 = (qVar.f8575b * j3) / (this.f14594b * 1000000);
        long j11 = this.d;
        long i10 = d0.i(j10, 0L, j11 - 1);
        long j12 = this.f14595c;
        long b10 = b(i10);
        c0 c0Var = new c0(b10, (qVar.f8576c * i10) + j12);
        if (b10 < j3 && i10 != j11 - 1) {
            long j13 = i10 + 1;
            return new a0(c0Var, new c0(b(j13), (qVar.f8576c * j13) + j12));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        return this.f14596e;
    }
}
