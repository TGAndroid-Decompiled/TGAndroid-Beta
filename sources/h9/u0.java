package h9;

import a8.ia;
public final class u0 extends i0 {
    public final q0 f14399c;

    public u0(q0 q0Var) {
        this.f14399c = q0Var;
    }

    @Override
    public final Object get(int i7) {
        q0 q0Var = this.f14399c;
        switch (q0Var.d) {
            case 0:
                q1 q1Var = ((z1) q0Var.f14370e).f14423e;
                ia.j(i7, q1Var.f14373c);
                return new p1(q1Var, i7);
            default:
                q1 q1Var2 = ((z1) q0Var.f14370e).f14423e;
                ia.j(i7, q1Var2.f14373c);
                return q1Var2.f14371a[i7];
        }
    }

    @Override
    public final boolean m() {
        return this.f14399c.m();
    }

    @Override
    public final int size() {
        return this.f14399c.size();
    }
}
