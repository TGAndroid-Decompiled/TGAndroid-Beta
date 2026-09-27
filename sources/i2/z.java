package i2;

import java.util.List;
public final class z implements e2.m, m4.z0 {
    public final int f10915a;
    public final List f10916b;

    public z(int i10, e9.a1 a1Var) {
        this.f10915a = i10;
        this.f10916b = a1Var;
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        switch (this.f10915a) {
            case 2:
                return a0Var.l(rVar, this.f10916b);
            default:
                return a0Var.l(rVar, this.f10916b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10915a) {
            case 0:
                ((b2.z0) obj).onCues(this.f10916b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public z(j2.a aVar, List list) {
        this.f10915a = 1;
        this.f10916b = list;
    }
}
