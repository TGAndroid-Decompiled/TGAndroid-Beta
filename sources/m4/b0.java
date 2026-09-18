package m4;

import v7.l8;
public final class b0 implements j0 {
    public final int f14663a;
    public final k0 f14664b;

    public b0(k0 k0Var, int i10) {
        this.f14663a = i10;
        this.f14664b = k0Var;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f14663a;
        k0 k0Var = this.f14664b;
        switch (i10) {
            case 0:
                k0Var.f14770g.f14651t.F0();
                return;
            case 1:
                a0 a0Var = k0Var.f14770g;
                if (a0Var.f14651t.P0() != null) {
                    na.d dVar = a0Var.e;
                    a0Var.s(rVar);
                    dVar.getClass();
                    l8.b(new p1(-6));
                    return;
                }
                return;
            case 2:
                k0Var.f14770g.f14651t.V();
                return;
            case 3:
                k0Var.f14770g.f14651t.F();
                return;
            case 4:
                k0Var.f14770g.f14651t.G0();
                return;
            case 5:
                k0Var.f14770g.f14651t.b();
                return;
            case 6:
                k0Var.f14770g.f14651t.stop();
                return;
            case 7:
                a0 a0Var2 = k0Var.f14770g;
                j1 j1Var = a0Var2.f14651t;
                if (e2.d0.a0(j1Var, a0Var2.f14647p)) {
                    e2.d0.H(j1Var);
                    return;
                } else if (j1Var != null && j1Var.m0(1)) {
                    j1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                k0Var.f14770g.f14651t.E0();
                return;
            case 9:
                k0Var.f14770g.f14651t.e0();
                return;
            case 10:
                k0Var.f14770g.g(rVar, true);
                return;
            default:
                j1 j1Var2 = k0Var.f14770g.f14651t;
                String str = e2.d0.f7887a;
                if (j1Var2 != null && j1Var2.m0(1)) {
                    j1Var2.e();
                    return;
                }
                return;
        }
    }

    public b0(k0 k0Var, b2.c1 c1Var) {
        this.f14663a = 1;
        this.f14664b = k0Var;
    }
}
