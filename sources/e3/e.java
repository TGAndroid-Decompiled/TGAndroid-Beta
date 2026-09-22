package e3;

import c3.a0;
import c3.c0;
import c3.h0;
import e2.d0;
import java.math.RoundingMode;
public final class e {
    public final d f7961a;
    public final h0 f7962b;
    public final int f7963c;
    public final int d;
    public final long e;
    public int f7964f;
    public int f7965g;
    public int h;
    public int f7966i;
    public int f7967j;
    public int f7968k;
    public long f7969l;
    public long[] f7970m;
    public int[] f7971n;

    public e(int i10, d dVar, h0 h0Var) {
        int i11;
        int i12;
        int i13 = dVar.d;
        this.f7961a = dVar;
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
        this.f7963c = i11 | i14;
        long j3 = dVar.f7959c;
        String str = d0.f7885a;
        this.e = d0.Y(i13, dVar.f7958b * 1000000, j3, RoundingMode.DOWN);
        this.f7962b = h0Var;
        if (a2 == 2) {
            i12 = i14 | 1650720768;
        } else {
            i12 = -1;
        }
        this.d = i12;
        this.f7969l = -1L;
        this.f7970m = new long[512];
        this.f7971n = new int[512];
        this.f7964f = i13;
    }

    public final c0 a(int i10) {
        return new c0(((this.e * 1) / this.f7964f) * this.f7971n[i10], this.f7970m[i10]);
    }

    public final a0 b(long j3) {
        if (this.f7968k == 0) {
            c0 c0Var = new c0(0L, this.f7969l);
            return new a0(c0Var, c0Var);
        }
        int i10 = (int) (j3 / ((this.e * 1) / this.f7964f));
        int d = d0.d(this.f7971n, i10, true, true);
        if (this.f7971n[d] == i10) {
            c0 a2 = a(d);
            return new a0(a2, a2);
        }
        c0 a10 = a(d);
        int i11 = d + 1;
        if (i11 < this.f7970m.length) {
            return new a0(a10, a(i11));
        }
        return new a0(a10, a10);
    }
}
