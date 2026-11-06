package l2;

import java.util.List;
public final class z implements h2.o, p4.a1 {
    public final int f18096a;
    public final List f18097b;

    public z(int i7, h9.t1 t1Var) {
        this.f18096a = i7;
        this.f18097b = t1Var;
    }

    @Override
    public Object i(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f18096a) {
            case 2:
                return d0Var.l(vVar, this.f18097b);
            default:
                return d0Var.l(vVar, this.f18097b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f18096a) {
            case 0:
                ((e2.a1) obj).B(this.f18097b);
                return;
            default:
                ((m2.b) obj).getClass();
                return;
        }
    }

    public z(m2.a aVar, List list) {
        this.f18096a = 1;
        this.f18097b = list;
    }
}
