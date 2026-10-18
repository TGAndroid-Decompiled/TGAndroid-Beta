package i2;

import e9.x1;
import java.util.List;
public final class y implements e2.o, m4.g1 {
    public final int f12623a;
    public final List f12624b;

    public y(int i10, x1 x1Var) {
        this.f12623a = i10;
        this.f12624b = x1Var;
    }

    @Override
    public Object e(m4.f0 f0Var, m4.v vVar, int i10) {
        switch (this.f12623a) {
            case 2:
                return f0Var.l(vVar, this.f12624b);
            default:
                return f0Var.l(vVar, this.f12624b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f12623a) {
            case 0:
                ((b2.d1) obj).onCues(this.f12624b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public y(j2.a aVar, List list) {
        this.f12623a = 1;
        this.f12624b = list;
    }
}
