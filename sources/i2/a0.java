package i2;

import java.util.List;
public final class a0 implements e2.o, m4.h1 {
    public final int f13473a;
    public final List f13474b;

    public a0(int i10, f9.s1 s1Var) {
        this.f13473a = i10;
        this.f13474b = s1Var;
    }

    @Override
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        switch (this.f13473a) {
            case 2:
                return f0Var.l(wVar, this.f13474b);
            default:
                return f0Var.l(wVar, this.f13474b);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f13473a) {
            case 0:
                ((b2.e1) obj).onCues(this.f13474b);
                return;
            default:
                ((j2.b) obj).getClass();
                return;
        }
    }

    public a0(j2.a aVar, List list) {
        this.f13473a = 1;
        this.f13474b = list;
    }
}
