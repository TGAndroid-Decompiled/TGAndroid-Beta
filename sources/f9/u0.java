package f9;

import a8.yb;
public final class u0 extends i0 {
    public final q0 f10347c;

    public u0(q0 q0Var) {
        this.f10347c = q0Var;
    }

    @Override
    public final Object get(int i10) {
        q0 q0Var = this.f10347c;
        switch (q0Var.d) {
            case 0:
                p1 p1Var = ((y1) q0Var.e).e;
                yb.j(i10, p1Var.f10322c);
                return new o1(p1Var, i10);
            default:
                p1 p1Var2 = ((y1) q0Var.e).e;
                yb.j(i10, p1Var2.f10322c);
                return p1Var2.f10320a[i10];
        }
    }

    @Override
    public final boolean q() {
        return this.f10347c.q();
    }

    @Override
    public final int size() {
        return this.f10347c.size();
    }
}
