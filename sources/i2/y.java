package i2;

import e9.x1;
import java.util.List;
public final class y implements e2.o, m4.h1 {
    public final int f11226a;
    public final List f11227b;

    public y(int i10, x1 x1Var) {
        this.f11226a = i10;
        this.f11227b = x1Var;
    }

    @Override
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        switch (this.f11226a) {
            case 2:
                return f0Var.l(wVar, this.f11227b);
            default:
                return f0Var.l(wVar, this.f11227b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11226a) {
            case 0:
                ((b2.e1) obj).onCues(this.f11227b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public y(j2.a aVar, List list) {
        this.f11226a = 1;
        this.f11227b = list;
    }
}
