package l4;

import j3.j2;
public final class t implements z, y {
    public final c0 f14424a;
    public final long f14425b;
    public final com.google.android.exoplayer2.upstream.r f14426c;
    public a d;
    public z f14427e;
    public y f14428f;
    public long h = -9223372036854775807L;

    public t(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        this.f14424a = c0Var;
        this.f14426c = rVar;
        this.f14425b = j10;
    }

    @Override
    public final long A(d5.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 != -9223372036854775807L && j10 == this.f14425b) {
            this.h = -9223372036854775807L;
            j11 = j12;
        } else {
            j11 = j10;
        }
        z zVar = this.f14427e;
        int i10 = f5.d0.f6579a;
        return zVar.A(rVarArr, zArr, c1VarArr, zArr2, j11);
    }

    @Override
    public final long E() {
        z zVar = this.f14427e;
        int i10 = f5.d0.f6579a;
        return zVar.E();
    }

    @Override
    public final k1 J() {
        z zVar = this.f14427e;
        int i10 = f5.d0.f6579a;
        return zVar.J();
    }

    @Override
    public final long L() {
        z zVar = this.f14427e;
        int i10 = f5.d0.f6579a;
        return zVar.L();
    }

    @Override
    public final void U(long j10) {
        z zVar = this.f14427e;
        int i10 = f5.d0.f6579a;
        zVar.U(j10);
    }

    @Override
    public final void a(e1 e1Var) {
        z zVar = (z) e1Var;
        y yVar = this.f14428f;
        int i10 = f5.d0.f6579a;
        yVar.a(this);
    }

    @Override
    public final boolean b() {
        z zVar = this.f14427e;
        if (zVar != null && zVar.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(z zVar) {
        y yVar = this.f14428f;
        int i10 = f5.d0.f6579a;
        yVar.c(this);
    }

    public final void d(c0 c0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f14425b;
        }
        a aVar = this.d;
        aVar.getClass();
        z b10 = aVar.b(c0Var, this.f14426c, j10);
        this.f14427e = b10;
        if (this.f14428f != null) {
            b10.n(this, j10);
        }
    }

    @Override
    public final long f(long j10, j2 j2Var) {
        z zVar = this.f14427e;
        int i10 = f5.d0.f6579a;
        return zVar.f(j10, j2Var);
    }

    @Override
    public final long h() {
        z zVar = this.f14427e;
        int i10 = f5.d0.f6579a;
        return zVar.h();
    }

    @Override
    public final void n(y yVar, long j10) {
        this.f14428f = yVar;
        z zVar = this.f14427e;
        if (zVar != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f14425b;
            }
            zVar.n(this, j11);
        }
    }

    @Override
    public final void o() {
        z zVar = this.f14427e;
        if (zVar != null) {
            zVar.o();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override
    public final long p(long j10) {
        z zVar = this.f14427e;
        int i10 = f5.d0.f6579a;
        return zVar.p(j10);
    }

    @Override
    public final void r(long j10) {
        z zVar = this.f14427e;
        int i10 = f5.d0.f6579a;
        zVar.r(j10);
    }

    @Override
    public final boolean s(long j10) {
        z zVar = this.f14427e;
        if (zVar != null && zVar.s(j10)) {
            return true;
        }
        return false;
    }
}
