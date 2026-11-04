package g9;

import b8.od;
import b8.zb;
public final class y1 extends r0 {
    public static final y1 f12172n;
    public final transient p1 f12173e;
    public final transient int f12174f;
    public transient q0 h;

    static {
        ?? obj = new Object();
        obj.d(3);
        f12172n = new y1(obj);
    }

    public y1(p1 p1Var) {
        this.f12173e = p1Var;
        long j10 = 0;
        int i3 = 0;
        while (true) {
            int i10 = p1Var.f12122c;
            if (i3 < i10) {
                zb.j(i3, i10);
                j10 += p1Var.f12121b[i3];
                i3++;
            } else {
                this.f12174f = od.e(j10);
                return;
            }
        }
    }

    @Override
    public final boolean m() {
        throw null;
    }

    @Override
    public final t0 o() {
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
        return this.f12174f;
    }
}
