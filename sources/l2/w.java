package l2;

import h9.t1;
import java.util.List;
public final class w implements h2.o, p4.c1 {
    public final int f19576a;
    public final List f19577b;

    public w(int i7, t1 t1Var) {
        this.f19576a = i7;
        this.f19577b = t1Var;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f19576a) {
            case 0:
                ((e2.a1) obj).B(this.f19577b);
                return;
            default:
                ((m2.b) obj).getClass();
                return;
        }
    }

    @Override
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f19576a) {
            case 2:
                return d0Var.l(vVar, this.f19577b);
            default:
                return d0Var.l(vVar, this.f19577b);
        }
    }

    public w(m2.a aVar, List list) {
        this.f19576a = 1;
        this.f19577b = list;
    }
}
