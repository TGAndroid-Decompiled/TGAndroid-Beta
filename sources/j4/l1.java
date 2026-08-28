package j4;

import h3.r2;
public abstract class l1 extends k {
    public final a f13504k;

    public l1(a aVar) {
        this.f13504k = aVar;
    }

    @Override
    public r2 g() {
        return this.f13504k.g();
    }

    @Override
    public final h3.f1 h() {
        return this.f13504k.h();
    }

    @Override
    public boolean i() {
        return this.f13504k.i();
    }

    @Override
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.f13495j = y0Var;
        this.f13494i = d5.f0.k(null);
        z();
    }

    @Override
    public final d0 s(Object obj, d0 d0Var) {
        Void r12 = (Void) obj;
        return x(d0Var);
    }

    @Override
    public final long t(Object obj, long j10) {
        Void r12 = (Void) obj;
        return j10;
    }

    @Override
    public final int u(int i9, Object obj) {
        Void r22 = (Void) obj;
        return i9;
    }

    @Override
    public final void v(Object obj, a aVar, r2 r2Var) {
        Void r12 = (Void) obj;
        y(r2Var);
    }

    public abstract void y(r2 r2Var);

    public void z() {
        w(null, this.f13504k);
    }

    public d0 x(d0 d0Var) {
        return d0Var;
    }
}
