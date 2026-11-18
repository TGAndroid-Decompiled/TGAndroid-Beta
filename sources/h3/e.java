package h3;

import a8.la;
import f3.a0;
import f3.c0;
import f3.i0;
import h2.l0;
import java.math.RoundingMode;
public final class e {
    public final d f13863a;
    public final i0 f13864b;
    public final int f13865c;
    public final int d;
    public final long f13866e;
    public int f13867f;
    public int f13868g;
    public int h;
    public int f13869i;
    public int f13870j;
    public int f13871k;
    public long f13872l;
    public long[] f13873m;
    public int[] f13874n;

    public e(int i7, d dVar, i0 i0Var) {
        int i10;
        int i11;
        int i12 = dVar.d;
        this.f13863a = dVar;
        int a10 = dVar.a();
        boolean z10 = true;
        if (a10 != 1 && a10 != 2) {
            z10 = false;
        }
        la.f(z10);
        if (a10 == 2) {
            i10 = 1667497984;
        } else {
            i10 = 1651965952;
        }
        int i13 = (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48);
        this.f13865c = i10 | i13;
        long j3 = dVar.f13860c;
        String str = l0.f13783a;
        this.f13866e = l0.a0(i12, dVar.f13859b * 1000000, j3, RoundingMode.DOWN);
        this.f13864b = i0Var;
        if (a10 == 2) {
            i11 = i13 | 1650720768;
        } else {
            i11 = -1;
        }
        this.d = i11;
        this.f13872l = -1L;
        this.f13873m = new long[512];
        this.f13874n = new int[512];
        this.f13867f = i12;
    }

    public final c0 a(int i7) {
        return new c0(((this.f13866e * 1) / this.f13867f) * this.f13874n[i7], this.f13873m[i7]);
    }

    public final a0 b(long j3) {
        if (this.f13871k == 0) {
            c0 c0Var = new c0(0L, this.f13872l);
            return new a0(c0Var, c0Var);
        }
        int i7 = (int) (j3 / ((this.f13866e * 1) / this.f13867f));
        int e10 = l0.e(this.f13874n, i7, true, true);
        if (this.f13874n[e10] == i7) {
            c0 a10 = a(e10);
            return new a0(a10, a10);
        }
        c0 a11 = a(e10);
        int i10 = e10 + 1;
        if (i10 < this.f13873m.length) {
            return new a0(a11, a(i10));
        }
        return new a0(a11, a11);
    }
}
