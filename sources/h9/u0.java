package h9;

import a8.ja;
public final class u0 extends i0 {
    public final q0 f13755c;

    public u0(q0 q0Var) {
        this.f13755c = q0Var;
    }

    @Override
    public final Object get(int i7) {
        q0 q0Var = this.f13755c;
        switch (q0Var.d) {
            case 0:
                p1 p1Var = ((y1) q0Var.f13731e).f13776e;
                ja.j(i7, p1Var.f13725c);
                return new o1(p1Var, i7);
            default:
                p1 p1Var2 = ((y1) q0Var.f13731e).f13776e;
                ja.j(i7, p1Var2.f13725c);
                return p1Var2.f13723a[i7];
        }
    }

    @Override
    public final boolean m() {
        return this.f13755c.m();
    }

    @Override
    public final int size() {
        return this.f13755c.size();
    }
}
