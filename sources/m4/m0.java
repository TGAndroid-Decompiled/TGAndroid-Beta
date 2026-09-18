package m4;

import java.util.List;
public final class m0 implements c1, d1 {
    public final int f14799a;
    public final f1 f14800b;
    public final int f14801c;

    public m0(f1 f1Var, int i10, int i11) {
        this.f14799a = i11;
        this.f14800b = f1Var;
        this.f14801c = i10;
    }

    @Override
    public void a(j1 j1Var, r rVar, List list) {
        switch (this.f14799a) {
            case 1:
                j1Var.b0(this.f14800b.K0(rVar, j1Var, this.f14801c), list);
                return;
            case 2:
                f1 f1Var = this.f14800b;
                f1Var.getClass();
                int size = list.size();
                int i10 = this.f14801c;
                if (size == 1) {
                    j1Var.s0((b2.k0) list.get(0), f1Var.K0(rVar, j1Var, i10));
                    return;
                }
                j1Var.P(f1Var.K0(rVar, j1Var, i10), f1Var.K0(rVar, j1Var, i10 + 1), list);
                return;
            default:
                j1Var.b0(this.f14800b.K0(rVar, j1Var, this.f14801c), list);
                return;
        }
    }

    @Override
    public void d(j1 j1Var, r rVar) {
        switch (this.f14799a) {
            case 0:
                j1Var.Y(this.f14800b.K0(rVar, j1Var, this.f14801c));
                return;
            default:
                j1Var.R(this.f14800b.K0(rVar, j1Var, this.f14801c));
                return;
        }
    }
}
