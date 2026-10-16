package i2;

import e9.x1;
import java.util.List;
public final class y implements e2.o, m4.g1 {
    public final int f11230a;
    public final List f11231b;

    public y(int i10, x1 x1Var) {
        this.f11230a = i10;
        this.f11231b = x1Var;
    }

    @Override
    public Object c(m4.e0 e0Var, m4.v vVar, int i10) {
        switch (this.f11230a) {
            case 2:
                return e0Var.l(vVar, this.f11231b);
            default:
                return e0Var.l(vVar, this.f11231b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11230a) {
            case 0:
                ((b2.e1) obj).onCues(this.f11231b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public y(j2.a aVar, List list) {
        this.f11230a = 1;
        this.f11231b = list;
    }
}
