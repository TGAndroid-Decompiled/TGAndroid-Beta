package g9;

import b8.zb;
public final class u0 extends i0 {
    public final q0 f12152c;

    public u0(q0 q0Var) {
        this.f12152c = q0Var;
    }

    @Override
    public final Object get(int i3) {
        q0 q0Var = this.f12152c;
        switch (q0Var.d) {
            case 0:
                p1 p1Var = ((y1) q0Var.f12128e).f12173e;
                zb.j(i3, p1Var.f12122c);
                return new o1(p1Var, i3);
            default:
                p1 p1Var2 = ((y1) q0Var.f12128e).f12173e;
                zb.j(i3, p1Var2.f12122c);
                return p1Var2.f12120a[i3];
        }
    }

    @Override
    public final boolean m() {
        return this.f12152c.m();
    }

    @Override
    public final int size() {
        return this.f12152c.size();
    }
}
