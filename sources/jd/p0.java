package jd;

import i7.c7;
public final class p0 extends k1 {
    public final int f11506e;
    public final Object f11507f;

    public p0(Object obj, int i10) {
        this.f11506e = i10;
        this.f11507f = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f11506e) {
            case 0:
                ((o0) this.f11507f).dispose();
                return;
            case 1:
                ((d1) this.f11507f).a(th2);
                return;
            case 2:
                ((u1) this.f11507f).u();
                throw null;
            case 3:
                l1 l1Var = (l1) this.f11507f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    l1Var.resumeWith(c7.a(((v) u10).f11532a));
                    return;
                } else {
                    l1Var.resumeWith(e0.u(u10));
                    return;
                }
            default:
                ((m) this.f11507f).resumeWith(qc.i.f46603a);
                return;
        }
    }

    public p0(u1 u1Var) {
        this.f11506e = 2;
        this.f11507f = u1Var;
    }
}
