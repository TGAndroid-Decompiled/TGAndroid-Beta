package j4;

import h3.s2;

public abstract class l1 extends j {

    public final a f12614k;

    public l1(a aVar) {
        this.f12614k = aVar;
    }

    @Override
    public s2 g() {
        return this.f12614k.g();
    }

    @Override
    public final h3.f1 h() {
        return this.f12614k.h();
    }

    @Override
    public boolean i() {
        return this.f12614k.i();
    }

    @Override
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.f12588j = y0Var;
        this.f12587i = d5.g0.k(null);
        z();
    }

    @Override
    public final c0 s(Object obj, c0 c0Var) {
        return x(c0Var);
    }

    @Override
    public final long t(Object obj, long j10) {
        return j10;
    }

    @Override
    public final int u(int i10, Object obj) {
        return i10;
    }

    @Override
    public final void v(Object obj, a aVar, s2 s2Var) {
        y(s2Var);
    }

    public abstract void y(s2 s2Var);

    public void z() {
        w(null, this.f12614k);
    }

    public c0 x(c0 c0Var) {
        return c0Var;
    }
}
