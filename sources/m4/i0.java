package m4;

import android.os.Bundle;
import v7.p8;
public final class i0 implements o0 {
    public final int f12773a;
    public final p0 f12774b;

    public i0(p0 p0Var, int i10) {
        this.f12773a = i10;
        this.f12774b = p0Var;
    }

    @Override
    public final void b(w wVar) {
        int i10 = this.f12773a;
        p0 p0Var = this.f12774b;
        switch (i10) {
            case 0:
                p0Var.h.n(wVar);
                return;
            case 1:
                f0 f0Var = p0Var.h;
                if (f0Var.f12755t.S0() != null) {
                    oa.d dVar = f0Var.e;
                    f0Var.s(wVar);
                    dVar.getClass();
                    p8.b(new t1(-6));
                    return;
                }
                return;
            case 2:
                p0Var.h.f12755t.T();
                return;
            case 3:
                p0Var.h.f12755t.E();
                return;
            case 4:
                p0Var.h.f12755t.I0();
                return;
            case 5:
                p0Var.h.f12755t.J0();
                return;
            case 6:
                p0Var.h.g(wVar, true);
                return;
            case 7:
                p0Var.h.f12755t.a();
                return;
            case 8:
                p0Var.h.f12755t.stop();
                return;
            case 9:
                f0 f0Var2 = p0Var.h;
                n1 n1Var = f0Var2.f12755t;
                if (e2.l0.c0(n1Var, f0Var2.f12751p)) {
                    e2.l0.J(n1Var);
                    return;
                } else if (n1Var != null && n1Var.n0(1)) {
                    n1Var.e();
                    return;
                } else {
                    return;
                }
            case 10:
                p0Var.h.f12755t.H0();
                return;
            case 11:
                p0Var.h.f12755t.e0();
                return;
            default:
                n1 n1Var2 = p0Var.h.f12755t;
                String str = e2.l0.f6165a;
                if (n1Var2 != null && n1Var2.n0(1)) {
                    n1Var2.e();
                    return;
                }
                return;
        }
    }

    public i0(p0 p0Var, b2.g1 g1Var) {
        this.f12773a = 1;
        this.f12774b = p0Var;
    }

    public i0(p0 p0Var, p1 p1Var, Bundle bundle) {
        this.f12773a = 0;
        this.f12774b = p0Var;
    }
}
