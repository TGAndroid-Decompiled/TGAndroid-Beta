package o4;

import j3.h2;
public final class n implements t, s {
    public final v f16384a;
    public final long f16385b;
    public final g5.q f16386c;
    public a d;
    public t e;
    public s f16387f;
    public long h = -9223372036854775807L;

    public n(v vVar, g5.q qVar, long j10) {
        this.f16384a = vVar;
        this.f16386c = qVar;
        this.f16385b = j10;
    }

    @Override
    public final void B(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.f6937a;
        tVar.B(j10);
    }

    @Override
    public final boolean C(long j10) {
        t tVar = this.e;
        if (tVar != null && tVar.C(j10)) {
            return true;
        }
        return false;
    }

    @Override
    public final long K() {
        t tVar = this.e;
        int i10 = h5.d0.f6937a;
        return tVar.K();
    }

    @Override
    public final t0 V() {
        t tVar = this.e;
        int i10 = h5.d0.f6937a;
        return tVar.V();
    }

    @Override
    public final long X() {
        t tVar = this.e;
        int i10 = h5.d0.f6937a;
        return tVar.X();
    }

    @Override
    public final void Z(n0 n0Var) {
        t tVar = (t) n0Var;
        s sVar = this.f16387f;
        int i10 = h5.d0.f6937a;
        sVar.Z(this);
    }

    public final void a(v vVar) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f16385b;
        }
        a aVar = this.d;
        aVar.getClass();
        t b10 = aVar.b(vVar, this.f16386c, j10);
        this.e = b10;
        if (this.f16387f != null) {
            b10.p(this, j10);
        }
    }

    @Override
    public final boolean b() {
        t tVar = this.e;
        if (tVar != null && tVar.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final void f0(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.f6937a;
        tVar.f0(j10);
    }

    @Override
    public final long h(long j10, h2 h2Var) {
        t tVar = this.e;
        int i10 = h5.d0.f6937a;
        return tVar.h(j10, h2Var);
    }

    @Override
    public final long l() {
        t tVar = this.e;
        int i10 = h5.d0.f6937a;
        return tVar.l();
    }

    @Override
    public final void n(t tVar) {
        s sVar = this.f16387f;
        int i10 = h5.d0.f6937a;
        sVar.n(this);
    }

    @Override
    public final void p(s sVar, long j10) {
        this.f16387f = sVar;
        t tVar = this.e;
        if (tVar != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f16385b;
            }
            tVar.p(this, j11);
        }
    }

    @Override
    public final long v(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 != -9223372036854775807L && j10 == this.f16385b) {
            this.h = -9223372036854775807L;
            j11 = j12;
        } else {
            j11 = j10;
        }
        t tVar = this.e;
        int i10 = h5.d0.f6937a;
        return tVar.v(cVarArr, zArr, l0VarArr, zArr2, j11);
    }

    @Override
    public final void x() {
        t tVar = this.e;
        if (tVar != null) {
            tVar.x();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override
    public final long z(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.f6937a;
        return tVar.z(j10);
    }
}
