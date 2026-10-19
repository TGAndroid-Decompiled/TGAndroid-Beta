package i2;

import e9.x1;
import java.util.List;
public final class z implements e2.o, m4.g1 {
    public final int f12628a;
    public final List f12629b;

    public z(int i10, x1 x1Var) {
        this.f12628a = i10;
        this.f12629b = x1Var;
    }

    @Override
    public Object e(m4.f0 f0Var, m4.v vVar, int i10) {
        switch (this.f12628a) {
            case 2:
                return f0Var.l(vVar, this.f12629b);
            default:
                return f0Var.l(vVar, this.f12629b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f12628a) {
            case 0:
                ((b2.d1) obj).onCues(this.f12629b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public z(j2.a aVar, List list) {
        this.f12628a = 1;
        this.f12629b = list;
    }
}
