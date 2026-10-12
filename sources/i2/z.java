package i2;

import java.util.List;
public final class z implements e2.m, m4.b1 {
    public final int f11936a;
    public final List f11937b;

    public z(int i10, e9.a1 a1Var) {
        this.f11936a = i10;
        this.f11937b = a1Var;
    }

    @Override
    public Object h(m4.c0 c0Var, m4.r rVar, int i10) {
        switch (this.f11936a) {
            case 2:
                return c0Var.l(rVar, this.f11937b);
            default:
                return c0Var.l(rVar, this.f11937b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11936a) {
            case 0:
                ((b2.z0) obj).onCues(this.f11937b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public z(j2.a aVar, List list) {
        this.f11936a = 1;
        this.f11937b = list;
    }
}
