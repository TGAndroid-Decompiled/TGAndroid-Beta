package m4;

import v7.j8;
public final class c0 implements k0 {
    public final int f16066a;
    public final l0 f16067b;

    public c0(l0 l0Var, int i10) {
        this.f16066a = i10;
        this.f16067b = l0Var;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f16066a;
        l0 l0Var = this.f16067b;
        switch (i10) {
            case 0:
                l0Var.f16198g.f16058t.F0();
                return;
            case 1:
                b0 b0Var = l0Var.f16198g;
                if (b0Var.f16058t.P0() != null) {
                    na.d dVar = b0Var.f16044e;
                    b0Var.s(rVar);
                    dVar.getClass();
                    j8.b(new m1(-6));
                    return;
                }
                return;
            case 2:
                l0Var.f16198g.f16058t.V();
                return;
            case 3:
                l0Var.f16198g.f16058t.F();
                return;
            case 4:
                l0Var.f16198g.f16058t.G0();
                return;
            case 5:
                l0Var.f16198g.f16058t.b();
                return;
            case 6:
                l0Var.f16198g.f16058t.stop();
                return;
            case 7:
                b0 b0Var2 = l0Var.f16198g;
                g1 g1Var = b0Var2.f16058t;
                if (e2.d0.Z(g1Var, b0Var2.f16054p)) {
                    e2.d0.G(g1Var);
                    return;
                } else if (g1Var != null && g1Var.m0(1)) {
                    g1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                l0Var.f16198g.f16058t.E0();
                return;
            case 9:
                l0Var.f16198g.f16058t.e0();
                return;
            case 10:
                l0Var.f16198g.g(rVar, true);
                return;
            default:
                g1 g1Var2 = l0Var.f16198g.f16058t;
                String str = e2.d0.f8531a;
                if (g1Var2 != null && g1Var2.m0(1)) {
                    g1Var2.e();
                    return;
                }
                return;
        }
    }

    public c0(l0 l0Var, b2.c1 c1Var) {
        this.f16066a = 1;
        this.f16067b = l0Var;
    }
}
