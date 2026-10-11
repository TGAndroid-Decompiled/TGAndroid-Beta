package e3;

import c3.a0;
import c3.c0;
import c3.h0;
import e2.d0;
import java.math.RoundingMode;
public final class e {
    public final d f8615a;
    public final h0 f8616b;
    public final int f8617c;
    public final int d;
    public final long f8618e;
    public int f8619f;
    public int f8620g;
    public int h;
    public int f8621i;
    public int f8622j;
    public int f8623k;
    public long f8624l;
    public long[] f8625m;
    public int[] f8626n;

    public e(int i10, d dVar, h0 h0Var) {
        int i11;
        int i12;
        int i13 = dVar.d;
        this.f8615a = dVar;
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
        this.f8617c = i11 | i14;
        long j3 = dVar.f8612c;
        String str = d0.f8531a;
        this.f8618e = d0.X(i13, dVar.f8611b * 1000000, j3, RoundingMode.DOWN);
        this.f8616b = h0Var;
        if (a2 == 2) {
            i12 = i14 | 1650720768;
        } else {
            i12 = -1;
        }
        this.d = i12;
        this.f8624l = -1L;
        this.f8625m = new long[512];
        this.f8626n = new int[512];
        this.f8619f = i13;
    }

    public final c0 a(int i10) {
        return new c0(((this.f8618e * 1) / this.f8619f) * this.f8626n[i10], this.f8625m[i10]);
    }

    public final a0 b(long j3) {
        if (this.f8623k == 0) {
            c0 c0Var = new c0(0L, this.f8624l);
            return new a0(c0Var, c0Var);
        }
        int i10 = (int) (j3 / ((this.f8618e * 1) / this.f8619f));
        int d = d0.d(this.f8626n, i10, true, true);
        if (this.f8626n[d] == i10) {
            c0 a2 = a(d);
            return new a0(a2, a2);
        }
        c0 a10 = a(d);
        int i11 = d + 1;
        if (i11 < this.f8625m.length) {
            return new a0(a10, a(i11));
        }
        return new a0(a10, a10);
    }
}
