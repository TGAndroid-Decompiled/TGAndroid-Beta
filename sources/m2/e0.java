package m2;

import o4.l1;
public final class e0 implements g2.p, g2.k {
    public final long f18854a;

    public e0(long j10) {
        this.f18854a = j10;
    }

    @Override
    public void accept(Object obj) {
        ((l1) obj).f(this.f18854a);
    }

    @Override
    public void invoke(Object obj) {
        x xVar;
        o0 o0Var = (o0) obj;
        s0 s0Var = o0Var.f18955b;
        if (o0Var.equals(s0Var.f18989j) && (xVar = s0Var.f18993n) != null) {
            xVar.g(this.f18854a);
        }
    }
}
