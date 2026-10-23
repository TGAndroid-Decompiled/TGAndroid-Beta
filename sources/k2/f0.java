package k2;

import m4.m1;
public final class f0 implements e2.o, e2.j {
    public final long f14727a;

    public f0(long j10) {
        this.f14727a = j10;
    }

    @Override
    public void accept(Object obj) {
        ((m1) obj).g(this.f14727a);
    }

    @Override
    public void invoke(Object obj) {
        y yVar;
        p0 p0Var = (p0) obj;
        t0 t0Var = p0Var.f14822b;
        if (p0Var.equals(t0Var.f14851j) && (yVar = t0Var.f14855n) != null) {
            yVar.a(this.f14727a);
        }
    }
}
