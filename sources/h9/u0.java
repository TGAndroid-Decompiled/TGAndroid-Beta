package h9;

import a8.la;
public final class u0 extends i0 {
    public final q0 f14076c;

    public u0(q0 q0Var) {
        this.f14076c = q0Var;
    }

    @Override
    public final Object get(int i7) {
        q0 q0Var = this.f14076c;
        switch (q0Var.d) {
            case 0:
                q1 q1Var = ((z1) q0Var.f14047e).f14100e;
                la.j(i7, q1Var.f14050c);
                return new p1(q1Var, i7);
            default:
                q1 q1Var2 = ((z1) q0Var.f14047e).f14100e;
                la.j(i7, q1Var2.f14050c);
                return q1Var2.f14048a[i7];
        }
    }

    @Override
    public final boolean m() {
        return this.f14076c.m();
    }

    @Override
    public final int size() {
        return this.f14076c.size();
    }
}
