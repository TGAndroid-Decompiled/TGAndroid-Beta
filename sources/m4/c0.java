package m4;

import v7.j8;
public final class c0 implements k0 {
    public final int f16009a;
    public final l0 f16010b;

    public c0(l0 l0Var, int i10) {
        this.f16009a = i10;
        this.f16010b = l0Var;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f16009a;
        l0 l0Var = this.f16010b;
        switch (i10) {
            case 0:
                l0Var.f16156g.f15997t.F0();
                return;
            case 1:
                b0 b0Var = l0Var.f16156g;
                if (b0Var.f15997t.P0() != null) {
                    na.d dVar = b0Var.f15983e;
                    b0Var.s(rVar);
                    dVar.getClass();
                    j8.b(new l1(-6));
                    return;
                }
                return;
            case 2:
                l0Var.f16156g.f15997t.V();
                return;
            case 3:
                l0Var.f16156g.f15997t.F();
                return;
            case 4:
                l0Var.f16156g.f15997t.G0();
                return;
            case 5:
                l0Var.f16156g.f15997t.b();
                return;
            case 6:
                l0Var.f16156g.f15997t.stop();
                return;
            case 7:
                b0 b0Var2 = l0Var.f16156g;
                f1 f1Var = b0Var2.f15997t;
                if (e2.d0.Z(f1Var, b0Var2.f15993p)) {
                    e2.d0.G(f1Var);
                    return;
                } else if (f1Var != null && f1Var.m0(1)) {
                    f1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                l0Var.f16156g.f15997t.E0();
                return;
            case 9:
                l0Var.f16156g.f15997t.e0();
                return;
            case 10:
                l0Var.f16156g.g(rVar, true);
                return;
            default:
                f1 f1Var2 = l0Var.f16156g.f15997t;
                String str = e2.d0.f8532a;
                if (f1Var2 != null && f1Var2.m0(1)) {
                    f1Var2.e();
                    return;
                }
                return;
        }
    }

    public c0(l0 l0Var, b2.c1 c1Var) {
        this.f16009a = 1;
        this.f16010b = l0Var;
    }
}
