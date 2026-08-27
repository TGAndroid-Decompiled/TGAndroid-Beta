package o3;

import d5.g0;
import m3.s;
import m3.u;
import m3.w;

public final class e {

    public final w f19177a;

    public final int f19178b;

    public final int f19179c;
    public final long d;

    public final int f19180e;

    public int f19181f;

    public int f19182g;
    public int h;

    public int f19183i;

    public int f19184j;

    public long[] f19185k;

    public int[] f19186l;

    public e(int i10, int i11, long j10, int i12, w wVar) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d5.a.f(z10);
        this.d = j10;
        this.f19180e = i12;
        this.f19177a = wVar;
        int i13 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f19178b = (i11 == 2 ? 1667497984 : 1651965952) | i13;
        this.f19179c = i11 == 2 ? i13 | 1650720768 : -1;
        this.f19185k = new long[512];
        this.f19186l = new int[512];
    }

    public final u a(int i10) {
        return new u(((this.d * ((long) 1)) / ((long) this.f19180e)) * ((long) this.f19186l[i10]), this.f19185k[i10]);
    }

    public final s b(long j10) {
        int i10 = (int) (j10 / ((this.d * ((long) 1)) / ((long) this.f19180e)));
        int iD = g0.d(this.f19186l, i10, true, true);
        if (this.f19186l[iD] == i10) {
            u uVarA = a(iD);
            return new s(uVarA, uVarA);
        }
        u uVarA2 = a(iD);
        int i11 = iD + 1;
        return i11 < this.f19185k.length ? new s(uVarA2, a(i11)) : new s(uVarA2, uVarA2);
    }
}
