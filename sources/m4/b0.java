package m4;

import v7.l8;
public final class b0 implements k0 {
    public final int f14463a;
    public final l0 f14464b;

    public b0(l0 l0Var, int i10) {
        this.f14463a = i10;
        this.f14464b = l0Var;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f14463a;
        l0 l0Var = this.f14464b;
        switch (i10) {
            case 0:
                l0Var.f14607g.f14454t.F0();
                return;
            case 1:
                a0 a0Var = l0Var.f14607g;
                if (a0Var.f14454t.P0() != null) {
                    na.d dVar = a0Var.e;
                    a0Var.s(rVar);
                    dVar.getClass();
                    l8.b(new l1(-6));
                    return;
                }
                return;
            case 2:
                l0Var.f14607g.f14454t.V();
                return;
            case 3:
                l0Var.f14607g.f14454t.F();
                return;
            case 4:
                l0Var.f14607g.f14454t.G0();
                return;
            case 5:
                l0Var.f14607g.f14454t.b();
                return;
            case 6:
                l0Var.f14607g.f14454t.stop();
                return;
            case 7:
                a0 a0Var2 = l0Var.f14607g;
                f1 f1Var = a0Var2.f14454t;
                if (e2.d0.a0(f1Var, a0Var2.f14450p)) {
                    e2.d0.H(f1Var);
                    return;
                } else if (f1Var != null && f1Var.m0(1)) {
                    f1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                l0Var.f14607g.f14454t.E0();
                return;
            case 9:
                l0Var.f14607g.f14454t.e0();
                return;
            case 10:
                l0Var.f14607g.g(rVar, true);
                return;
            default:
                f1 f1Var2 = l0Var.f14607g.f14454t;
                String str = e2.d0.f7871a;
                if (f1Var2 != null && f1Var2.m0(1)) {
                    f1Var2.e();
                    return;
                }
                return;
        }
    }

    public b0(l0 l0Var, b2.c1 c1Var) {
        this.f14463a = 1;
        this.f14464b = l0Var;
    }
}
