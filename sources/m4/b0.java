package m4;

import v7.l8;
public final class b0 implements j0 {
    public final int f15882a;
    public final k0 f15883b;

    public b0(k0 k0Var, int i10) {
        this.f15882a = i10;
        this.f15883b = k0Var;
    }

    @Override
    public final void f(r rVar) {
        int i10 = this.f15882a;
        k0 k0Var = this.f15883b;
        switch (i10) {
            case 0:
                k0Var.f15997g.f15870t.F0();
                return;
            case 1:
                a0 a0Var = k0Var.f15997g;
                if (a0Var.f15870t.P0() != null) {
                    ob.a aVar = a0Var.f15856e;
                    a0Var.s(rVar);
                    aVar.getClass();
                    l8.b(new p1(-6));
                    return;
                }
                return;
            case 2:
                k0Var.f15997g.f15870t.V();
                return;
            case 3:
                k0Var.f15997g.f15870t.F();
                return;
            case 4:
                k0Var.f15997g.f15870t.G0();
                return;
            case 5:
                k0Var.f15997g.f15870t.b();
                return;
            case 6:
                k0Var.f15997g.f15870t.stop();
                return;
            case 7:
                a0 a0Var2 = k0Var.f15997g;
                j1 j1Var = a0Var2.f15870t;
                if (e2.d0.a0(j1Var, a0Var2.f15866p)) {
                    e2.d0.H(j1Var);
                    return;
                } else if (j1Var != null && j1Var.m0(1)) {
                    j1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                k0Var.f15997g.f15870t.E0();
                return;
            case 9:
                k0Var.f15997g.f15870t.e0();
                return;
            case 10:
                k0Var.f15997g.g(rVar, true);
                return;
            default:
                j1 j1Var2 = k0Var.f15997g.f15870t;
                String str = e2.d0.f8765a;
                if (j1Var2 != null && j1Var2.m0(1)) {
                    j1Var2.e();
                    return;
                }
                return;
        }
    }

    public b0(k0 k0Var, b2.c1 c1Var) {
        this.f15882a = 1;
        this.f15883b = k0Var;
    }
}
