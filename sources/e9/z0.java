package e9;

import v7.t6;
public final class z0 extends n0 {
    public final v0 f6455c;

    public z0(v0 v0Var) {
        this.f6455c = v0Var;
    }

    @Override
    public final Object get(int i10) {
        v0 v0Var = this.f6455c;
        switch (v0Var.d) {
            case 0:
                u1 u1Var = ((d2) v0Var.e).e;
                t6.j(i10, u1Var.f6429c);
                return new t1(u1Var, i10);
            default:
                u1 u1Var2 = ((d2) v0Var.e).e;
                t6.j(i10, u1Var2.f6429c);
                return u1Var2.f6427a[i10];
        }
    }

    @Override
    public final boolean q() {
        return this.f6455c.q();
    }

    @Override
    public final int size() {
        return this.f6455c.size();
    }
}
