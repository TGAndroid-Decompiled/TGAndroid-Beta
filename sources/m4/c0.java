package m4;

import v7.o8;
public final class c0 implements k0 {
    public final int f13318a;
    public final l0 f13319b;

    public c0(l0 l0Var, int i10) {
        this.f13318a = i10;
        this.f13319b = l0Var;
    }

    @Override
    public final void h(r rVar) {
        int i10 = this.f13318a;
        l0 l0Var = this.f13319b;
        switch (i10) {
            case 0:
                l0Var.f13430g.f13307t.F0();
                return;
            case 1:
                b0 b0Var = l0Var.f13430g;
                if (b0Var.f13307t.P0() != null) {
                    na.d dVar = b0Var.e;
                    b0Var.s(rVar);
                    dVar.getClass();
                    o8.b(new r1(-6));
                    return;
                }
                return;
            case 2:
                l0Var.f13430g.f13307t.V();
                return;
            case 3:
                l0Var.f13430g.f13307t.F();
                return;
            case 4:
                l0Var.f13430g.f13307t.G0();
                return;
            case 5:
                l0Var.f13430g.f13307t.b();
                return;
            case 6:
                l0Var.f13430g.f13307t.stop();
                return;
            case 7:
                b0 b0Var2 = l0Var.f13430g;
                l1 l1Var = b0Var2.f13307t;
                if (e2.d0.a0(l1Var, b0Var2.f13303p)) {
                    e2.d0.H(l1Var);
                    return;
                } else if (l1Var != null && l1Var.m0(1)) {
                    l1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                l0Var.f13430g.f13307t.E0();
                return;
            case 9:
                l0Var.f13430g.f13307t.e0();
                return;
            case 10:
                l0Var.f13430g.g(rVar, true);
                return;
            default:
                l1 l1Var2 = l0Var.f13430g.f13307t;
                String str = e2.d0.f7188a;
                if (l1Var2 != null && l1Var2.m0(1)) {
                    l1Var2.e();
                    return;
                }
                return;
        }
    }

    public c0(l0 l0Var, b2.c1 c1Var) {
        this.f13318a = 1;
        this.f13319b = l0Var;
    }
}
