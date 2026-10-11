package k4;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.d0;
import e2.q;
import java.math.RoundingMode;
public final class f implements b0 {
    public final q f14625a;
    public final int f14626b;
    public final long f14627c;
    public final long d;
    public final long f14628e;

    public f(q qVar, int i10, long j3, long j10) {
        this.f14625a = qVar;
        this.f14626b = i10;
        this.f14627c = j3;
        long j11 = (j10 - j3) / qVar.f8570c;
        this.d = j11;
        this.f14628e = a(j11);
    }

    public final long a(long j3) {
        long j10 = j3 * this.f14626b;
        long j11 = this.f14625a.f8569b;
        String str = d0.f8531a;
        return d0.X(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        q qVar = this.f14625a;
        long j10 = (qVar.f8569b * j3) / (this.f14626b * 1000000);
        long j11 = this.d;
        long i10 = d0.i(j10, 0L, j11 - 1);
        long j12 = this.f14627c;
        long a2 = a(i10);
        c0 c0Var = new c0(a2, (qVar.f8570c * i10) + j12);
        if (a2 < j3 && i10 != j11 - 1) {
            long j13 = i10 + 1;
            return new a0(c0Var, new c0(a(j13), (qVar.f8570c * j13) + j12));
        }
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        return this.f14628e;
    }
}
