package m4;

import v7.l8;
public final class b0 implements j0 {
    public final int f15855a;
    public final k0 f15856b;

    public b0(k0 k0Var, int i10) {
        this.f15855a = i10;
        this.f15856b = k0Var;
    }

    @Override
    public final void f(r rVar) {
        int i10 = this.f15855a;
        k0 k0Var = this.f15856b;
        switch (i10) {
            case 0:
                k0Var.f15970g.f15843t.F0();
                return;
            case 1:
                a0 a0Var = k0Var.f15970g;
                if (a0Var.f15843t.P0() != null) {
                    ob.a aVar = a0Var.f15829e;
                    a0Var.s(rVar);
                    aVar.getClass();
                    l8.b(new p1(-6));
                    return;
                }
                return;
            case 2:
                k0Var.f15970g.f15843t.V();
                return;
            case 3:
                k0Var.f15970g.f15843t.F();
                return;
            case 4:
                k0Var.f15970g.f15843t.G0();
                return;
            case 5:
                k0Var.f15970g.f15843t.b();
                return;
            case 6:
                k0Var.f15970g.f15843t.stop();
                return;
            case 7:
                a0 a0Var2 = k0Var.f15970g;
                j1 j1Var = a0Var2.f15843t;
                if (e2.d0.a0(j1Var, a0Var2.f15839p)) {
                    e2.d0.H(j1Var);
                    return;
                } else if (j1Var != null && j1Var.m0(1)) {
                    j1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                k0Var.f15970g.f15843t.E0();
                return;
            case 9:
                k0Var.f15970g.f15843t.e0();
                return;
            case 10:
                k0Var.f15970g.g(rVar, true);
                return;
            default:
                j1 j1Var2 = k0Var.f15970g.f15843t;
                String str = e2.d0.f8737a;
                if (j1Var2 != null && j1Var2.m0(1)) {
                    j1Var2.e();
                    return;
                }
                return;
        }
    }

    public b0(k0 k0Var, b2.c1 c1Var) {
        this.f15855a = 1;
        this.f15856b = k0Var;
    }
}
