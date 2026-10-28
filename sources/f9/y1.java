package f9;

import a8.ed;
import a8.yb;
public final class y1 extends r0 {
    public static final y1 f10361n;
    public final transient p1 e;
    public final transient int f10362f;
    public transient q0 h;

    static {
        ?? obj = new Object();
        obj.d(3);
        f10361n = new y1(obj);
    }

    public y1(p1 p1Var) {
        this.e = p1Var;
        long j10 = 0;
        int i10 = 0;
        while (true) {
            int i11 = p1Var.f10321c;
            if (i10 < i11) {
                yb.j(i10, i11);
                j10 += p1Var.f10320b[i10];
                i10++;
            } else {
                this.f10362f = ed.e(j10);
                return;
            }
        }
    }

    @Override
    public final boolean q() {
        throw null;
    }

    @Override
    public final t0 s() {
        q0 q0Var = this.h;
        if (q0Var == null) {
            q0 q0Var2 = new q0(this, 1);
            this.h = q0Var2;
            return q0Var2;
        }
        return q0Var;
    }

    @Override
    public final int size() {
        return this.f10362f;
    }
}
