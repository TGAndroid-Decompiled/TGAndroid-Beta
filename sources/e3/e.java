package e3;

import a8.yb;
import c3.a0;
import c3.c0;
import c3.j0;
import e2.n0;
import java.math.RoundingMode;
public final class e {
    public final d f9759a;
    public final j0 f9760b;
    public final int f9761c;
    public final int d;
    public final long e;
    public int f9762f;
    public int f9763g;
    public int h;
    public int f9764i;
    public int f9765j;
    public int f9766k;
    public long f9767l;
    public long[] f9768m;
    public int[] f9769n;

    public e(int i10, d dVar, j0 j0Var) {
        int i11;
        int i12;
        int i13 = dVar.d;
        this.f9759a = dVar;
        int a2 = dVar.a();
        boolean z10 = true;
        if (a2 != 1 && a2 != 2) {
            z10 = false;
        }
        yb.g(z10);
        if (a2 == 2) {
            i11 = 1667497984;
        } else {
            i11 = 1651965952;
        }
        int i14 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f9761c = i11 | i14;
        long j10 = dVar.f9757c;
        String str = n0.f9691a;
        this.e = n0.a0(i13, dVar.f9756b * 1000000, j10, RoundingMode.DOWN);
        this.f9760b = j0Var;
        if (a2 == 2) {
            i12 = i14 | 1650720768;
        } else {
            i12 = -1;
        }
        this.d = i12;
        this.f9767l = -1L;
        this.f9768m = new long[512];
        this.f9769n = new int[512];
        this.f9762f = i13;
    }

    public final c0 a(int i10) {
        return new c0(((this.e * 1) / this.f9762f) * this.f9769n[i10], this.f9768m[i10]);
    }

    public final a0 b(long j10) {
        if (this.f9766k == 0) {
            c0 c0Var = new c0(0L, this.f9767l);
            return new a0(c0Var, c0Var);
        }
        int i10 = (int) (j10 / ((this.e * 1) / this.f9762f));
        int e = n0.e(this.f9769n, i10, true, true);
        if (this.f9769n[e] == i10) {
            c0 a2 = a(e);
            return new a0(a2, a2);
        }
        c0 a10 = a(e);
        int i11 = e + 1;
        if (i11 < this.f9768m.length) {
            return new a0(a10, a(i11));
        }
        return new a0(a10, a10);
    }
}
