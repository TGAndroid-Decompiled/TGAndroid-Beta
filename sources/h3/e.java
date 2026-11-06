package h3;

import a8.ia;
import f3.b0;
import f3.d0;
import f3.j0;
import h2.m0;
import java.math.RoundingMode;
public final class e {
    public final d f14192a;
    public final j0 f14193b;
    public final int f14194c;
    public final int d;
    public final long f14195e;
    public int f14196f;
    public int f14197g;
    public int h;
    public int f14198i;
    public int f14199j;
    public int f14200k;
    public long f14201l;
    public long[] f14202m;
    public int[] f14203n;

    public e(int i7, d dVar, j0 j0Var) {
        int i10;
        int i11;
        int i12 = dVar.d;
        this.f14192a = dVar;
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
        this.f14194c = i10 | i13;
        long j3 = dVar.f14189c;
        String str = m0.f14112a;
        this.f14195e = m0.a0(i12, dVar.f14188b * 1000000, j3, RoundingMode.DOWN);
        this.f14193b = j0Var;
        if (a10 == 2) {
            i11 = i13 | 1650720768;
        } else {
            i11 = -1;
        }
        this.d = i11;
        this.f14201l = -1L;
        this.f14202m = new long[512];
        this.f14203n = new int[512];
        this.f14196f = i12;
    }

    public final d0 a(int i7) {
        return new d0(((this.f14195e * 1) / this.f14196f) * this.f14203n[i7], this.f14202m[i7]);
    }

    public final b0 b(long j3) {
        if (this.f14200k == 0) {
            d0 d0Var = new d0(0L, this.f14201l);
            return new b0(d0Var, d0Var);
        }
        int i7 = (int) (j3 / ((this.f14195e * 1) / this.f14196f));
        int e10 = m0.e(this.f14203n, i7, true, true);
        if (this.f14203n[e10] == i7) {
            d0 a10 = a(e10);
            return new b0(a10, a10);
        }
        d0 a11 = a(e10);
        int i10 = e10 + 1;
        if (i10 < this.f14202m.length) {
            return new b0(a11, a(i10));
        }
        return new b0(a11, a11);
    }
}
