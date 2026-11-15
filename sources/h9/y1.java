package h9;

import a8.ja;
public final class y1 extends r0 {
    public static final y1 f13775n;
    public final transient p1 f13776e;
    public final transient int f13777f;
    public transient q0 h;

    static {
        ?? obj = new Object();
        obj.d(3);
        f13775n = new y1(obj);
    }

    public y1(p1 p1Var) {
        this.f13776e = p1Var;
        long j3 = 0;
        int i7 = 0;
        while (true) {
            int i10 = p1Var.f13725c;
            if (i7 < i10) {
                ja.j(i7, i10);
                j3 += p1Var.f13724b[i7];
                i7++;
            } else {
                this.f13777f = c8.g1.e(j3);
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
        return this.f13777f;
    }
}
