package l2;

import h9.s1;
import java.util.List;
public final class x implements h2.o, p4.b1 {
    public final int f19674a;
    public final List f19675b;

    public x(int i7, s1 s1Var) {
        this.f19674a = i7;
        this.f19675b = s1Var;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f19674a) {
            case 0:
                ((e2.a1) obj).B(this.f19675b);
                return;
            default:
                ((m2.b) obj).getClass();
                return;
        }
    }

    @Override
    public Object j(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f19674a) {
            case 2:
                return d0Var.l(vVar, this.f19675b);
            default:
                return d0Var.l(vVar, this.f19675b);
        }
    }

    public x(m2.a aVar, List list) {
        this.f19674a = 1;
        this.f19675b = list;
    }
}
