package i2;

import e9.x1;
import java.util.List;
public final class x implements e2.o, m4.g1 {
    public final int f12624a;
    public final List f12625b;

    public x(int i10, x1 x1Var) {
        this.f12624a = i10;
        this.f12625b = x1Var;
    }

    @Override
    public Object e(m4.f0 f0Var, m4.v vVar, int i10) {
        switch (this.f12624a) {
            case 2:
                return f0Var.l(vVar, this.f12625b);
            default:
                return f0Var.l(vVar, this.f12625b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f12624a) {
            case 0:
                ((b2.d1) obj).onCues(this.f12625b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public x(j2.a aVar, List list) {
        this.f12624a = 1;
        this.f12625b = list;
    }
}
