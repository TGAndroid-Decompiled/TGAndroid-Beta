package m4;

import java.util.List;
public final class n0 implements y0, z0 {
    public final int f14635a;
    public final b1 f14636b;
    public final int f14637c;

    public n0(b1 b1Var, int i10, int i11) {
        this.f14635a = i11;
        this.f14636b = b1Var;
        this.f14637c = i10;
    }

    @Override
    public void a(f1 f1Var, r rVar, List list) {
        switch (this.f14635a) {
            case 1:
                f1Var.b0(this.f14636b.K0(rVar, f1Var, this.f14637c), list);
                return;
            case 2:
                b1 b1Var = this.f14636b;
                b1Var.getClass();
                int size = list.size();
                int i10 = this.f14637c;
                if (size == 1) {
                    f1Var.s0((b2.k0) list.get(0), b1Var.K0(rVar, f1Var, i10));
                    return;
                }
                f1Var.P(b1Var.K0(rVar, f1Var, i10), b1Var.K0(rVar, f1Var, i10 + 1), list);
                return;
            default:
                f1Var.b0(this.f14636b.K0(rVar, f1Var, this.f14637c), list);
                return;
        }
    }

    @Override
    public void g(f1 f1Var, r rVar) {
        switch (this.f14635a) {
            case 0:
                f1Var.Y(this.f14636b.K0(rVar, f1Var, this.f14637c));
                return;
            default:
                f1Var.R(this.f14636b.K0(rVar, f1Var, this.f14637c));
                return;
        }
    }
}
