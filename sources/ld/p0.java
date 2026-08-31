package ld;

import k7.q7;
public final class p0 extends k1 {
    public final int f12342e;
    public final Object f12343f;

    public p0(Object obj, int i10) {
        this.f12342e = i10;
        this.f12343f = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f12342e) {
            case 0:
                ((o0) this.f12343f).dispose();
                return;
            case 1:
                ((d1) this.f12343f).a(th2);
                return;
            case 2:
                ((u1) this.f12343f).u();
                throw null;
            case 3:
                l1 l1Var = (l1) this.f12343f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    l1Var.resumeWith(q7.a(((v) u10).f12368a));
                    return;
                } else {
                    l1Var.resumeWith(e0.u(u10));
                    return;
                }
            default:
                ((m) this.f12343f).resumeWith(sc.i.f47243a);
                return;
        }
    }

    public p0(u1 u1Var) {
        this.f12342e = 2;
        this.f12343f = u1Var;
    }
}
