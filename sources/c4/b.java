package c4;

import a8.ja;
import h2.l0;
import h9.g0;
import h9.i0;
import h9.n1;
import h9.s1;
import java.util.List;
public final class b implements d {
    public static final h9.n f4097c = new h9.n(new a3.l(24), n1.f13710b);
    public final i0 f4098a;
    public final long[] f4099b;

    public b(h9.s1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: c4.b.<init>(h9.s1):void");
    }

    @Override
    public final int d(long j3) {
        int b10 = l0.b(this.f4099b, j3, false);
        if (b10 < this.f4098a.size()) {
            return b10;
        }
        return -1;
    }

    @Override
    public final long i(int i7) {
        boolean z10;
        if (i7 < this.f4098a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        return this.f4099b[i7];
    }

    @Override
    public final List q(long j3) {
        int f10 = l0.f(this.f4099b, j3, false);
        if (f10 == -1) {
            g0 g0Var = i0.f13686b;
            return s1.f13749e;
        }
        return (i0) this.f4098a.get(f10);
    }

    @Override
    public final int u() {
        return this.f4098a.size();
    }
}
