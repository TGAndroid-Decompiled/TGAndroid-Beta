package e3;

import c3.b0;
import c3.d0;
import c3.j0;
import e2.m0;
import java.math.RoundingMode;
import v7.u6;
public final class e {
    public final d f8321a;
    public final j0 f8322b;
    public final int f8323c;
    public final int d;
    public final long e;
    public int f8324f;
    public int f8325g;
    public int h;
    public int f8326i;
    public int f8327j;
    public int f8328k;
    public long f8329l;
    public long[] f8330m;
    public int[] f8331n;

    public e(int i10, d dVar, j0 j0Var) {
        int i11;
        int i12;
        int i13 = dVar.d;
        this.f8321a = dVar;
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
        this.f8323c = i11 | i14;
        long j10 = dVar.f8319c;
        String str = m0.f8254a;
        this.e = m0.a0(i13, dVar.f8318b * 1000000, j10, RoundingMode.DOWN);
        this.f8322b = j0Var;
        if (a2 == 2) {
            i12 = i14 | 1650720768;
        } else {
            i12 = -1;
        }
        this.d = i12;
        this.f8329l = -1L;
        this.f8330m = new long[512];
        this.f8331n = new int[512];
        this.f8324f = i13;
    }

    public final d0 a(int i10) {
        return new d0(((this.e * 1) / this.f8324f) * this.f8331n[i10], this.f8330m[i10]);
    }

    public final b0 b(long j10) {
        if (this.f8328k == 0) {
            d0 d0Var = new d0(0L, this.f8329l);
            return new b0(d0Var, d0Var);
        }
        int i10 = (int) (j10 / ((this.e * 1) / this.f8324f));
        int e = m0.e(this.f8331n, i10, true, true);
        if (this.f8331n[e] == i10) {
            d0 a2 = a(e);
            return new b0(a2, a2);
        }
        d0 a10 = a(e);
        int i11 = e + 1;
        if (i11 < this.f8330m.length) {
            return new b0(a10, a(i11));
        }
        return new b0(a10, a10);
    }
}
