package m4;

import java.util.List;
public final class r0 implements f1, g1 {
    public final int f12908a;
    public final j1 f12909b;
    public final int f12910c;

    public r0(j1 j1Var, int i10, int i11) {
        this.f12908a = i11;
        this.f12909b = j1Var;
        this.f12910c = i10;
    }

    @Override
    public void a(n1 n1Var, w wVar, List list) {
        switch (this.f12908a) {
            case 1:
                n1Var.a0(this.f12909b.M0(wVar, n1Var, this.f12910c), list);
                return;
            case 2:
                j1 j1Var = this.f12909b;
                j1Var.getClass();
                int size = list.size();
                int i10 = this.f12910c;
                if (size == 1) {
                    n1Var.q0(j1Var.M0(wVar, n1Var, i10), (b2.p0) list.get(0));
                    return;
                } else {
                    n1Var.r0(list, j1Var.M0(wVar, n1Var, i10), j1Var.M0(wVar, n1Var, i10 + 1));
                    return;
                }
            default:
                n1Var.a0(this.f12909b.M0(wVar, n1Var, this.f12910c), list);
                return;
        }
    }

    @Override
    public void g(n1 n1Var, w wVar) {
        switch (this.f12908a) {
            case 0:
                n1Var.X(this.f12909b.M0(wVar, n1Var, this.f12910c));
                return;
            default:
                n1Var.P(this.f12909b.M0(wVar, n1Var, this.f12910c));
                return;
        }
    }
}
