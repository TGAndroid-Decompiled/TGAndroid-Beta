package h3;

import a8.ia;
import f3.b0;
import f3.d0;
import f3.j0;
import h2.m0;
import java.math.RoundingMode;
public final class e {
    public final d f14194a;
    public final j0 f14195b;
    public final int f14196c;
    public final int d;
    public final long f14197e;
    public int f14198f;
    public int f14199g;
    public int h;
    public int f14200i;
    public int f14201j;
    public int f14202k;
    public long f14203l;
    public long[] f14204m;
    public int[] f14205n;

    public e(int i7, d dVar, j0 j0Var) {
        int i10;
        int i11;
        int i12 = dVar.d;
        this.f14194a = dVar;
        int a10 = dVar.a();
        boolean z9 = true;
        if (a10 != 1 && a10 != 2) {
            z9 = false;
        }
        ia.f(z9);
        if (a10 == 2) {
            i10 = 1667497984;
        } else {
            i10 = 1651965952;
        }
        int i13 = (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48);
        this.f14196c = i10 | i13;
        long j3 = dVar.f14191c;
        String str = m0.f14114a;
        this.f14197e = m0.a0(i12, dVar.f14190b * 1000000, j3, RoundingMode.DOWN);
        this.f14195b = j0Var;
        if (a10 == 2) {
            i11 = i13 | 1650720768;
        } else {
            i11 = -1;
        }
        this.d = i11;
        this.f14203l = -1L;
        this.f14204m = new long[512];
        this.f14205n = new int[512];
        this.f14198f = i12;
    }

    public final d0 a(int i7) {
        return new d0(((this.f14197e * 1) / this.f14198f) * this.f14205n[i7], this.f14204m[i7]);
    }

    public final b0 b(long j3) {
        if (this.f14202k == 0) {
            d0 d0Var = new d0(0L, this.f14203l);
            return new b0(d0Var, d0Var);
        }
        int i7 = (int) (j3 / ((this.f14197e * 1) / this.f14198f));
        int e10 = m0.e(this.f14205n, i7, true, true);
        if (this.f14205n[e10] == i7) {
            d0 a10 = a(e10);
            return new b0(a10, a10);
        }
        d0 a11 = a(e10);
        int i10 = e10 + 1;
        if (i10 < this.f14204m.length) {
            return new b0(a11, a(i10));
        }
        return new b0(a11, a11);
    }
}
