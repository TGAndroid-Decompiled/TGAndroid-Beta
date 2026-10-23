package e3;

import c3.d0;
import c3.f0;
import c3.l0;
import e2.m0;
import java.math.RoundingMode;
import v7.u6;
public final class e {
    public final d f8326a;
    public final l0 f8327b;
    public final int f8328c;
    public final int d;
    public final long e;
    public int f8329f;
    public int f8330g;
    public int h;
    public int f8331i;
    public int f8332j;
    public int f8333k;
    public long f8334l;
    public long[] f8335m;
    public int[] f8336n;

    public e(int i10, d dVar, l0 l0Var) {
        int i11;
        int i12;
        int i13 = dVar.d;
        this.f8326a = dVar;
        int a2 = dVar.a();
        boolean z10 = true;
        if (a2 != 1 && a2 != 2) {
            z10 = false;
        }
        u6.g(z10);
        if (a2 == 2) {
            i11 = 1667497984;
        } else {
            i11 = 1651965952;
        }
        int i14 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f8328c = i11 | i14;
        long j10 = dVar.f8324c;
        String str = m0.f8259a;
        this.e = m0.a0(i13, dVar.f8323b * 1000000, j10, RoundingMode.DOWN);
        this.f8327b = l0Var;
        if (a2 == 2) {
            i12 = i14 | 1650720768;
        } else {
            i12 = -1;
        }
        this.d = i12;
        this.f8334l = -1L;
        this.f8335m = new long[512];
        this.f8336n = new int[512];
        this.f8329f = i13;
    }

    public final f0 a(int i10) {
        return new f0(((this.e * 1) / this.f8329f) * this.f8336n[i10], this.f8335m[i10]);
    }

    public final d0 b(long j10) {
        if (this.f8333k == 0) {
            f0 f0Var = new f0(0L, this.f8334l);
            return new d0(f0Var, f0Var);
        }
        int i10 = (int) (j10 / ((this.e * 1) / this.f8329f));
        int e = m0.e(this.f8336n, i10, true, true);
        if (this.f8336n[e] == i10) {
            f0 a2 = a(e);
            return new d0(a2, a2);
        }
        f0 a10 = a(e);
        int i11 = e + 1;
        if (i11 < this.f8335m.length) {
            return new d0(a10, a(i11));
        }
        return new d0(a10, a10);
    }
}
