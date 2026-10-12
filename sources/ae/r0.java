package ae;

import v7.a8;
public final class r0 extends m1 {
    public final int f492e;
    public final Object f493f;

    public r0(Object obj, int i10) {
        this.f492e = i10;
        this.f493f = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f492e) {
            case 0:
                ((q0) this.f493f).dispose();
                return;
            case 1:
                ((f1) this.f493f).a(th2);
                return;
            case 2:
                ((w1) this.f493f).u();
                throw null;
            case 3:
                n1 n1Var = (n1) this.f493f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    n1Var.resumeWith(a8.a(((v) u10).f511a));
                    return;
                } else {
                    n1Var.resumeWith(g0.u(u10));
                    return;
                }
            default:
                ((m) this.f493f).resumeWith(hd.i.f11090a);
                return;
        }
    }

    public r0(w1 w1Var) {
        this.f492e = 2;
        this.f493f = w1Var;
    }
}
