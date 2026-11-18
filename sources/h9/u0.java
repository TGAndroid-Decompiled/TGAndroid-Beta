package h9;

import a8.la;
public final class u0 extends i0 {
    public final q0 f14073c;

    public u0(q0 q0Var) {
        this.f14073c = q0Var;
    }

    @Override
    public final Object get(int i7) {
        q0 q0Var = this.f14073c;
        switch (q0Var.d) {
            case 0:
                q1 q1Var = ((z1) q0Var.f14044e).f14097e;
                la.j(i7, q1Var.f14047c);
                return new p1(q1Var, i7);
            default:
                q1 q1Var2 = ((z1) q0Var.f14044e).f14097e;
                la.j(i7, q1Var2.f14047c);
                return q1Var2.f14045a[i7];
        }
    }

    @Override
    public final boolean m() {
        return this.f14073c.m();
    }

    @Override
    public final int size() {
        return this.f14073c.size();
    }
}
