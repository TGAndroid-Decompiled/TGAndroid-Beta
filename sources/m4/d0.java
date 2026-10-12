package m4;

import v7.j8;
public final class d0 implements l0 {
    public final int f15759a;
    public final m0 f15760b;

    public d0(m0 m0Var, int i10) {
        this.f15759a = i10;
        this.f15760b = m0Var;
    }

    @Override
    public final void g(r rVar) {
        int i10 = this.f15759a;
        m0 m0Var = this.f15760b;
        switch (i10) {
            case 0:
                m0Var.f15906g.f15749t.F0();
                return;
            case 1:
                c0 c0Var = m0Var.f15906g;
                if (c0Var.f15749t.P0() != null) {
                    na.d dVar = c0Var.f15735e;
                    c0Var.s(rVar);
                    dVar.getClass();
                    j8.b(new m1(-6));
                    return;
                }
                return;
            case 2:
                m0Var.f15906g.f15749t.V();
                return;
            case 3:
                m0Var.f15906g.f15749t.F();
                return;
            case 4:
                m0Var.f15906g.f15749t.G0();
                return;
            case 5:
                m0Var.f15906g.f15749t.b();
                return;
            case 6:
                m0Var.f15906g.f15749t.stop();
                return;
            case 7:
                c0 c0Var2 = m0Var.f15906g;
                g1 g1Var = c0Var2.f15749t;
                if (e2.d0.Z(g1Var, c0Var2.f15745p)) {
                    e2.d0.G(g1Var);
                    return;
                } else if (g1Var != null && g1Var.n0(1)) {
                    g1Var.e();
                    return;
                } else {
                    return;
                }
            case 8:
                m0Var.f15906g.f15749t.E0();
                return;
            case 9:
                m0Var.f15906g.f15749t.e0();
                return;
            case 10:
                m0Var.f15906g.g(rVar, true);
                return;
            default:
                g1 g1Var2 = m0Var.f15906g.f15749t;
                String str = e2.d0.f8529a;
                if (g1Var2 != null && g1Var2.n0(1)) {
                    g1Var2.e();
                    return;
                }
                return;
        }
    }

    public d0(m0 m0Var, b2.c1 c1Var) {
        this.f15759a = 1;
        this.f15760b = m0Var;
    }
}
