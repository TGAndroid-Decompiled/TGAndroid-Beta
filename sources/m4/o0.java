package m4;

import java.util.List;
public final class o0 implements z0, a1 {
    public final int f15936a;
    public final c1 f15937b;
    public final int f15938c;

    public o0(c1 c1Var, int i10, int i11) {
        this.f15936a = i11;
        this.f15937b = c1Var;
        this.f15938c = i10;
    }

    @Override
    public void a(g1 g1Var, r rVar, List list) {
        switch (this.f15936a) {
            case 1:
                g1Var.b0(this.f15937b.J0(rVar, g1Var, this.f15938c), list);
                return;
            case 2:
                c1 c1Var = this.f15937b;
                c1Var.getClass();
                int size = list.size();
                int i10 = this.f15938c;
                if (size == 1) {
                    g1Var.s0((b2.k0) list.get(0), c1Var.J0(rVar, g1Var, i10));
                    return;
                }
                g1Var.P(c1Var.J0(rVar, g1Var, i10), c1Var.J0(rVar, g1Var, i10 + 1), list);
                return;
            default:
                g1Var.b0(this.f15937b.J0(rVar, g1Var, this.f15938c), list);
                return;
        }
    }

    @Override
    public void g(g1 g1Var, r rVar) {
        switch (this.f15936a) {
            case 0:
                g1Var.Y(this.f15937b.J0(rVar, g1Var, this.f15938c));
                return;
            default:
                g1Var.R(this.f15937b.J0(rVar, g1Var, this.f15938c));
                return;
        }
    }
}
