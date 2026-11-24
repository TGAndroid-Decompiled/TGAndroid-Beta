package defpackage;

import java.util.List;
public final class y33 implements kab {
    public static final v41 c = new v41(new g31((byte) 3), hi7.b);
    public final mm5 a;
    public final long[] b;

    public y33(defpackage.w59 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y33.<init>(w59):void");
    }

    @Override
    public final int b(long j) {
        int b = g8c.b(this.b, j, false);
        if (b < this.a.size()) {
            return b;
        }
        return -1;
    }

    @Override
    public final long h(int i) {
        boolean z;
        if (i < this.a.size()) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        return this.b[i];
    }

    @Override
    public final List l(long j) {
        int f = g8c.f(this.b, j, false);
        if (f == -1) {
            km5 km5Var = mm5.b;
            return w59.e;
        }
        return (mm5) this.a.get(f);
    }

    @Override
    public final int t() {
        return this.a.size();
    }
}
