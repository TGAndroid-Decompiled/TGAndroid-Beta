package m4;

import a8.qd;
import android.os.Bundle;
public final class i0 implements o0 {
    public final int f18075a;
    public final p0 f18076b;

    public i0(p0 p0Var, int i10) {
        this.f18075a = i10;
        this.f18076b = p0Var;
    }

    @Override
    public final void i(w wVar) {
        int i10 = this.f18075a;
        p0 p0Var = this.f18076b;
        switch (i10) {
            case 0:
                p0Var.f18181g.n(wVar);
                return;
            case 1:
                f0 f0Var = p0Var.f18181g;
                if (f0Var.f18057t.S0() != null) {
                    qb.a aVar = f0Var.e;
                    f0Var.s(wVar);
                    aVar.getClass();
                    qd.b(new t1(-6));
                    return;
                }
                return;
            case 2:
                p0Var.f18181g.f18057t.V();
                return;
            case 3:
                p0Var.f18181g.f18057t.E();
                return;
            case 4:
                p0Var.f18181g.f18057t.I0();
                return;
            case 5:
                p0Var.f18181g.f18057t.J0();
                return;
            case 6:
                p0Var.f18181g.g(wVar, true);
                return;
            case 7:
                p0Var.f18181g.f18057t.a();
                return;
            case 8:
                p0Var.f18181g.f18057t.stop();
                return;
            case 9:
                f0 f0Var2 = p0Var.f18181g;
                n1 n1Var = f0Var2.f18057t;
                if (e2.n0.c0(n1Var, f0Var2.f18053p)) {
                    e2.n0.J(n1Var);
                    return;
                } else if (n1Var != null && n1Var.o0(1)) {
                    n1Var.e();
                    return;
                } else {
                    return;
                }
            case 10:
                p0Var.f18181g.f18057t.H0();
                return;
            case 11:
                p0Var.f18181g.f18057t.f0();
                return;
            default:
                n1 n1Var2 = p0Var.f18181g.f18057t;
                String str = e2.n0.f9692a;
                if (n1Var2 != null && n1Var2.o0(1)) {
                    n1Var2.e();
                    return;
                }
                return;
        }
    }

    public i0(p0 p0Var, b2.h1 h1Var) {
        this.f18075a = 1;
        this.f18076b = p0Var;
    }

    public i0(p0 p0Var, p1 p1Var, Bundle bundle) {
        this.f18075a = 0;
        this.f18076b = p0Var;
    }
}
