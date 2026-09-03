package o4;

import j3.h2;
public final class n implements t, s {
    public final v f16366a;
    public final long f16367b;
    public final g5.q f16368c;
    public a d;
    public t e;
    public s f16369f;
    public long h = -9223372036854775807L;

    public n(v vVar, g5.q qVar, long j10) {
        this.f16366a = vVar;
        this.f16368c = qVar;
        this.f16367b = j10;
    }

    @Override
    public final void E1(t tVar) {
        s sVar = this.f16369f;
        int i10 = h5.d0.f6924a;
        sVar.E1(this);
    }

    @Override
    public final long H() {
        t tVar = this.e;
        int i10 = h5.d0.f6924a;
        return tVar.H();
    }

    @Override
    public final void J(s sVar, long j10) {
        this.f16369f = sVar;
        t tVar = this.e;
        if (tVar != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f16367b;
            }
            tVar.J(this, j11);
        }
    }

    @Override
    public final void X1(n0 n0Var) {
        t tVar = (t) n0Var;
        s sVar = this.f16369f;
        int i10 = h5.d0.f6924a;
        sVar.X1(this);
    }

    @Override
    public final long Y(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 != -9223372036854775807L && j10 == this.f16367b) {
            this.h = -9223372036854775807L;
            j11 = j12;
        } else {
            j11 = j10;
        }
        t tVar = this.e;
        int i10 = h5.d0.f6924a;
        return tVar.Y(cVarArr, zArr, l0VarArr, zArr2, j11);
    }

    public final void a(v vVar) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f16367b;
        }
        a aVar = this.d;
        aVar.getClass();
        t b10 = aVar.b(vVar, this.f16368c, j10);
        this.e = b10;
        if (this.f16369f != null) {
            b10.J(this, j10);
        }
    }

    @Override
    public final long a1() {
        t tVar = this.e;
        int i10 = h5.d0.f6924a;
        return tVar.a1();
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
    public final void d0() {
        t tVar = this.e;
        if (tVar != null) {
            tVar.d0();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override
    public final long j0(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.f6924a;
        return tVar.j0(j10);
    }

    @Override
    public final void k2(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.f6924a;
        tVar.k2(j10);
    }

    @Override
    public final void m0(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.f6924a;
        tVar.m0(j10);
    }

    @Override
    public final boolean n0(long j10) {
        t tVar = this.e;
        if (tVar != null && tVar.n0(j10)) {
            return true;
        }
        return false;
    }

    @Override
    public final t0 o1() {
        t tVar = this.e;
        int i10 = h5.d0.f6924a;
        return tVar.o1();
    }

    @Override
    public final long y1() {
        t tVar = this.e;
        int i10 = h5.d0.f6924a;
        return tVar.y1();
    }

    @Override
    public final long z(long j10, h2 h2Var) {
        t tVar = this.e;
        int i10 = h5.d0.f6924a;
        return tVar.z(j10, h2Var);
    }
}
