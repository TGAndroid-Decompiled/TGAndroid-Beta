package c4;

import a8.ia;
import h2.m0;
import h9.g0;
import h9.i0;
import h9.o1;
import h9.t1;
import java.util.List;
public final class b implements d {
    public static final h9.n f5270c = new h9.n(new a3.l(28), o1.f14359b);
    public final i0 f5271a;
    public final long[] f5272b;

    public b(h9.t1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: c4.b.<init>(h9.t1):void");
    }

    @Override
    public final int d(long j3) {
        int b10 = m0.b(this.f5272b, j3, false);
        if (b10 < this.f5271a.size()) {
            return b10;
        }
        return -1;
    }

    @Override
    public final long k(int i7) {
        boolean z9;
        if (i7 < this.f5271a.size()) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        return this.f5272b[i7];
    }

    @Override
    public final List s(long j3) {
        int f10 = m0.f(this.f5272b, j3, false);
        if (f10 == -1) {
            g0 g0Var = i0.f14329b;
            return t1.f14397e;
        }
        return (i0) this.f5271a.get(f10);
    }

    @Override
    public final int y() {
        return this.f5271a.size();
    }
}
