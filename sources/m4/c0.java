package m4;

import v7.j8;
public final class c0 implements k0 {
    public final int f16013a;
    public final l0 f16014b;

    public c0(l0 l0Var, int i10) {
        this.f16013a = i10;
        this.f16014b = l0Var;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f16013a;
        l0 l0Var = this.f16014b;
        switch (i10) {
            case 0:
                l0Var.f16160g.f16001t.F0();
                return;
            case 1:
                b0 b0Var = l0Var.f16160g;
                if (b0Var.f16001t.P0() != null) {
                    na.d dVar = b0Var.f15987e;
                    b0Var.s(rVar);
                    dVar.getClass();
                    j8.b(new l1(-6));
                    return;
                }
                return;
            case 2:
                l0Var.f16160g.f16001t.V();
                return;
            case 3:
                l0Var.f16160g.f16001t.F();
                return;
            case 4:
                l0Var.f16160g.f16001t.G0();
                return;
            case 5:
                l0Var.f16160g.f16001t.b();
                return;
            case 6:
                l0Var.f16160g.f16001t.stop();
                return;
            case 7:
                b0 b0Var2 = l0Var.f16160g;
                f1 f1Var = b0Var2.f16001t;
                if (e2.d0.Z(f1Var, b0Var2.f15997p)) {
                    e2.d0.G(f1Var);
                    return;
                } else if (f1Var != null && f1Var.m0(1)) {
                    f1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                l0Var.f16160g.f16001t.E0();
                return;
            case 9:
                l0Var.f16160g.f16001t.e0();
                return;
            case 10:
                l0Var.f16160g.g(rVar, true);
                return;
            default:
                f1 f1Var2 = l0Var.f16160g.f16001t;
                String str = e2.d0.f8532a;
                if (f1Var2 != null && f1Var2.m0(1)) {
                    f1Var2.e();
                    return;
                }
                return;
        }
    }

    public c0(l0 l0Var, b2.c1 c1Var) {
        this.f16013a = 1;
        this.f16014b = l0Var;
    }
}
