package e3;

import c3.b0;
import c3.d0;
import c3.j0;
import e2.m0;
import java.math.RoundingMode;
import v7.u6;
public final class e {
    public final d f8320a;
    public final j0 f8321b;
    public final int f8322c;
    public final int d;
    public final long e;
    public int f8323f;
    public int f8324g;
    public int h;
    public int f8325i;
    public int f8326j;
    public int f8327k;
    public long f8328l;
    public long[] f8329m;
    public int[] f8330n;

    public e(int i10, d dVar, j0 j0Var) {
        int i11;
        int i12;
        int i13 = dVar.d;
        this.f8320a = dVar;
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
        this.f8322c = i11 | i14;
        long j10 = dVar.f8318c;
        String str = m0.f8253a;
        this.e = m0.a0(i13, dVar.f8317b * 1000000, j10, RoundingMode.DOWN);
        this.f8321b = j0Var;
        if (a2 == 2) {
            i12 = i14 | 1650720768;
        } else {
            i12 = -1;
        }
        this.d = i12;
        this.f8328l = -1L;
        this.f8329m = new long[512];
        this.f8330n = new int[512];
        this.f8323f = i13;
    }

    public final d0 a(int i10) {
        return new d0(((this.e * 1) / this.f8323f) * this.f8330n[i10], this.f8329m[i10]);
    }

    public final b0 b(long j10) {
        if (this.f8327k == 0) {
            d0 d0Var = new d0(0L, this.f8328l);
            return new b0(d0Var, d0Var);
        }
        int i10 = (int) (j10 / ((this.e * 1) / this.f8323f));
        int e = m0.e(this.f8330n, i10, true, true);
        if (this.f8330n[e] == i10) {
            d0 a2 = a(e);
            return new b0(a2, a2);
        }
        d0 a10 = a(e);
        int i11 = e + 1;
        if (i11 < this.f8329m.length) {
            return new b0(a10, a(i11));
        }
        return new b0(a10, a10);
    }
}
