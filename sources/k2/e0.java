package k2;

import m4.m1;
public final class e0 implements e2.o, e2.j {
    public final long f14680a;

    public e0(long j10) {
        this.f14680a = j10;
    }

    @Override
    public void accept(Object obj) {
        ((m1) obj).g(this.f14680a);
    }

    @Override
    public void invoke(Object obj) {
        x xVar;
        p0 p0Var = (p0) obj;
        t0 t0Var = p0Var.f14776b;
        if (p0Var.equals(t0Var.f14808j) && (xVar = t0Var.f14812n) != null) {
            xVar.e(this.f14680a);
        }
    }
}
