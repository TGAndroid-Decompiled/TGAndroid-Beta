package m4;

import java.util.List;
public final class n0 implements y0, z0 {
    public final int f16189a;
    public final b1 f16190b;
    public final int f16191c;

    public n0(b1 b1Var, int i10, int i11) {
        this.f16189a = i11;
        this.f16190b = b1Var;
        this.f16191c = i10;
    }

    @Override
    public void a(f1 f1Var, r rVar, List list) {
        switch (this.f16189a) {
            case 1:
                f1Var.b0(this.f16190b.J0(rVar, f1Var, this.f16191c), list);
                return;
            case 2:
                b1 b1Var = this.f16190b;
                b1Var.getClass();
                int size = list.size();
                int i10 = this.f16191c;
                if (size == 1) {
                    f1Var.s0((b2.k0) list.get(0), b1Var.J0(rVar, f1Var, i10));
                    return;
                }
                f1Var.P(b1Var.J0(rVar, f1Var, i10), b1Var.J0(rVar, f1Var, i10 + 1), list);
                return;
            default:
                f1Var.b0(this.f16190b.J0(rVar, f1Var, this.f16191c), list);
                return;
        }
    }

    @Override
    public void g(f1 f1Var, r rVar) {
        switch (this.f16189a) {
            case 0:
                f1Var.Y(this.f16190b.J0(rVar, f1Var, this.f16191c));
                return;
            default:
                f1Var.R(this.f16190b.J0(rVar, f1Var, this.f16191c));
                return;
        }
    }
}
