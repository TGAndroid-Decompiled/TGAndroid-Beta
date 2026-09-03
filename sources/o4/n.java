package o4;

import j3.h2;
public final class n implements t, s {
    public final v f16535a;
    public final long f16536b;
    public final g5.q f16537c;
    public a d;
    public t f16538e;
    public s f16539f;
    public long h = -9223372036854775807L;

    public n(v vVar, g5.q qVar, long j10) {
        this.f16535a = vVar;
        this.f16537c = qVar;
        this.f16536b = j10;
    }

    @Override
    public final void a(t tVar) {
        s sVar = this.f16539f;
        int i10 = h5.d0.f7237a;
        sVar.a(this);
    }

    @Override
    public final boolean b() {
        t tVar = this.f16538e;
        if (tVar != null && tVar.b()) {
            return true;
        }
        return false;
    }

    public final void c(v vVar) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f16536b;
        }
        a aVar = this.d;
        aVar.getClass();
        t b10 = aVar.b(vVar, this.f16537c, j10);
        this.f16538e = b10;
        if (this.f16539f != null) {
            b10.f(this, j10);
        }
    }

    @Override
    public final long d(long j10, h2 h2Var) {
        t tVar = this.f16538e;
        int i10 = h5.d0.f7237a;
        return tVar.d(j10, h2Var);
    }

    @Override
    public final long e() {
        t tVar = this.f16538e;
        int i10 = h5.d0.f7237a;
        return tVar.e();
    }

    @Override
    public final void f(s sVar, long j10) {
        this.f16539f = sVar;
        t tVar = this.f16538e;
        if (tVar != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f16536b;
            }
            tVar.f(this, j11);
        }
    }

    @Override
    public final long g(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 != -9223372036854775807L && j10 == this.f16536b) {
            this.h = -9223372036854775807L;
            j11 = j12;
        } else {
            j11 = j10;
        }
        t tVar = this.f16538e;
        int i10 = h5.d0.f7237a;
        return tVar.g(cVarArr, zArr, l0VarArr, zArr2, j11);
    }

    @Override
    public final void i() {
        t tVar = this.f16538e;
        if (tVar != null) {
            tVar.i();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override
    public final long j(long j10) {
        t tVar = this.f16538e;
        int i10 = h5.d0.f7237a;
        return tVar.j(j10);
    }

    @Override
    public final void k(long j10) {
        t tVar = this.f16538e;
        int i10 = h5.d0.f7237a;
        tVar.k(j10);
    }

    @Override
    public final boolean m(long j10) {
        t tVar = this.f16538e;
        if (tVar != null && tVar.m(j10)) {
            return true;
        }
        return false;
    }

    @Override
    public final long n() {
        t tVar = this.f16538e;
        int i10 = h5.d0.f7237a;
        return tVar.n();
    }

    @Override
    public final t0 o() {
        t tVar = this.f16538e;
        int i10 = h5.d0.f7237a;
        return tVar.o();
    }

    @Override
    public final long r() {
        t tVar = this.f16538e;
        int i10 = h5.d0.f7237a;
        return tVar.r();
    }

    @Override
    public final void s(n0 n0Var) {
        t tVar = (t) n0Var;
        s sVar = this.f16539f;
        int i10 = h5.d0.f7237a;
        sVar.s(this);
    }

    @Override
    public final void t(long j10) {
        t tVar = this.f16538e;
        int i10 = h5.d0.f7237a;
        tVar.t(j10);
    }
}
