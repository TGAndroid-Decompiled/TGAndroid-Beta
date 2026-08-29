package d5;

import l4.j1;
import q8.j0;
import q8.z;
public final class l extends n implements Comparable {
    public final int f5345e;
    public final boolean f5346f;
    public final boolean h;
    public final boolean f5347n;
    public final int f5348r;
    public final int f5349s;
    public final int v;
    public final int f5350w;
    public final boolean f5351x;

    public l(int i10, j1 j1Var, int i11, h hVar, int i12, String str) {
        super(i10, j1Var, i11);
        boolean z10;
        boolean z11;
        z zVar;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15 = 0;
        this.f5346f = p.f(i12, false);
        int i16 = this.d.d;
        int i17 = hVar.G;
        z zVar2 = hVar.E;
        int i18 = i16 & (~i17);
        if ((i18 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if ((i18 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5347n = z11;
        if (zVar2.isEmpty()) {
            zVar = z.y("");
        } else {
            zVar = zVar2;
        }
        int i19 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i19 < zVar.size()) {
                i14 = p.d(this.d, (String) zVar.get(i19), hVar.H);
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
        this.f5348r = i19;
        this.f5349s = i14;
        int i20 = this.d.f10800e;
        int i21 = hVar.F;
        i13 = (i20 == 0 || i20 != i21) ? Integer.bitCount(i20 & i21) : i13;
        this.v = i13;
        if ((this.d.f10800e & 1088) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f5351x = z12;
        if (p.h(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int d = p.d(this.d, str, z13);
        this.f5350w = d;
        if (i14 <= 0 && ((!zVar2.isEmpty() || i13 <= 0) && !this.h && (!this.f5347n || d <= 0))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (p.f(i12, hVar.W) && z14) {
            i15 = 1;
        }
        this.f5345e = i15;
    }

    @Override
    public final int a() {
        return this.f5345e;
    }

    @Override
    public final boolean b(n nVar) {
        l lVar = (l) nVar;
        return false;
    }

    @Override
    public final int compareTo(l lVar) {
        q8.t c3 = q8.t.f46493a.c(this.f5346f, lVar.f5346f);
        Integer valueOf = Integer.valueOf(this.f5348r);
        Integer valueOf2 = Integer.valueOf(lVar.f5348r);
        j0 j0Var = j0.f46456b;
        j0 j0Var2 = j0.f46457c;
        q8.t b10 = c3.b(valueOf, valueOf2, j0Var2);
        int i10 = lVar.f5349s;
        int i11 = this.f5349s;
        q8.t a2 = b10.a(i11, i10);
        int i12 = lVar.v;
        int i13 = this.v;
        q8.t c6 = a2.a(i13, i12).c(this.h, lVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.f5347n);
        Boolean valueOf4 = Boolean.valueOf(lVar.f5347n);
        if (i11 != 0) {
            j0Var = j0Var2;
        }
        q8.t a10 = c6.b(valueOf3, valueOf4, j0Var).a(this.f5350w, lVar.f5350w);
        if (i13 == 0) {
            a10 = a10.d(this.f5351x, lVar.f5351x);
        }
        return a10.e();
    }
}
