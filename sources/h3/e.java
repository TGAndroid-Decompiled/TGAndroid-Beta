package h3;

import a8.la;
import f3.a0;
import f3.c0;
import f3.i0;
import h2.l0;
import java.math.RoundingMode;
public final class e {
    public final d f13892a;
    public final i0 f13893b;
    public final int f13894c;
    public final int d;
    public final long f13895e;
    public int f13896f;
    public int f13897g;
    public int h;
    public int f13898i;
    public int f13899j;
    public int f13900k;
    public long f13901l;
    public long[] f13902m;
    public int[] f13903n;

    public e(int i7, d dVar, i0 i0Var) {
        int i10;
        int i11;
        int i12 = dVar.d;
        this.f13892a = dVar;
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
        this.f13894c = i10 | i13;
        long j3 = dVar.f13889c;
        String str = l0.f13812a;
        this.f13895e = l0.a0(i12, dVar.f13888b * 1000000, j3, RoundingMode.DOWN);
        this.f13893b = i0Var;
        if (a10 == 2) {
            i11 = i13 | 1650720768;
        } else {
            i11 = -1;
        }
        this.d = i11;
        this.f13901l = -1L;
        this.f13902m = new long[512];
        this.f13903n = new int[512];
        this.f13896f = i12;
    }

    public final c0 a(int i7) {
        return new c0(((this.f13895e * 1) / this.f13896f) * this.f13903n[i7], this.f13902m[i7]);
    }

    public final a0 b(long j3) {
        if (this.f13900k == 0) {
            c0 c0Var = new c0(0L, this.f13901l);
            return new a0(c0Var, c0Var);
        }
        int i7 = (int) (j3 / ((this.f13895e * 1) / this.f13896f));
        int e10 = l0.e(this.f13903n, i7, true, true);
        if (this.f13903n[e10] == i7) {
            c0 a10 = a(e10);
            return new a0(a10, a10);
        }
        c0 a11 = a(e10);
        int i10 = e10 + 1;
        if (i10 < this.f13902m.length) {
            return new a0(a11, a(i10));
        }
        return new a0(a11, a11);
    }
}
