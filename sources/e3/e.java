package e3;

import c3.a0;
import c3.c0;
import c3.k0;
import e2.l0;
import java.math.RoundingMode;
import v7.t6;
public final class e {
    public final d f6235a;
    public final k0 f6236b;
    public final int f6237c;
    public final int d;
    public final long e;
    public int f6238f;
    public int f6239g;
    public int h;
    public int f6240i;
    public int f6241j;
    public int f6242k;
    public long f6243l;
    public long[] f6244m;
    public int[] f6245n;

    public e(int i10, d dVar, k0 k0Var) {
        int i11;
        int i12;
        int i13 = dVar.d;
        this.f6235a = dVar;
        int a2 = dVar.a();
        boolean z10 = true;
        if (a2 != 1 && a2 != 2) {
            z10 = false;
        }
        t6.f(z10);
        if (a2 == 2) {
            i11 = 1667497984;
        } else {
            i11 = 1651965952;
        }
        int i14 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f6237c = i11 | i14;
        long j10 = dVar.f6233c;
        String str = l0.f6165a;
        this.e = l0.a0(i13, dVar.f6232b * 1000000, j10, RoundingMode.DOWN);
        this.f6236b = k0Var;
        if (a2 == 2) {
            i12 = i14 | 1650720768;
        } else {
            i12 = -1;
        }
        this.d = i12;
        this.f6243l = -1L;
        this.f6244m = new long[512];
        this.f6245n = new int[512];
        this.f6238f = i13;
    }

    public final c0 a(int i10) {
        return new c0(((this.e * 1) / this.f6238f) * this.f6245n[i10], this.f6244m[i10]);
    }

    public final a0 b(long j10) {
        if (this.f6242k == 0) {
            c0 c0Var = new c0(0L, this.f6243l);
            return new a0(c0Var, c0Var);
        }
        int i10 = (int) (j10 / ((this.e * 1) / this.f6238f));
        int e = l0.e(this.f6245n, i10, true, true);
        if (this.f6245n[e] == i10) {
            c0 a2 = a(e);
            return new a0(a2, a2);
        }
        c0 a10 = a(e);
        int i11 = e + 1;
        if (i11 < this.f6244m.length) {
            return new a0(a10, a(i11));
        }
        return new a0(a10, a10);
    }
}
