package i2;

import e9.x1;
import java.util.List;
public final class z implements e2.o, m4.h1 {
    public final int f8130a;
    public final List f8131b;

    public z(int i10, x1 x1Var) {
        this.f8130a = i10;
        this.f8131b = x1Var;
    }

    @Override
    public Object f(m4.f0 f0Var, m4.w wVar, int i10) {
        switch (this.f8130a) {
            case 2:
                return f0Var.l(wVar, this.f8131b);
            default:
                return f0Var.l(wVar, this.f8131b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8130a) {
            case 0:
                ((b2.d1) obj).I(this.f8131b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public z(j2.a aVar, List list) {
        this.f8130a = 1;
        this.f8131b = list;
    }
}
