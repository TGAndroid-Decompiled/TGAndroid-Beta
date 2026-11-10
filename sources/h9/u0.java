package h9;

import a8.ia;
public final class u0 extends i0 {
    public final q0 f14401c;

    public u0(q0 q0Var) {
        this.f14401c = q0Var;
    }

    @Override
    public final Object get(int i7) {
        q0 q0Var = this.f14401c;
        switch (q0Var.d) {
            case 0:
                q1 q1Var = ((z1) q0Var.f14372e).f14425e;
                ia.j(i7, q1Var.f14375c);
                return new p1(q1Var, i7);
            default:
                q1 q1Var2 = ((z1) q0Var.f14372e).f14425e;
                ia.j(i7, q1Var2.f14375c);
                return q1Var2.f14373a[i7];
        }
    }

    @Override
    public final boolean m() {
        return this.f14401c.m();
    }

    @Override
    public final int size() {
        return this.f14401c.size();
    }
}
