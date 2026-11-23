package c4;

import a8.ma;
import h2.l0;
import h9.g0;
import h9.i0;
import h9.o1;
import h9.t1;
import java.util.List;
public final class b implements d {
    public static final h9.n f4370c = new h9.n(new a3.l(25), o1.f14028b);
    public final i0 f4371a;
    public final long[] f4372b;

    public b(h9.t1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: c4.b.<init>(h9.t1):void");
    }

    @Override
    public final int d(long j3) {
        int b10 = l0.b(this.f4372b, j3, false);
        if (b10 < this.f4371a.size()) {
            return b10;
        }
        return -1;
    }

    @Override
    public final long h(int i7) {
        boolean z10;
        if (i7 < this.f4371a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        return this.f4372b[i7];
    }

    @Override
    public final List m(long j3) {
        int f10 = l0.f(this.f4372b, j3, false);
        if (f10 == -1) {
            g0 g0Var = i0.f13998b;
            return t1.f14066e;
        }
        return (i0) this.f4371a.get(f10);
    }

    @Override
    public final int p() {
        return this.f4371a.size();
    }
}
