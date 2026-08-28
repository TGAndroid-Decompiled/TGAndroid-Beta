package b5;

import j4.i1;
import o8.j0;
public final class n extends p implements Comparable {
    public final int f1471e;
    public final boolean f1472f;
    public final boolean h;
    public final boolean f1473n;
    public final int f1474r;
    public final int f1475s;
    public final int v;
    public final int f1476w;
    public final boolean f1477x;

    public n(int i9, i1 i1Var, int i10, j jVar, int i11, String str) {
        super(i9, i1Var, i10);
        boolean z10;
        boolean z11;
        o8.z zVar;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14 = 0;
        this.f1472f = r.f(i11, false);
        int i15 = this.d.d;
        int i16 = jVar.G;
        o8.z zVar2 = jVar.E;
        int i17 = i15 & (~i16);
        if ((i17 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if ((i17 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f1473n = z11;
        if (zVar2.isEmpty()) {
            zVar = o8.z.y("");
        } else {
            zVar = zVar2;
        }
        int i18 = 0;
        while (true) {
            i12 = Integer.MAX_VALUE;
            if (i18 < zVar.size()) {
                i13 = r.d(this.d, (String) zVar.get(i18), jVar.H);
                if (i13 > 0) {
                    break;
                }
                i18++;
            } else {
                i18 = Integer.MAX_VALUE;
                i13 = 0;
                break;
            }
        }
        this.f1474r = i18;
        this.f1475s = i13;
        int i19 = this.d.f9763e;
        int i20 = jVar.F;
        i12 = (i19 == 0 || i19 != i20) ? Integer.bitCount(i19 & i20) : i12;
        this.v = i12;
        if ((this.d.f9763e & 1088) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f1477x = z12;
        if (r.h(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int d = r.d(this.d, str, z13);
        this.f1476w = d;
        if (i13 <= 0 && ((!zVar2.isEmpty() || i12 <= 0) && !this.h && (!this.f1473n || d <= 0))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (r.f(i11, jVar.W) && z14) {
            i14 = 1;
        }
        this.f1471e = i14;
    }

    @Override
    public final int a() {
        return this.f1471e;
    }

    @Override
    public final boolean b(p pVar) {
        n nVar = (n) pVar;
        return false;
    }

    @Override
    public final int compareTo(n nVar) {
        o8.t c10 = o8.t.f19087a.c(this.f1472f, nVar.f1472f);
        Integer valueOf = Integer.valueOf(this.f1474r);
        Integer valueOf2 = Integer.valueOf(nVar.f1474r);
        j0 j0Var = j0.f19050b;
        j0 j0Var2 = j0.f19051c;
        o8.t b10 = c10.b(valueOf, valueOf2, j0Var2);
        int i9 = nVar.f1475s;
        int i10 = this.f1475s;
        o8.t a2 = b10.a(i10, i9);
        int i11 = nVar.v;
        int i12 = this.v;
        o8.t c11 = a2.a(i12, i11).c(this.h, nVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.f1473n);
        Boolean valueOf4 = Boolean.valueOf(nVar.f1473n);
        if (i10 != 0) {
            j0Var = j0Var2;
        }
        o8.t a3 = c11.b(valueOf3, valueOf4, j0Var).a(this.f1476w, nVar.f1476w);
        if (i12 == 0) {
            a3 = a3.d(this.f1477x, nVar.f1477x);
        }
        return a3.e();
    }
}
