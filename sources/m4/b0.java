package m4;

import v7.m8;
public final class b0 implements j0 {
    public final int f14714a;
    public final k0 f14715b;

    public b0(k0 k0Var, int i10) {
        this.f14714a = i10;
        this.f14715b = k0Var;
    }

    @Override
    public final void f(r rVar) {
        int i10 = this.f14714a;
        k0 k0Var = this.f14715b;
        switch (i10) {
            case 0:
                k0Var.f14821g.f14702t.F0();
                return;
            case 1:
                a0 a0Var = k0Var.f14821g;
                if (a0Var.f14702t.P0() != null) {
                    na.d dVar = a0Var.e;
                    a0Var.s(rVar);
                    dVar.getClass();
                    m8.b(new p1(-6));
                    return;
                }
                return;
            case 2:
                k0Var.f14821g.f14702t.V();
                return;
            case 3:
                k0Var.f14821g.f14702t.F();
                return;
            case 4:
                k0Var.f14821g.f14702t.G0();
                return;
            case 5:
                k0Var.f14821g.f14702t.b();
                return;
            case 6:
                k0Var.f14821g.f14702t.stop();
                return;
            case 7:
                a0 a0Var2 = k0Var.f14821g;
                j1 j1Var = a0Var2.f14702t;
                if (e2.d0.a0(j1Var, a0Var2.f14698p)) {
                    e2.d0.H(j1Var);
                    return;
                } else if (j1Var != null && j1Var.m0(1)) {
                    j1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                k0Var.f14821g.f14702t.E0();
                return;
            case 9:
                k0Var.f14821g.f14702t.e0();
                return;
            case 10:
                k0Var.f14821g.g(rVar, true);
                return;
            default:
                j1 j1Var2 = k0Var.f14821g.f14702t;
                String str = e2.d0.f7887a;
                if (j1Var2 != null && j1Var2.m0(1)) {
                    j1Var2.e();
                    return;
                }
                return;
        }
    }

    public b0(k0 k0Var, b2.c1 c1Var) {
        this.f14714a = 1;
        this.f14715b = k0Var;
    }
}
