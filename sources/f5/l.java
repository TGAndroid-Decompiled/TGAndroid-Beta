package f5;

import o4.s0;
import s8.g0;
public final class l extends n implements Comparable {
    public final int e;
    public final boolean f5934f;
    public final boolean h;
    public final boolean f5935n;
    public final int f5936r;
    public final int f5937s;
    public final int v;
    public final int f5938w;
    public final boolean f5939x;

    public l(int i10, s0 s0Var, int i11, h hVar, int i12, String str) {
        super(i10, s0Var, i11);
        boolean z4;
        boolean z10;
        s8.v vVar;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15 = 0;
        this.f5934f = p.f(i12, false);
        int i16 = this.d.d;
        int i17 = hVar.H;
        s8.v vVar2 = hVar.F;
        int i18 = i16 & (~i17);
        if ((i18 & 1) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.h = z4;
        if ((i18 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5935n = z10;
        if (vVar2.isEmpty()) {
            vVar = s8.v.x("");
        } else {
            vVar = vVar2;
        }
        int i19 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i19 < vVar.size()) {
                i14 = p.d(this.d, (String) vVar.get(i19), hVar.I);
                if (i14 > 0) {
                    break;
                }
                i19++;
            } else {
                i19 = Integer.MAX_VALUE;
                i14 = 0;
                break;
            }
        }
        this.f5936r = i19;
        this.f5937s = i14;
        int i20 = this.d.e;
        int i21 = hVar.G;
        i13 = (i20 == 0 || i20 != i21) ? Integer.bitCount(i20 & i21) : i13;
        this.v = i13;
        if ((this.d.e & 1088) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5939x = z11;
        if (p.h(str) == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int d = p.d(this.d, str, z12);
        this.f5938w = d;
        if (i14 <= 0 && ((!vVar2.isEmpty() || i13 <= 0) && !this.h && (!this.f5935n || d <= 0))) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (p.f(i12, hVar.X) && z13) {
            i15 = 1;
        }
        this.e = i15;
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(n nVar) {
        l lVar = (l) nVar;
        return false;
    }

    @Override
    public final int compareTo(l lVar) {
        s8.p c3 = s8.p.f44142a.c(this.f5934f, lVar.f5934f);
        Integer valueOf = Integer.valueOf(this.f5936r);
        Integer valueOf2 = Integer.valueOf(lVar.f5936r);
        g0 g0Var = g0.f44126b;
        g0 g0Var2 = g0.f44127c;
        s8.p b10 = c3.b(valueOf, valueOf2, g0Var2);
        int i10 = lVar.f5937s;
        int i11 = this.f5937s;
        s8.p a2 = b10.a(i11, i10);
        int i12 = lVar.v;
        int i13 = this.v;
        s8.p c10 = a2.a(i13, i12).c(this.h, lVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.f5935n);
        Boolean valueOf4 = Boolean.valueOf(lVar.f5935n);
        if (i11 != 0) {
            g0Var = g0Var2;
        }
        s8.p a10 = c10.b(valueOf3, valueOf4, g0Var).a(this.f5938w, lVar.f5938w);
        if (i13 == 0) {
            a10 = a10.d(this.f5939x, lVar.f5939x);
        }
        return a10.e();
    }
}
