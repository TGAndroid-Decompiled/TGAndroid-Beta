package m4;

import v7.m8;
public final class b0 implements j0 {
    public final int f14704a;
    public final k0 f14705b;

    public b0(k0 k0Var, int i10) {
        this.f14704a = i10;
        this.f14705b = k0Var;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f14704a;
        k0 k0Var = this.f14705b;
        switch (i10) {
            case 0:
                k0Var.f14837g.f14692t.F0();
                return;
            case 1:
                a0 a0Var = k0Var.f14837g;
                if (a0Var.f14692t.P0() != null) {
                    na.d dVar = a0Var.e;
                    a0Var.s(rVar);
                    dVar.getClass();
                    m8.b(new k1(-6));
                    return;
                }
                return;
            case 2:
                k0Var.f14837g.f14692t.V();
                return;
            case 3:
                k0Var.f14837g.f14692t.F();
                return;
            case 4:
                k0Var.f14837g.f14692t.G0();
                return;
            case 5:
                k0Var.f14837g.f14692t.b();
                return;
            case 6:
                k0Var.f14837g.f14692t.stop();
                return;
            case 7:
                a0 a0Var2 = k0Var.f14837g;
                e1 e1Var = a0Var2.f14692t;
                if (e2.d0.a0(e1Var, a0Var2.f14688p)) {
                    e2.d0.H(e1Var);
                    return;
                } else if (e1Var != null && e1Var.m0(1)) {
                    e1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                k0Var.f14837g.f14692t.E0();
                return;
            case 9:
                k0Var.f14837g.f14692t.e0();
                return;
            case 10:
                k0Var.f14837g.g(rVar, true);
                return;
            default:
                e1 e1Var2 = k0Var.f14837g.f14692t;
                String str = e2.d0.f7870a;
                if (e1Var2 != null && e1Var2.m0(1)) {
                    e1Var2.e();
                    return;
                }
                return;
        }
    }

    public b0(k0 k0Var, b2.c1 c1Var) {
        this.f14704a = 1;
        this.f14705b = k0Var;
    }
}
