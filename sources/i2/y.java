package i2;

import e9.x1;
import java.util.List;
public final class y implements e2.o, m4.g1 {
    public final int f12625a;
    public final List f12626b;

    public y(int i10, x1 x1Var) {
        this.f12625a = i10;
        this.f12626b = x1Var;
    }

    @Override
    public Object e(m4.f0 f0Var, m4.v vVar, int i10) {
        switch (this.f12625a) {
            case 2:
                return f0Var.l(vVar, this.f12626b);
            default:
                return f0Var.l(vVar, this.f12626b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f12625a) {
            case 0:
                ((b2.d1) obj).onCues(this.f12626b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public y(j2.a aVar, List list) {
        this.f12625a = 1;
        this.f12626b = list;
    }
}
