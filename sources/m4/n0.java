package m4;

import java.util.List;
public final class n0 implements z0, a1 {
    public final int f16207a;
    public final c1 f16208b;
    public final int f16209c;

    public n0(c1 c1Var, int i10, int i11) {
        this.f16207a = i11;
        this.f16208b = c1Var;
        this.f16209c = i10;
    }

    @Override
    public void a(g1 g1Var, r rVar, List list) {
        switch (this.f16207a) {
            case 1:
                g1Var.b0(this.f16208b.J0(rVar, g1Var, this.f16209c), list);
                return;
            case 2:
                c1 c1Var = this.f16208b;
                c1Var.getClass();
                int size = list.size();
                int i10 = this.f16209c;
                if (size == 1) {
                    g1Var.s0((b2.k0) list.get(0), c1Var.J0(rVar, g1Var, i10));
                    return;
                }
                g1Var.P(c1Var.J0(rVar, g1Var, i10), c1Var.J0(rVar, g1Var, i10 + 1), list);
                return;
            default:
                g1Var.b0(this.f16208b.J0(rVar, g1Var, this.f16209c), list);
                return;
        }
    }

    @Override
    public void g(g1 g1Var, r rVar) {
        switch (this.f16207a) {
            case 0:
                g1Var.Y(this.f16208b.J0(rVar, g1Var, this.f16209c));
                return;
            default:
                g1Var.R(this.f16208b.J0(rVar, g1Var, this.f16209c));
                return;
        }
    }
}
