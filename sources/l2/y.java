package l2;

import java.util.List;
public final class y implements h2.o, p4.a1 {
    public final int f18086a;
    public final List f18087b;

    public y(int i7, h9.t1 t1Var) {
        this.f18086a = i7;
        this.f18087b = t1Var;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f18086a) {
            case 0:
                ((e2.a1) obj).B(this.f18087b);
                return;
            default:
                ((m2.b) obj).getClass();
                return;
        }
    }

    @Override
    public Object l(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f18086a) {
            case 2:
                return d0Var.l(vVar, this.f18087b);
            default:
                return d0Var.l(vVar, this.f18087b);
        }
    }

    public y(m2.a aVar, List list) {
        this.f18086a = 1;
        this.f18087b = list;
    }
}
