package i2;

import java.util.List;
public final class z implements e2.m, m4.z0 {
    public final int f10912a;
    public final List f10913b;

    public z(int i10, e9.a1 a1Var) {
        this.f10912a = i10;
        this.f10913b = a1Var;
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        switch (this.f10912a) {
            case 2:
                return a0Var.l(rVar, this.f10913b);
            default:
                return a0Var.l(rVar, this.f10913b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10912a) {
            case 0:
                ((b2.z0) obj).onCues(this.f10913b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public z(j2.a aVar, List list) {
        this.f10912a = 1;
        this.f10913b = list;
    }
}
