package h9;

import a8.ma;
public final class u0 extends i0 {
    public final q0 f14064c;

    public u0(q0 q0Var) {
        this.f14064c = q0Var;
    }

    @Override
    public final Object get(int i7) {
        q0 q0Var = this.f14064c;
        switch (q0Var.d) {
            case 0:
                p1 p1Var = ((y1) q0Var.f14040e).f14085e;
                ma.j(i7, p1Var.f14034c);
                return new o1(p1Var, i7);
            default:
                p1 p1Var2 = ((y1) q0Var.f14040e).f14085e;
                ma.j(i7, p1Var2.f14034c);
                return p1Var2.f14032a[i7];
        }
    }

    @Override
    public final boolean m() {
        return this.f14064c.m();
    }

    @Override
    public final int size() {
        return this.f14064c.size();
    }
}
