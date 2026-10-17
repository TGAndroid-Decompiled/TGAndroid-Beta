package k2;

import m4.m1;
public final class e0 implements e2.o, e2.j {
    public final long f14675a;

    public e0(long j10) {
        this.f14675a = j10;
    }

    @Override
    public void accept(Object obj) {
        ((m1) obj).g(this.f14675a);
    }

    @Override
    public void invoke(Object obj) {
        x xVar;
        p0 p0Var = (p0) obj;
        t0 t0Var = p0Var.f14771b;
        if (p0Var.equals(t0Var.f14803j) && (xVar = t0Var.f14807n) != null) {
            xVar.e(this.f14675a);
        }
    }
}
