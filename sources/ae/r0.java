package ae;

import v7.a8;
public final class r0 extends m1 {
    public final int f490e;
    public final Object f491f;

    public r0(Object obj, int i10) {
        this.f490e = i10;
        this.f491f = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f490e) {
            case 0:
                ((q0) this.f491f).dispose();
                return;
            case 1:
                ((f1) this.f491f).a(th2);
                return;
            case 2:
                ((w1) this.f491f).u();
                throw null;
            case 3:
                n1 n1Var = (n1) this.f491f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    n1Var.resumeWith(a8.a(((v) u10).f509a));
                    return;
                } else {
                    n1Var.resumeWith(g0.u(u10));
                    return;
                }
            default:
                ((m) this.f491f).resumeWith(hd.i.f11091a);
                return;
        }
    }

    public r0(w1 w1Var) {
        this.f490e = 2;
        this.f491f = w1Var;
    }
}
