package e9;

import v7.u6;
public final class z0 extends n0 {
    public final v0 f8541c;

    public z0(v0 v0Var) {
        this.f8541c = v0Var;
    }

    @Override
    public final Object get(int i10) {
        v0 v0Var = this.f8541c;
        switch (v0Var.d) {
            case 0:
                u1 u1Var = ((d2) v0Var.e).e;
                u6.j(i10, u1Var.f8515c);
                return new t1(u1Var, i10);
            default:
                u1 u1Var2 = ((d2) v0Var.e).e;
                u6.j(i10, u1Var2.f8515c);
                return u1Var2.f8513a[i10];
        }
    }

    @Override
    public final boolean q() {
        return this.f8541c.q();
    }

    @Override
    public final int size() {
        return this.f8541c.size();
    }
}
