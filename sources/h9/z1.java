package h9;

import a8.ia;
public final class z1 extends r0 {
    public static final z1 f14424n;
    public final transient q1 f14425e;
    public final transient int f14426f;
    public transient q0 h;

    static {
        ?? obj = new Object();
        obj.d(3);
        f14424n = new z1(obj);
    }

    public z1(q1 q1Var) {
        this.f14425e = q1Var;
        long j3 = 0;
        int i7 = 0;
        while (true) {
            int i10 = q1Var.f14375c;
            if (i7 < i10) {
                ia.j(i7, i10);
                j3 += q1Var.f14374b[i7];
                i7++;
            } else {
                this.f14426f = c8.e1.e(j3);
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
        return this.f14426f;
    }
}
