package m4;

import v7.l8;
public final class b0 implements j0 {
    public final int f16065a;
    public final k0 f16066b;

    public b0(k0 k0Var, int i10) {
        this.f16065a = i10;
        this.f16066b = k0Var;
    }

    @Override
    public final void f(r rVar) {
        int i10 = this.f16065a;
        k0 k0Var = this.f16066b;
        switch (i10) {
            case 0:
                k0Var.f16208g.f16052t.F0();
                return;
            case 1:
                a0 a0Var = k0Var.f16208g;
                if (a0Var.f16052t.P0() != null) {
                    na.d dVar = a0Var.f16038e;
                    a0Var.s(rVar);
                    dVar.getClass();
                    l8.b(new k1(-6));
                    return;
                }
                return;
            case 2:
                k0Var.f16208g.f16052t.V();
                return;
            case 3:
                k0Var.f16208g.f16052t.F();
                return;
            case 4:
                k0Var.f16208g.f16052t.G0();
                return;
            case 5:
                k0Var.f16208g.f16052t.b();
                return;
            case 6:
                k0Var.f16208g.f16052t.stop();
                return;
            case 7:
                a0 a0Var2 = k0Var.f16208g;
                e1 e1Var = a0Var2.f16052t;
                if (e2.d0.a0(e1Var, a0Var2.f16048p)) {
                    e2.d0.H(e1Var);
                    return;
                } else if (e1Var != null && e1Var.m0(1)) {
                    e1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                k0Var.f16208g.f16052t.E0();
                return;
            case 9:
                k0Var.f16208g.f16052t.e0();
                return;
            case 10:
                k0Var.f16208g.g(rVar, true);
                return;
            default:
                e1 e1Var2 = k0Var.f16208g.f16052t;
                String str = e2.d0.f8537a;
                if (e1Var2 != null && e1Var2.m0(1)) {
                    e1Var2.e();
                    return;
                }
                return;
        }
    }

    public b0(k0 k0Var, b2.c1 c1Var) {
        this.f16065a = 1;
        this.f16066b = k0Var;
    }
}
