package i2;

import e9.x1;
import java.util.List;
public final class z implements e2.o, m4.g1 {
    public final int f12626a;
    public final List f12627b;

    public z(int i10, x1 x1Var) {
        this.f12626a = i10;
        this.f12627b = x1Var;
    }

    @Override
    public Object e(m4.f0 f0Var, m4.v vVar, int i10) {
        switch (this.f12626a) {
            case 2:
                return f0Var.l(vVar, this.f12627b);
            default:
                return f0Var.l(vVar, this.f12627b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f12626a) {
            case 0:
                ((b2.d1) obj).onCues(this.f12627b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public z(j2.a aVar, List list) {
        this.f12626a = 1;
        this.f12627b = list;
    }
}
