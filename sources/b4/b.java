package b4;

import b8.zb;
import g2.n0;
import g9.g0;
import g9.i0;
import g9.n1;
import g9.s1;
import java.util.List;
public final class b implements d {
    public static final g9.n f2355c = new g9.n(new a3.j(9), n1.f12107b);
    public final i0 f2356a;
    public final long[] f2357b;

    public b(g9.s1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: b4.b.<init>(g9.s1):void");
    }

    @Override
    public final int d(long j10) {
        int b10 = n0.b(this.f2357b, j10, false);
        if (b10 < this.f2356a.size()) {
            return b10;
        }
        return -1;
    }

    @Override
    public final long h(int i3) {
        boolean z10;
        if (i3 < this.f2356a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        return this.f2357b[i3];
    }

    @Override
    public final List p(long j10) {
        int f10 = n0.f(this.f2357b, j10, false);
        if (f10 == -1) {
            g0 g0Var = i0.f12083b;
            return s1.f12146e;
        }
        return (i0) this.f2356a.get(f10);
    }

    @Override
    public final int t() {
        return this.f2356a.size();
    }
}
