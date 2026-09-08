package m4;

import java.util.List;
public final class m0 implements c1, d1 {
    public final int f16028a;
    public final f1 f16029b;
    public final int f16030c;

    public m0(f1 f1Var, int i10, int i11) {
        this.f16028a = i11;
        this.f16029b = f1Var;
        this.f16030c = i10;
    }

    @Override
    public void a(j1 j1Var, r rVar, List list) {
        switch (this.f16028a) {
            case 1:
                j1Var.b0(this.f16029b.K0(rVar, j1Var, this.f16030c), list);
                return;
            case 2:
                f1 f1Var = this.f16029b;
                f1Var.getClass();
                int size = list.size();
                int i10 = this.f16030c;
                if (size == 1) {
                    j1Var.s0((b2.k0) list.get(0), f1Var.K0(rVar, j1Var, i10));
                    return;
                }
                j1Var.P(f1Var.K0(rVar, j1Var, i10), f1Var.K0(rVar, j1Var, i10 + 1), list);
                return;
            default:
                j1Var.b0(this.f16029b.K0(rVar, j1Var, this.f16030c), list);
                return;
        }
    }

    @Override
    public void j(j1 j1Var, r rVar) {
        switch (this.f16028a) {
            case 0:
                j1Var.Y(this.f16029b.K0(rVar, j1Var, this.f16030c));
                return;
            default:
                j1Var.R(this.f16029b.K0(rVar, j1Var, this.f16030c));
                return;
        }
    }
}
