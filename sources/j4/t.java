package j4;

import h3.j2;

public final class t implements z, y {

    public final c0 f12667a;

    public final long f12668b;

    public final com.google.android.exoplayer2.upstream.r f12669c;
    public a d;

    public z f12670e;

    public y f12671f;
    public long h = -9223372036854775807L;

    public t(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        this.f12667a = c0Var;
        this.f12669c = rVar;
        this.f12668b = j10;
    }

    @Override
    public final long B(long j10, j2 j2Var) {
        z zVar = this.f12670e;
        int i10 = d5.g0.f4795a;
        return zVar.B(j10, j2Var);
    }

    @Override
    public final long D() {
        z zVar = this.f12670e;
        int i10 = d5.g0.f4795a;
        return zVar.D();
    }

    @Override
    public final void E(y yVar, long j10) {
        this.f12671f = yVar;
        z zVar = this.f12670e;
        if (zVar != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f12668b;
            }
            zVar.E(this, j11);
        }
    }

    @Override
    public final long F(b5.s[] sVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 == -9223372036854775807L || j10 != this.f12668b) {
            j11 = j10;
        } else {
            this.h = -9223372036854775807L;
            j11 = j12;
        }
        z zVar = this.f12670e;
        int i10 = d5.g0.f4795a;
        return zVar.F(sVarArr, zArr, b1VarArr, zArr2, j11);
    }

    @Override
    public final void I(long j10) {
        z zVar = this.f12670e;
        int i10 = d5.g0.f4795a;
        zVar.I(j10);
    }

    @Override
    public final void a(d1 d1Var) {
        y yVar = this.f12671f;
        int i10 = d5.g0.f4795a;
        yVar.a(this);
    }

    @Override
    public final boolean b() {
        z zVar = this.f12670e;
        return zVar != null && zVar.b();
    }

    public final void c(c0 c0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f12668b;
        }
        a aVar = this.d;
        aVar.getClass();
        z zVarB = aVar.b(c0Var, this.f12669c, j10);
        this.f12670e = zVarB;
        if (this.f12671f != null) {
            zVarB.E(this, j10);
        }
    }

    @Override
    public final void e(z zVar) {
        y yVar = this.f12671f;
        int i10 = d5.g0.f4795a;
        yVar.e(this);
    }

    @Override
    public final long g() {
        z zVar = this.f12670e;
        int i10 = d5.g0.f4795a;
        return zVar.g();
    }

    @Override
    public final void m() {
        z zVar = this.f12670e;
        if (zVar != null) {
            zVar.m();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override
    public final long o(long j10) {
        z zVar = this.f12670e;
        int i10 = d5.g0.f4795a;
        return zVar.o(j10);
    }

    @Override
    public final void p(long j10) {
        z zVar = this.f12670e;
        int i10 = d5.g0.f4795a;
        zVar.p(j10);
    }

    @Override
    public final boolean q(long j10) {
        z zVar = this.f12670e;
        return zVar != null && zVar.q(j10);
    }

    @Override
    public final long w() {
        z zVar = this.f12670e;
        int i10 = d5.g0.f4795a;
        return zVar.w();
    }

    @Override
    public final j1 z() {
        z zVar = this.f12670e;
        int i10 = d5.g0.f4795a;
        return zVar.z();
    }
}
