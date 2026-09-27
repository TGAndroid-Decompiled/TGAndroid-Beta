package m4;

import java.util.List;
public final class m0 implements x0, y0 {
    public final int f14909a;
    public final a1 f14910b;
    public final int f14911c;

    public m0(a1 a1Var, int i10, int i11) {
        this.f14909a = i11;
        this.f14910b = a1Var;
        this.f14911c = i10;
    }

    @Override
    public void a(e1 e1Var, r rVar, List list) {
        switch (this.f14909a) {
            case 1:
                e1Var.b0(this.f14910b.K0(rVar, e1Var, this.f14911c), list);
                return;
            case 2:
                a1 a1Var = this.f14910b;
                a1Var.getClass();
                int size = list.size();
                int i10 = this.f14911c;
                if (size == 1) {
                    e1Var.s0((b2.k0) list.get(0), a1Var.K0(rVar, e1Var, i10));
                    return;
                }
                e1Var.P(a1Var.K0(rVar, e1Var, i10), a1Var.K0(rVar, e1Var, i10 + 1), list);
                return;
            default:
                e1Var.b0(this.f14910b.K0(rVar, e1Var, this.f14911c), list);
                return;
        }
    }

    @Override
    public void d(e1 e1Var, r rVar) {
        switch (this.f14909a) {
            case 0:
                e1Var.Y(this.f14910b.K0(rVar, e1Var, this.f14911c));
                return;
            default:
                e1Var.R(this.f14910b.K0(rVar, e1Var, this.f14911c));
                return;
        }
    }
}
