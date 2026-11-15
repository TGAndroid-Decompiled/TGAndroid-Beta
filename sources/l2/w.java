package l2;

import h9.s1;
import java.util.List;
public final class w implements h2.o, p4.a1 {
    public final int f19209a;
    public final List f19210b;

    public w(int i7, s1 s1Var) {
        this.f19209a = i7;
        this.f19210b = s1Var;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f19209a) {
            case 0:
                ((e2.a1) obj).B(this.f19210b);
                return;
            default:
                ((m2.b) obj).getClass();
                return;
        }
    }

    @Override
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f19209a) {
            case 2:
                return d0Var.l(vVar, this.f19210b);
            default:
                return d0Var.l(vVar, this.f19210b);
        }
    }

    public w(m2.a aVar, List list) {
        this.f19209a = 1;
        this.f19210b = list;
    }
}
