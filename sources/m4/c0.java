package m4;

import v7.j8;
public final class c0 implements k0 {
    public final int f16030a;
    public final l0 f16031b;

    public c0(l0 l0Var, int i10) {
        this.f16030a = i10;
        this.f16031b = l0Var;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f16030a;
        l0 l0Var = this.f16031b;
        switch (i10) {
            case 0:
                l0Var.f16162g.f16022t.F0();
                return;
            case 1:
                b0 b0Var = l0Var.f16162g;
                if (b0Var.f16022t.P0() != null) {
                    na.d dVar = b0Var.f16008e;
                    b0Var.s(rVar);
                    dVar.getClass();
                    j8.b(new m1(-6));
                    return;
                }
                return;
            case 2:
                l0Var.f16162g.f16022t.V();
                return;
            case 3:
                l0Var.f16162g.f16022t.F();
                return;
            case 4:
                l0Var.f16162g.f16022t.G0();
                return;
            case 5:
                l0Var.f16162g.f16022t.b();
                return;
            case 6:
                l0Var.f16162g.f16022t.stop();
                return;
            case 7:
                b0 b0Var2 = l0Var.f16162g;
                g1 g1Var = b0Var2.f16022t;
                if (e2.d0.Z(g1Var, b0Var2.f16018p)) {
                    e2.d0.G(g1Var);
                    return;
                } else if (g1Var != null && g1Var.m0(1)) {
                    g1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                l0Var.f16162g.f16022t.E0();
                return;
            case 9:
                l0Var.f16162g.f16022t.e0();
                return;
            case 10:
                l0Var.f16162g.g(rVar, true);
                return;
            default:
                g1 g1Var2 = l0Var.f16162g.f16022t;
                String str = e2.d0.f8531a;
                if (g1Var2 != null && g1Var2.m0(1)) {
                    g1Var2.e();
                    return;
                }
                return;
        }
    }

    public c0(l0 l0Var, b2.c1 c1Var) {
        this.f16030a = 1;
        this.f16031b = l0Var;
    }
}
