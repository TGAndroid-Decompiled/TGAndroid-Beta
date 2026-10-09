package i2;

import java.util.List;
public final class z implements e2.m, m4.a1 {
    public final int f11938a;
    public final List f11939b;

    public z(int i10, e9.a1 a1Var) {
        this.f11938a = i10;
        this.f11939b = a1Var;
    }

    @Override
    public Object h(m4.b0 b0Var, m4.r rVar, int i10) {
        switch (this.f11938a) {
            case 2:
                return b0Var.l(rVar, this.f11939b);
            default:
                return b0Var.l(rVar, this.f11939b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11938a) {
            case 0:
                ((b2.z0) obj).onCues(this.f11939b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public z(j2.a aVar, List list) {
        this.f11938a = 1;
        this.f11939b = list;
    }
}
