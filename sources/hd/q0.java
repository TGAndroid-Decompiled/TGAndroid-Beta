package hd;

import g7.y5;
public final class q0 extends l1 {
    public final int f10473e;
    public final Object f10474f;

    public q0(Object obj, int i9) {
        this.f10473e = i9;
        this.f10474f = obj;
    }

    @Override
    public final void a(Throwable th) {
        switch (this.f10473e) {
            case 0:
                ((p0) this.f10474f).dispose();
                return;
            case 1:
                ((e1) this.f10474f).a(th);
                return;
            case 2:
                ((v1) this.f10474f).u();
                throw null;
            case 3:
                m1 m1Var = (m1) this.f10474f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    m1Var.resumeWith(y5.a(((v) u10).f10495a));
                    return;
                } else {
                    m1Var.resumeWith(f0.u(u10));
                    return;
                }
            default:
                ((m) this.f10474f).resumeWith(oc.i.f19197a);
                return;
        }
    }

    public q0(v1 v1Var) {
        this.f10473e = 2;
        this.f10474f = v1Var;
    }
}
