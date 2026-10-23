package i2;

import e9.x1;
import java.util.List;
public final class y implements e2.o, m4.g1 {
    public final int f12655a;
    public final List f12656b;

    public y(int i10, x1 x1Var) {
        this.f12655a = i10;
        this.f12656b = x1Var;
    }

    @Override
    public Object a(m4.f0 f0Var, m4.v vVar, int i10) {
        switch (this.f12655a) {
            case 2:
                return f0Var.l(vVar, this.f12656b);
            default:
                return f0Var.l(vVar, this.f12656b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f12655a) {
            case 0:
                ((b2.d1) obj).onCues(this.f12656b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public y(j2.a aVar, List list) {
        this.f12655a = 1;
        this.f12656b = list;
    }
}
