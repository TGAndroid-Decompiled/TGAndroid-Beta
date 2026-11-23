package h9;

import a8.ma;
public final class u0 extends i0 {
    public final q0 f14068c;

    public u0(q0 q0Var) {
        this.f14068c = q0Var;
    }

    @Override
    public final Object get(int i7) {
        q0 q0Var = this.f14068c;
        switch (q0Var.d) {
            case 0:
                q1 q1Var = ((z1) q0Var.f14039e).f14092e;
                ma.j(i7, q1Var.f14042c);
                return new p1(q1Var, i7);
            default:
                q1 q1Var2 = ((z1) q0Var.f14039e).f14092e;
                ma.j(i7, q1Var2.f14042c);
                return q1Var2.f14040a[i7];
        }
    }

    @Override
    public final boolean m() {
        return this.f14068c.m();
    }

    @Override
    public final int size() {
        return this.f14068c.size();
    }
}
