package e9;

import v7.c8;
import v7.t6;
public final class d2 extends w0 {
    public static final d2 f6346n;
    public final transient u1 e;
    public final transient int f6347f;
    public transient v0 h;

    static {
        ?? obj = new Object();
        obj.d(3);
        f6346n = new d2(obj);
    }

    public d2(u1 u1Var) {
        this.e = u1Var;
        long j10 = 0;
        int i10 = 0;
        while (true) {
            int i11 = u1Var.f6429c;
            if (i10 < i11) {
                t6.j(i10, i11);
                j10 += u1Var.f6428b[i10];
                i10++;
            } else {
                this.f6347f = c8.e(j10);
                return;
            }
        }
    }

    @Override
    public final boolean q() {
        throw null;
    }

    @Override
    public final y0 s() {
        v0 v0Var = this.h;
        if (v0Var == null) {
            v0 v0Var2 = new v0(this, 1);
            this.h = v0Var2;
            return v0Var2;
        }
        return v0Var;
    }

    @Override
    public final int size() {
        return this.f6347f;
    }
}
