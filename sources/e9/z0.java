package e9;

import v7.u6;
public final class z0 extends n0 {
    public final v0 f8660c;

    public z0(v0 v0Var) {
        this.f8660c = v0Var;
    }

    @Override
    public final Object get(int i10) {
        v0 v0Var = this.f8660c;
        switch (v0Var.d) {
            case 0:
                u1 u1Var = ((d2) v0Var.e).e;
                u6.j(i10, u1Var.f8634c);
                return new t1(u1Var, i10);
            default:
                u1 u1Var2 = ((d2) v0Var.e).e;
                u6.j(i10, u1Var2.f8634c);
                return u1Var2.f8632a[i10];
        }
    }

    @Override
    public final boolean q() {
        return this.f8660c.q();
    }

    @Override
    public final int size() {
        return this.f8660c.size();
    }
}
