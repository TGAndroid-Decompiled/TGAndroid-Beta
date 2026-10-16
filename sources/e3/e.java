package e3;

import c3.a0;
import c3.c0;
import c3.i0;
import e2.m0;
import java.math.RoundingMode;
import v7.u6;
public final class e {
    public final d f8442a;
    public final i0 f8443b;
    public final int f8444c;
    public final int d;
    public final long e;
    public int f8445f;
    public int f8446g;
    public int h;
    public int f8447i;
    public int f8448j;
    public int f8449k;
    public long f8450l;
    public long[] f8451m;
    public int[] f8452n;

    public e(int i10, d dVar, i0 i0Var) {
        int i11;
        int i12;
        int i13 = dVar.d;
        this.f8442a = dVar;
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
        this.f8444c = i11 | i14;
        long j10 = dVar.f8440c;
        String str = m0.f8375a;
        this.e = m0.a0(i13, dVar.f8439b * 1000000, j10, RoundingMode.DOWN);
        this.f8443b = i0Var;
        if (a2 == 2) {
            i12 = i14 | 1650720768;
        } else {
            i12 = -1;
        }
        this.d = i12;
        this.f8450l = -1L;
        this.f8451m = new long[512];
        this.f8452n = new int[512];
        this.f8445f = i13;
    }

    public final c0 a(int i10) {
        return new c0(((this.e * 1) / this.f8445f) * this.f8452n[i10], this.f8451m[i10]);
    }

    public final a0 b(long j10) {
        if (this.f8449k == 0) {
            c0 c0Var = new c0(0L, this.f8450l);
            return new a0(c0Var, c0Var);
        }
        int i10 = (int) (j10 / ((this.e * 1) / this.f8445f));
        int e = m0.e(this.f8452n, i10, true, true);
        if (this.f8452n[e] == i10) {
            c0 a2 = a(e);
            return new a0(a2, a2);
        }
        c0 a10 = a(e);
        int i11 = e + 1;
        if (i11 < this.f8451m.length) {
            return new a0(a10, a(i11));
        }
        return new a0(a10, a10);
    }
}
