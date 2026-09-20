package i2;

import java.util.List;
public final class y implements e2.m, m4.e1 {
    public final int f10920a;
    public final List f10921b;

    public y(int i10, e9.a1 a1Var) {
        this.f10920a = i10;
        this.f10921b = a1Var;
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        switch (this.f10920a) {
            case 2:
                return a0Var.l(rVar, this.f10921b);
            default:
                return a0Var.l(rVar, this.f10921b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10920a) {
            case 0:
                ((b2.z0) obj).onCues(this.f10921b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public y(j2.a aVar, List list) {
        this.f10920a = 1;
        this.f10921b = list;
    }
}
