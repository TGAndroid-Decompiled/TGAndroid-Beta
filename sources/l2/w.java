package l2;

import h9.t1;
import java.util.List;
public final class w implements h2.o, p4.c1 {
    public final int f19604a;
    public final List f19605b;

    public w(int i7, t1 t1Var) {
        this.f19604a = i7;
        this.f19605b = t1Var;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f19604a) {
            case 0:
                ((e2.a1) obj).B(this.f19605b);
                return;
            default:
                ((m2.b) obj).getClass();
                return;
        }
    }

    @Override
    public Object k(p4.e0 e0Var, p4.v vVar, int i7) {
        switch (this.f19604a) {
            case 2:
                return e0Var.l(vVar, this.f19605b);
            default:
                return e0Var.l(vVar, this.f19605b);
        }
    }

    public w(m2.a aVar, List list) {
        this.f19604a = 1;
        this.f19605b = list;
    }
}
