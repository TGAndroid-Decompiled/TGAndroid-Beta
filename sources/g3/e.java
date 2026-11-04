package g3;

import b8.zb;
import e3.a0;
import e3.c0;
import e3.i0;
import g2.n0;
import java.math.RoundingMode;
public final class e {
    public final d f11951a;
    public final i0 f11952b;
    public final int f11953c;
    public final int d;
    public final long f11954e;
    public int f11955f;
    public int f11956g;
    public int h;
    public int f11957i;
    public int f11958j;
    public int f11959k;
    public long f11960l;
    public long[] f11961m;
    public int[] f11962n;

    public e(int i3, d dVar, i0 i0Var) {
        int i10;
        int i11;
        int i12 = dVar.d;
        this.f11951a = dVar;
        int a10 = dVar.a();
        boolean z10 = true;
        if (a10 != 1 && a10 != 2) {
            z10 = false;
        }
        zb.f(z10);
        if (a10 == 2) {
            i10 = 1667497984;
        } else {
            i10 = 1651965952;
        }
        int i13 = (((i3 % 10) + 48) << 8) | ((i3 / 10) + 48);
        this.f11953c = i10 | i13;
        long j10 = dVar.f11948c;
        String str = n0.f11873a;
        this.f11954e = n0.a0(i12, dVar.f11947b * 1000000, j10, RoundingMode.DOWN);
        this.f11952b = i0Var;
        if (a10 == 2) {
            i11 = i13 | 1650720768;
        } else {
            i11 = -1;
        }
        this.d = i11;
        this.f11960l = -1L;
        this.f11961m = new long[512];
        this.f11962n = new int[512];
        this.f11955f = i12;
    }

    public final c0 a(int i3) {
        return new c0(((this.f11954e * 1) / this.f11955f) * this.f11962n[i3], this.f11961m[i3]);
    }

    public final a0 b(long j10) {
        if (this.f11959k == 0) {
            c0 c0Var = new c0(0L, this.f11960l);
            return new a0(c0Var, c0Var);
        }
        int i3 = (int) (j10 / ((this.f11954e * 1) / this.f11955f));
        int e10 = n0.e(this.f11962n, i3, true, true);
        if (this.f11962n[e10] == i3) {
            c0 a10 = a(e10);
            return new a0(a10, a10);
        }
        c0 a11 = a(e10);
        int i10 = e10 + 1;
        if (i10 < this.f11961m.length) {
            return new a0(a11, a(i10));
        }
        return new a0(a11, a11);
    }
}
