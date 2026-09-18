package m4;

import v7.l8;
public final class b0 implements k0 {
    public final int f14488a;
    public final l0 f14489b;

    public b0(l0 l0Var, int i10) {
        this.f14488a = i10;
        this.f14489b = l0Var;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f14488a;
        l0 l0Var = this.f14489b;
        switch (i10) {
            case 0:
                l0Var.f14606g.f14476t.F0();
                return;
            case 1:
                a0 a0Var = l0Var.f14606g;
                if (a0Var.f14476t.P0() != null) {
                    na.d dVar = a0Var.e;
                    a0Var.s(rVar);
                    dVar.getClass();
                    l8.b(new q1(-6));
                    return;
                }
                return;
            case 2:
                l0Var.f14606g.f14476t.V();
                return;
            case 3:
                l0Var.f14606g.f14476t.F();
                return;
            case 4:
                l0Var.f14606g.f14476t.G0();
                return;
            case 5:
                l0Var.f14606g.f14476t.b();
                return;
            case 6:
                l0Var.f14606g.f14476t.stop();
                return;
            case 7:
                a0 a0Var2 = l0Var.f14606g;
                k1 k1Var = a0Var2.f14476t;
                if (e2.d0.a0(k1Var, a0Var2.f14472p)) {
                    e2.d0.H(k1Var);
                    return;
                } else if (k1Var != null && k1Var.m0(1)) {
                    k1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                l0Var.f14606g.f14476t.E0();
                return;
            case 9:
                l0Var.f14606g.f14476t.e0();
                return;
            case 10:
                l0Var.f14606g.g(rVar, true);
                return;
            default:
                k1 k1Var2 = l0Var.f14606g.f14476t;
                String str = e2.d0.f7888a;
                if (k1Var2 != null && k1Var2.m0(1)) {
                    k1Var2.e();
                    return;
                }
                return;
        }
    }

    public b0(l0 l0Var, b2.c1 c1Var) {
        this.f14488a = 1;
        this.f14489b = l0Var;
    }
}
