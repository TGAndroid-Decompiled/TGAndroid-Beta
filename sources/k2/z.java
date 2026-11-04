package k2;

import java.util.List;
public final class z implements g2.p, o4.f1 {
    public final int f16786a;
    public final List f16787b;

    public z(int i3, g9.s1 s1Var) {
        this.f16786a = i3;
        this.f16787b = s1Var;
    }

    @Override
    public Object i(o4.e0 e0Var, o4.v vVar, int i3) {
        switch (this.f16786a) {
            case 2:
                return e0Var.l(vVar, this.f16787b);
            default:
                return e0Var.l(vVar, this.f16787b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f16786a) {
            case 0:
                ((d2.c1) obj).F(this.f16787b);
                return;
            default:
                ((l2.b) obj).getClass();
                return;
        }
    }

    public z(l2.a aVar, List list) {
        this.f16786a = 1;
        this.f16787b = list;
    }
}
