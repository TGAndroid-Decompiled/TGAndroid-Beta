package e3;

import c3.a0;
import c3.c0;
import c3.h0;
import e2.d0;
import java.math.RoundingMode;
public final class e {
    public final d f7964a;
    public final h0 f7965b;
    public final int f7966c;
    public final int d;
    public final long e;
    public int f7967f;
    public int f7968g;
    public int h;
    public int f7969i;
    public int f7970j;
    public int f7971k;
    public long f7972l;
    public long[] f7973m;
    public int[] f7974n;

    public e(int i10, d dVar, h0 h0Var) {
        int i11;
        int i12;
        int i13 = dVar.d;
        this.f7964a = dVar;
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
        this.f7966c = i11 | i14;
        long j3 = dVar.f7962c;
        String str = d0.f7888a;
        this.e = d0.Y(i13, dVar.f7961b * 1000000, j3, RoundingMode.DOWN);
        this.f7965b = h0Var;
        if (a2 == 2) {
            i12 = i14 | 1650720768;
        } else {
            i12 = -1;
        }
        this.d = i12;
        this.f7972l = -1L;
        this.f7973m = new long[512];
        this.f7974n = new int[512];
        this.f7967f = i13;
    }

    public final c0 a(int i10) {
        return new c0(((this.e * 1) / this.f7967f) * this.f7974n[i10], this.f7973m[i10]);
    }

    public final a0 b(long j3) {
        if (this.f7971k == 0) {
            c0 c0Var = new c0(0L, this.f7972l);
            return new a0(c0Var, c0Var);
        }
        int i10 = (int) (j3 / ((this.e * 1) / this.f7967f));
        int d = d0.d(this.f7974n, i10, true, true);
        if (this.f7974n[d] == i10) {
            c0 a2 = a(d);
            return new a0(a2, a2);
        }
        c0 a10 = a(d);
        int i11 = d + 1;
        if (i11 < this.f7973m.length) {
            return new a0(a10, a(i11));
        }
        return new a0(a10, a10);
    }
}
