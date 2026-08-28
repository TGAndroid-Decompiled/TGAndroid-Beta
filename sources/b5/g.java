package b5;

import android.text.TextUtils;
import d5.f0;
import h3.t0;
import j4.i1;
import o8.j0;
import o8.k0;
public final class g extends p implements Comparable {
    public final int A;
    public final boolean B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final int f1455e;
    public final boolean f1456f;
    public final String h;
    public final j f1457n;
    public final boolean f1458r;
    public final int f1459s;
    public final int v;
    public final int f1460w;
    public final boolean f1461x;
    public final int f1462y;

    public g(int i9, i1 i1Var, int i10, j jVar, int i11, boolean z10, f fVar) {
        super(i9, i1Var, i10);
        o8.z zVar;
        int i12;
        int i13;
        int bitCount;
        boolean z11;
        boolean z12;
        boolean z13;
        int i14;
        boolean z14;
        boolean z15;
        this.f1457n = jVar;
        this.h = r.h(this.d.f9762c);
        int i15 = 0;
        this.f1458r = r.f(i11, false);
        int i16 = 0;
        while (true) {
            o8.z zVar2 = jVar.f1542y;
            zVar = jVar.D;
            i12 = Integer.MAX_VALUE;
            if (i16 < zVar2.size()) {
                i13 = r.d(this.d, (String) jVar.f1542y.get(i16), false);
                if (i13 > 0) {
                    break;
                }
                i16++;
            } else {
                i16 = Integer.MAX_VALUE;
                i13 = 0;
                break;
            }
        }
        this.v = i16;
        this.f1459s = i13;
        int i17 = this.d.f9763e;
        int i18 = jVar.A;
        if (i17 != 0 && i17 == i18) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i17 & i18);
        }
        this.f1460w = bitCount;
        t0 t0Var = this.d;
        int i19 = t0Var.f9763e;
        if (i19 != 0 && (i19 & 1) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f1461x = z11;
        if ((t0Var.d & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.B = z12;
        int i20 = t0Var.O;
        this.C = i20;
        this.D = t0Var.P;
        int i21 = t0Var.f9765n;
        this.E = i21;
        if ((i21 == -1 || i21 <= jVar.C) && ((i20 == -1 || i20 <= jVar.B) && fVar.apply(t0Var))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f1456f = z13;
        String[] z16 = f0.z();
        int i22 = 0;
        while (true) {
            if (i22 < z16.length) {
                i14 = r.d(this.d, z16[i22], false);
                if (i14 > 0) {
                    break;
                }
                i22++;
            } else {
                i22 = Integer.MAX_VALUE;
                i14 = 0;
                break;
            }
        }
        this.f1462y = i22;
        this.A = i14;
        int i23 = 0;
        while (true) {
            if (i23 < zVar.size()) {
                String str = this.d.B;
                if (str != null && str.equals(zVar.get(i23))) {
                    i12 = i23;
                    break;
                }
                i23++;
            } else {
                break;
            }
        }
        this.F = i12;
        if ((i11 & 384) == 128) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.G = z14;
        if ((i11 & 64) == 64) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.H = z15;
        boolean z17 = this.f1456f;
        j jVar2 = this.f1457n;
        if (r.f(i11, jVar2.W) && (z17 || jVar2.Q)) {
            i15 = (!r.f(i11, false) || !z17 || this.d.f9765n == -1 || jVar2.J || jVar2.I || (!jVar2.Y && z10)) ? 1 : 2;
        }
        this.f1455e = i15;
    }

    @Override
    public final int a() {
        return this.f1455e;
    }

    @Override
    public final boolean b(p pVar) {
        int i9;
        String str;
        int i10;
        g gVar = (g) pVar;
        t0 t0Var = gVar.d;
        j jVar = this.f1457n;
        boolean z10 = jVar.T;
        t0 t0Var2 = this.d;
        if (z10 || ((i10 = t0Var2.O) != -1 && i10 == t0Var.O)) {
            if (jVar.R || ((str = t0Var2.B) != null && TextUtils.equals(str, t0Var.B))) {
                if (jVar.S || ((i9 = t0Var2.P) != -1 && i9 == t0Var.P)) {
                    if (!jVar.U) {
                        if (this.G != gVar.G || this.H != gVar.H) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int compareTo(g gVar) {
        k0 a2;
        k0 k0Var;
        boolean z10 = this.f1458r;
        boolean z11 = this.f1456f;
        if (z11 && z10) {
            a2 = r.f1489k;
        } else {
            a2 = r.f1489k.a();
        }
        boolean z12 = gVar.f1458r;
        int i9 = gVar.E;
        o8.t c10 = o8.t.f19087a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.v);
        Integer valueOf2 = Integer.valueOf(gVar.v);
        j0 j0Var = j0.f19051c;
        o8.t b10 = c10.b(valueOf, valueOf2, j0Var).a(this.f1459s, gVar.f1459s).a(this.f1460w, gVar.f1460w).c(this.B, gVar.B).c(this.f1461x, gVar.f1461x).b(Integer.valueOf(this.f1462y), Integer.valueOf(gVar.f1462y), j0Var).a(this.A, gVar.A).c(z11, gVar.f1456f).b(Integer.valueOf(this.F), Integer.valueOf(gVar.F), j0Var);
        int i10 = this.E;
        Integer valueOf3 = Integer.valueOf(i10);
        Integer valueOf4 = Integer.valueOf(i9);
        if (this.f1457n.I) {
            k0Var = r.f1489k.a();
        } else {
            k0Var = r.f1490l;
        }
        o8.t b11 = b10.b(valueOf3, valueOf4, k0Var).c(this.G, gVar.G).c(this.H, gVar.H).b(Integer.valueOf(this.C), Integer.valueOf(gVar.C), a2).b(Integer.valueOf(this.D), Integer.valueOf(gVar.D), a2);
        Integer valueOf5 = Integer.valueOf(i10);
        Integer valueOf6 = Integer.valueOf(i9);
        if (!f0.a(this.h, gVar.h)) {
            a2 = r.f1490l;
        }
        return b11.b(valueOf5, valueOf6, a2).e();
    }
}
