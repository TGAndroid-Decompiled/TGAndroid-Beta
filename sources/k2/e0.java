package k2;

import m4.m1;
public final class e0 implements e2.o, e2.j {
    public final long f13880a;

    public e0(long j10) {
        this.f13880a = j10;
    }

    @Override
    public void accept(Object obj) {
        ((m1) obj).g(this.f13880a);
    }

    @Override
    public void invoke(Object obj) {
        x xVar;
        o0 o0Var = (o0) obj;
        s0 s0Var = o0Var.f13975b;
        if (o0Var.equals(s0Var.f14004j) && (xVar = s0Var.f14008n) != null) {
            xVar.b(this.f13880a);
        }
    }
}
