package e3;

import c3.a0;
import c3.c0;
import c3.h0;
import e2.d0;
import java.math.RoundingMode;
public final class e {
    public final d f8621a;
    public final h0 f8622b;
    public final int f8623c;
    public final int d;
    public final long f8624e;
    public int f8625f;
    public int f8626g;
    public int h;
    public int f8627i;
    public int f8628j;
    public int f8629k;
    public long f8630l;
    public long[] f8631m;
    public int[] f8632n;

    public e(int i10, d dVar, h0 h0Var) {
        int i11;
        int i12;
        int i13 = dVar.d;
        this.f8621a = dVar;
        int a2 = dVar.a();
        boolean z10 = true;
        if (a2 != 1 && a2 != 2) {
            z10 = false;
        }
        e2.d.b(z10);
        if (a2 == 2) {
            i11 = 1667497984;
        } else {
            i11 = 1651965952;
        }
        int i14 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f8623c = i11 | i14;
        long j3 = dVar.f8618c;
        String str = d0.f8537a;
        this.f8624e = d0.Y(i13, dVar.f8617b * 1000000, j3, RoundingMode.DOWN);
        this.f8622b = h0Var;
        if (a2 == 2) {
            i12 = i14 | 1650720768;
        } else {
            i12 = -1;
        }
        this.d = i12;
        this.f8630l = -1L;
        this.f8631m = new long[512];
        this.f8632n = new int[512];
        this.f8625f = i13;
    }

    public final c0 a(int i10) {
        return new c0(((this.f8624e * 1) / this.f8625f) * this.f8632n[i10], this.f8631m[i10]);
    }

    public final a0 b(long j3) {
        if (this.f8629k == 0) {
            c0 c0Var = new c0(0L, this.f8630l);
            return new a0(c0Var, c0Var);
        }
        int i10 = (int) (j3 / ((this.f8624e * 1) / this.f8625f));
        int d = d0.d(this.f8632n, i10, true, true);
        if (this.f8632n[d] == i10) {
            c0 a2 = a(d);
            return new a0(a2, a2);
        }
        c0 a10 = a(d);
        int i11 = d + 1;
        if (i11 < this.f8631m.length) {
            return new a0(a10, a(i11));
        }
        return new a0(a10, a10);
    }
}
