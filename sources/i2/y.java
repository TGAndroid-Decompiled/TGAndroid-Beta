package i2;

import java.util.List;
public final class y implements e2.m, m4.g1 {
    public final int f10400a;
    public final List f10401b;

    public y(int i10, e9.a1 a1Var) {
        this.f10400a = i10;
        this.f10401b = a1Var;
    }

    @Override
    public Object i(m4.b0 b0Var, m4.r rVar, int i10) {
        switch (this.f10400a) {
            case 2:
                return b0Var.l(rVar, this.f10401b);
            default:
                return b0Var.l(rVar, this.f10401b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10400a) {
            case 0:
                ((b2.z0) obj).onCues(this.f10401b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public y(j2.a aVar, List list) {
        this.f10400a = 1;
        this.f10401b = list;
    }
}
