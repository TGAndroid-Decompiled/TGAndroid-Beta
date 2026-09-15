package m4;

import v7.l8;
public final class b0 implements k0 {
    public final int f14478a;
    public final l0 f14479b;

    public b0(l0 l0Var, int i10) {
        this.f14478a = i10;
        this.f14479b = l0Var;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f14478a;
        l0 l0Var = this.f14479b;
        switch (i10) {
            case 0:
                l0Var.f14596g.f14466t.F0();
                return;
            case 1:
                a0 a0Var = l0Var.f14596g;
                if (a0Var.f14466t.P0() != null) {
                    na.d dVar = a0Var.e;
                    a0Var.s(rVar);
                    dVar.getClass();
                    l8.b(new q1(-6));
                    return;
                }
                return;
            case 2:
                l0Var.f14596g.f14466t.V();
                return;
            case 3:
                l0Var.f14596g.f14466t.F();
                return;
            case 4:
                l0Var.f14596g.f14466t.G0();
                return;
            case 5:
                l0Var.f14596g.f14466t.b();
                return;
            case 6:
                l0Var.f14596g.f14466t.stop();
                return;
            case 7:
                a0 a0Var2 = l0Var.f14596g;
                k1 k1Var = a0Var2.f14466t;
                if (e2.d0.a0(k1Var, a0Var2.f14462p)) {
                    e2.d0.H(k1Var);
                    return;
                } else if (k1Var != null && k1Var.m0(1)) {
                    k1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                l0Var.f14596g.f14466t.E0();
                return;
            case 9:
                l0Var.f14596g.f14466t.e0();
                return;
            case 10:
                l0Var.f14596g.g(rVar, true);
                return;
            default:
                k1 k1Var2 = l0Var.f14596g.f14466t;
                String str = e2.d0.f7883a;
                if (k1Var2 != null && k1Var2.m0(1)) {
                    k1Var2.e();
                    return;
                }
                return;
        }
    }

    public b0(l0 l0Var, b2.c1 c1Var) {
        this.f14478a = 1;
        this.f14479b = l0Var;
    }
}
