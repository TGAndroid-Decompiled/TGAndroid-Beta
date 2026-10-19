package be;

import v7.i8;
public final class q0 extends l1 {
    public final int e;
    public final Object f4310f;

    public q0(Object obj, int i10) {
        this.e = i10;
        this.f4310f = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.e) {
            case 0:
                ((p0) this.f4310f).dispose();
                return;
            case 1:
                ((e1) this.f4310f).a(th2);
                return;
            case 2:
                ((v1) this.f4310f).u();
                throw null;
            case 3:
                m1 m1Var = (m1) this.f4310f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    m1Var.resumeWith(i8.a(((v) u10).f4328a));
                    return;
                } else {
                    m1Var.resumeWith(f0.u(u10));
                    return;
                }
            default:
                ((m) this.f4310f).resumeWith(id.i.f12775a);
                return;
        }
    }

    public q0(v1 v1Var) {
        this.e = 2;
        this.f4310f = v1Var;
    }
}
