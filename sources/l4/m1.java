package l4;

import j3.r2;
public abstract class m1 extends j {
    public final a f14381k;

    public m1(a aVar) {
        this.f14381k = aVar;
    }

    @Override
    public r2 g() {
        return this.f14381k.g();
    }

    @Override
    public final j3.f1 h() {
        return this.f14381k.h();
    }

    @Override
    public boolean i() {
        return this.f14381k.i();
    }

    @Override
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.f14341j = y0Var;
        this.f14340i = f5.d0.k(null);
        z();
    }

    @Override
    public final c0 s(Object obj, c0 c0Var) {
        Void r12 = (Void) obj;
        return x(c0Var);
    }

    @Override
    public final long t(Object obj, long j10) {
        Void r12 = (Void) obj;
        return j10;
    }

    @Override
    public final int u(int i10, Object obj) {
        Void r22 = (Void) obj;
        return i10;
    }

    @Override
    public final void v(Object obj, a aVar, r2 r2Var) {
        Void r12 = (Void) obj;
        y(r2Var);
    }

    public abstract void y(r2 r2Var);

    public void z() {
        w(null, this.f14381k);
    }

    public c0 x(c0 c0Var) {
        return c0Var;
    }
}
