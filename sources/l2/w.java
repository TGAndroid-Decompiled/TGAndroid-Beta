package l2;

import h9.t1;
import java.util.List;
public final class w implements h2.o, p4.c1 {
    public final int f19601a;
    public final List f19602b;

    public w(int i7, t1 t1Var) {
        this.f19601a = i7;
        this.f19602b = t1Var;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f19601a) {
            case 0:
                ((e2.a1) obj).B(this.f19602b);
                return;
            default:
                ((m2.b) obj).getClass();
                return;
        }
    }

    @Override
    public Object k(p4.e0 e0Var, p4.v vVar, int i7) {
        switch (this.f19601a) {
            case 2:
                return e0Var.l(vVar, this.f19602b);
            default:
                return e0Var.l(vVar, this.f19602b);
        }
    }

    public w(m2.a aVar, List list) {
        this.f19601a = 1;
        this.f19602b = list;
    }
}
