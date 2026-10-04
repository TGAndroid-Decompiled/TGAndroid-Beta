package i2;

import java.util.List;
public final class z implements e2.m, m4.z0 {
    public final int f11887a;
    public final List f11888b;

    public z(int i10, e9.a1 a1Var) {
        this.f11887a = i10;
        this.f11888b = a1Var;
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        switch (this.f11887a) {
            case 2:
                return a0Var.l(rVar, this.f11888b);
            default:
                return a0Var.l(rVar, this.f11888b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11887a) {
            case 0:
                ((b2.z0) obj).onCues(this.f11888b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public z(j2.a aVar, List list) {
        this.f11887a = 1;
        this.f11888b = list;
    }
}
