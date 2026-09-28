package m4;

import java.util.List;
public final class m0 implements x0, y0 {
    public final int f14883a;
    public final a1 f14884b;
    public final int f14885c;

    public m0(a1 a1Var, int i10, int i11) {
        this.f14883a = i11;
        this.f14884b = a1Var;
        this.f14885c = i10;
    }

    @Override
    public void a(e1 e1Var, r rVar, List list) {
        switch (this.f14883a) {
            case 1:
                e1Var.b0(this.f14884b.K0(rVar, e1Var, this.f14885c), list);
                return;
            case 2:
                a1 a1Var = this.f14884b;
                a1Var.getClass();
                int size = list.size();
                int i10 = this.f14885c;
                if (size == 1) {
                    e1Var.s0((b2.k0) list.get(0), a1Var.K0(rVar, e1Var, i10));
                    return;
                }
                e1Var.P(a1Var.K0(rVar, e1Var, i10), a1Var.K0(rVar, e1Var, i10 + 1), list);
                return;
            default:
                e1Var.b0(this.f14884b.K0(rVar, e1Var, this.f14885c), list);
                return;
        }
    }

    @Override
    public void d(e1 e1Var, r rVar) {
        switch (this.f14883a) {
            case 0:
                e1Var.Y(this.f14884b.K0(rVar, e1Var, this.f14885c));
                return;
            default:
                e1Var.R(this.f14884b.K0(rVar, e1Var, this.f14885c));
                return;
        }
    }
}
