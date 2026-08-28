package o3;

import d5.f0;
import m3.s;
import m3.u;
import m3.w;
public final class e {
    public final w f18830a;
    public final int f18831b;
    public final int f18832c;
    public final long d;
    public final int f18833e;
    public int f18834f;
    public int f18835g;
    public int h;
    public int f18836i;
    public int f18837j;
    public long[] f18838k;
    public int[] f18839l;

    public e(int i9, int i10, long j10, int i11, w wVar) {
        int i12;
        int i13;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        d5.a.f(z10);
        this.d = j10;
        this.f18833e = i11;
        this.f18830a = wVar;
        if (i10 == 2) {
            i12 = 1667497984;
        } else {
            i12 = 1651965952;
        }
        int i14 = (((i9 % 10) + 48) << 8) | ((i9 / 10) + 48);
        this.f18831b = i12 | i14;
        if (i10 == 2) {
            i13 = i14 | 1650720768;
        } else {
            i13 = -1;
        }
        this.f18832c = i13;
        this.f18838k = new long[512];
        this.f18839l = new int[512];
    }

    public final u a(int i9) {
        return new u(((this.d * 1) / this.f18833e) * this.f18839l[i9], this.f18838k[i9]);
    }

    public final s b(long j10) {
        int i9 = (int) (j10 / ((this.d * 1) / this.f18833e));
        int d = f0.d(this.f18839l, i9, true, true);
        if (this.f18839l[d] == i9) {
            u a2 = a(d);
            return new s(a2, a2);
        }
        u a3 = a(d);
        int i10 = d + 1;
        if (i10 < this.f18838k.length) {
            return new s(a3, a(i10));
        }
        return new s(a3, a3);
    }
}
