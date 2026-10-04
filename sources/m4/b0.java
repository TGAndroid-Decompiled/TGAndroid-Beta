package m4;

import v7.l8;
public final class b0 implements j0 {
    public final int f16070a;
    public final k0 f16071b;

    public b0(k0 k0Var, int i10) {
        this.f16070a = i10;
        this.f16071b = k0Var;
    }

    @Override
    public final void f(r rVar) {
        int i10 = this.f16070a;
        k0 k0Var = this.f16071b;
        switch (i10) {
            case 0:
                k0Var.f16213g.f16057t.F0();
                return;
            case 1:
                a0 a0Var = k0Var.f16213g;
                if (a0Var.f16057t.P0() != null) {
                    na.d dVar = a0Var.f16043e;
                    a0Var.s(rVar);
                    dVar.getClass();
                    l8.b(new k1(-6));
                    return;
                }
                return;
            case 2:
                k0Var.f16213g.f16057t.V();
                return;
            case 3:
                k0Var.f16213g.f16057t.F();
                return;
            case 4:
                k0Var.f16213g.f16057t.G0();
                return;
            case 5:
                k0Var.f16213g.f16057t.b();
                return;
            case 6:
                k0Var.f16213g.f16057t.stop();
                return;
            case 7:
                a0 a0Var2 = k0Var.f16213g;
                e1 e1Var = a0Var2.f16057t;
                if (e2.d0.a0(e1Var, a0Var2.f16053p)) {
                    e2.d0.H(e1Var);
                    return;
                } else if (e1Var != null && e1Var.m0(1)) {
                    e1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                k0Var.f16213g.f16057t.E0();
                return;
            case 9:
                k0Var.f16213g.f16057t.e0();
                return;
            case 10:
                k0Var.f16213g.g(rVar, true);
                return;
            default:
                e1 e1Var2 = k0Var.f16213g.f16057t;
                String str = e2.d0.f8538a;
                if (e1Var2 != null && e1Var2.m0(1)) {
                    e1Var2.e();
                    return;
                }
                return;
        }
    }

    public b0(k0 k0Var, b2.c1 c1Var) {
        this.f16070a = 1;
        this.f16071b = k0Var;
    }
}
