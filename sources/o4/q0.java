package o4;

import java.util.List;
public final class q0 implements d1, e1 {
    public final int f20803a;
    public final h1 f20804b;
    public final int f20805c;

    public q0(h1 h1Var, int i3, int i10) {
        this.f20803a = i10;
        this.f20804b = h1Var;
        this.f20805c = i3;
    }

    @Override
    public void b(l1 l1Var, v vVar) {
        switch (this.f20803a) {
            case 0:
                l1Var.W(this.f20804b.M0(vVar, l1Var, this.f20805c));
                return;
            default:
                l1Var.O(this.f20804b.M0(vVar, l1Var, this.f20805c));
                return;
        }
    }

    @Override
    public void c(l1 l1Var, v vVar, List list) {
        switch (this.f20803a) {
            case 1:
                l1Var.Z(this.f20804b.M0(vVar, l1Var, this.f20805c), list);
                return;
            case 2:
                h1 h1Var = this.f20804b;
                h1Var.getClass();
                int size = list.size();
                int i3 = this.f20805c;
                if (size == 1) {
                    l1Var.n0(h1Var.M0(vVar, l1Var, i3), (d2.n0) list.get(0));
                    return;
                } else {
                    l1Var.p0(list, h1Var.M0(vVar, l1Var, i3), h1Var.M0(vVar, l1Var, i3 + 1));
                    return;
                }
            default:
                l1Var.Z(this.f20804b.M0(vVar, l1Var, this.f20805c), list);
                return;
        }
    }
}
