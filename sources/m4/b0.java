package m4;

import v7.m8;
public final class b0 implements j0 {
    public final int f14746a;
    public final k0 f14747b;

    public b0(k0 k0Var, int i10) {
        this.f14746a = i10;
        this.f14747b = k0Var;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f14746a;
        k0 k0Var = this.f14747b;
        switch (i10) {
            case 0:
                k0Var.f14879g.f14734t.F0();
                return;
            case 1:
                a0 a0Var = k0Var.f14879g;
                if (a0Var.f14734t.P0() != null) {
                    na.d dVar = a0Var.e;
                    a0Var.s(rVar);
                    dVar.getClass();
                    m8.b(new k1(-6));
                    return;
                }
                return;
            case 2:
                k0Var.f14879g.f14734t.V();
                return;
            case 3:
                k0Var.f14879g.f14734t.F();
                return;
            case 4:
                k0Var.f14879g.f14734t.G0();
                return;
            case 5:
                k0Var.f14879g.f14734t.b();
                return;
            case 6:
                k0Var.f14879g.f14734t.stop();
                return;
            case 7:
                a0 a0Var2 = k0Var.f14879g;
                e1 e1Var = a0Var2.f14734t;
                if (e2.d0.a0(e1Var, a0Var2.f14730p)) {
                    e2.d0.H(e1Var);
                    return;
                } else if (e1Var != null && e1Var.m0(1)) {
                    e1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                k0Var.f14879g.f14734t.E0();
                return;
            case 9:
                k0Var.f14879g.f14734t.e0();
                return;
            case 10:
                k0Var.f14879g.g(rVar, true);
                return;
            default:
                e1 e1Var2 = k0Var.f14879g.f14734t;
                String str = e2.d0.f7872a;
                if (e1Var2 != null && e1Var2.m0(1)) {
                    e1Var2.e();
                    return;
                }
                return;
        }
    }

    public b0(k0 k0Var, b2.c1 c1Var) {
        this.f14746a = 1;
        this.f14747b = k0Var;
    }
}
