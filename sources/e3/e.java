package e3;

import c3.a0;
import c3.c0;
import c3.h0;
import e2.d0;
import java.math.RoundingMode;
public final class e {
    public final d f8849a;
    public final h0 f8850b;
    public final int f8851c;
    public final int d;
    public final long f8852e;
    public int f8853f;
    public int f8854g;
    public int h;
    public int f8855i;
    public int f8856j;
    public int f8857k;
    public long f8858l;
    public long[] f8859m;
    public int[] f8860n;

    public e(int i10, d dVar, h0 h0Var) {
        int i11;
        int i12;
        int i13 = dVar.d;
        this.f8849a = dVar;
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
        this.f8851c = i11 | i14;
        long j3 = dVar.f8846c;
        String str = d0.f8765a;
        this.f8852e = d0.Y(i13, dVar.f8845b * 1000000, j3, RoundingMode.DOWN);
        this.f8850b = h0Var;
        if (a2 == 2) {
            i12 = i14 | 1650720768;
        } else {
            i12 = -1;
        }
        this.d = i12;
        this.f8858l = -1L;
        this.f8859m = new long[512];
        this.f8860n = new int[512];
        this.f8853f = i13;
    }

    public final c0 a(int i10) {
        return new c0(((this.f8852e * 1) / this.f8853f) * this.f8860n[i10], this.f8859m[i10]);
    }

    public final a0 b(long j3) {
        if (this.f8857k == 0) {
            c0 c0Var = new c0(0L, this.f8858l);
            return new a0(c0Var, c0Var);
        }
        int i10 = (int) (j3 / ((this.f8852e * 1) / this.f8853f));
        int d = d0.d(this.f8860n, i10, true, true);
        if (this.f8860n[d] == i10) {
            c0 a2 = a(d);
            return new a0(a2, a2);
        }
        c0 a10 = a(d);
        int i11 = d + 1;
        if (i11 < this.f8859m.length) {
            return new a0(a10, a(i11));
        }
        return new a0(a10, a10);
    }
}
