package m4;

import java.util.List;
public final class m0 implements c1, d1 {
    public final int f14850a;
    public final f1 f14851b;
    public final int f14852c;

    public m0(f1 f1Var, int i10, int i11) {
        this.f14850a = i11;
        this.f14851b = f1Var;
        this.f14852c = i10;
    }

    @Override
    public void a(j1 j1Var, r rVar, List list) {
        switch (this.f14850a) {
            case 1:
                j1Var.b0(this.f14851b.K0(rVar, j1Var, this.f14852c), list);
                return;
            case 2:
                f1 f1Var = this.f14851b;
                f1Var.getClass();
                int size = list.size();
                int i10 = this.f14852c;
                if (size == 1) {
                    j1Var.s0((b2.k0) list.get(0), f1Var.K0(rVar, j1Var, i10));
                    return;
                }
                j1Var.P(f1Var.K0(rVar, j1Var, i10), f1Var.K0(rVar, j1Var, i10 + 1), list);
                return;
            default:
                j1Var.b0(this.f14851b.K0(rVar, j1Var, this.f14852c), list);
                return;
        }
    }

    @Override
    public void f(j1 j1Var, r rVar) {
        switch (this.f14850a) {
            case 0:
                j1Var.Y(this.f14851b.K0(rVar, j1Var, this.f14852c));
                return;
            default:
                j1Var.R(this.f14851b.K0(rVar, j1Var, this.f14852c));
                return;
        }
    }
}
