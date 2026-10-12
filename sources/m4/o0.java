package m4;

import java.util.List;
public final class o0 implements z0, a1 {
    public final int f15937a;
    public final c1 f15938b;
    public final int f15939c;

    public o0(c1 c1Var, int i10, int i11) {
        this.f15937a = i11;
        this.f15938b = c1Var;
        this.f15939c = i10;
    }

    @Override
    public void a(g1 g1Var, r rVar, List list) {
        switch (this.f15937a) {
            case 1:
                g1Var.b0(this.f15938b.J0(rVar, g1Var, this.f15939c), list);
                return;
            case 2:
                c1 c1Var = this.f15938b;
                c1Var.getClass();
                int size = list.size();
                int i10 = this.f15939c;
                if (size == 1) {
                    g1Var.s0((b2.k0) list.get(0), c1Var.J0(rVar, g1Var, i10));
                    return;
                }
                g1Var.P(c1Var.J0(rVar, g1Var, i10), c1Var.J0(rVar, g1Var, i10 + 1), list);
                return;
            default:
                g1Var.b0(this.f15938b.J0(rVar, g1Var, this.f15939c), list);
                return;
        }
    }

    @Override
    public void g(g1 g1Var, r rVar) {
        switch (this.f15937a) {
            case 0:
                g1Var.Y(this.f15938b.J0(rVar, g1Var, this.f15939c));
                return;
            default:
                g1Var.R(this.f15938b.J0(rVar, g1Var, this.f15939c));
                return;
        }
    }
}
