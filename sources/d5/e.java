package d5;

import android.text.TextUtils;
import f5.d0;
import j3.t0;
import l4.j1;
import q8.j0;
import q8.k0;
import q8.z;
public final class e extends n implements Comparable {
    public final int A;
    public final boolean B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final int f5329e;
    public final boolean f5330f;
    public final String h;
    public final h f5331n;
    public final boolean f5332r;
    public final int f5333s;
    public final int v;
    public final int f5334w;
    public final boolean f5335x;
    public final int f5336y;

    public e(int i10, j1 j1Var, int i11, h hVar, int i12, boolean z10, d dVar) {
        super(i10, j1Var, i11);
        z zVar;
        int i13;
        int i14;
        int bitCount;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15;
        boolean z14;
        boolean z15;
        this.f5331n = hVar;
        this.h = p.h(this.d.f10799c);
        int i16 = 0;
        this.f5332r = p.f(i12, false);
        int i17 = 0;
        while (true) {
            z zVar2 = hVar.f5416y;
            zVar = hVar.D;
            i13 = Integer.MAX_VALUE;
            if (i17 < zVar2.size()) {
                i14 = p.d(this.d, (String) hVar.f5416y.get(i17), false);
                if (i14 > 0) {
                    break;
                }
                i17++;
            } else {
                i17 = Integer.MAX_VALUE;
                i14 = 0;
                break;
            }
        }
        this.v = i17;
        this.f5333s = i14;
        int i18 = this.d.f10800e;
        int i19 = hVar.A;
        if (i18 != 0 && i18 == i19) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i18 & i19);
        }
        this.f5334w = bitCount;
        t0 t0Var = this.d;
        int i20 = t0Var.f10800e;
        if (i20 != 0 && (i20 & 1) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f5335x = z11;
        if ((t0Var.d & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.B = z12;
        int i21 = t0Var.O;
        this.C = i21;
        this.D = t0Var.P;
        int i22 = t0Var.f10802n;
        this.E = i22;
        if ((i22 == -1 || i22 <= hVar.C) && ((i21 == -1 || i21 <= hVar.B) && dVar.apply(t0Var))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f5330f = z13;
        String[] z16 = d0.z();
        int i23 = 0;
        while (true) {
            if (i23 < z16.length) {
                i15 = p.d(this.d, z16[i23], false);
                if (i15 > 0) {
                    break;
                }
                i23++;
            } else {
                i23 = Integer.MAX_VALUE;
                i15 = 0;
                break;
            }
        }
        this.f5336y = i23;
        this.A = i15;
        int i24 = 0;
        while (true) {
            if (i24 < zVar.size()) {
                String str = this.d.B;
                if (str != null && str.equals(zVar.get(i24))) {
                    i13 = i24;
                    break;
                }
                i24++;
            } else {
                break;
            }
        }
        this.F = i13;
        if ((i12 & 384) == 128) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.G = z14;
        if ((i12 & 64) == 64) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.H = z15;
        boolean z17 = this.f5330f;
        h hVar2 = this.f5331n;
        if (p.f(i12, hVar2.W) && (z17 || hVar2.Q)) {
            i16 = (!p.f(i12, false) || !z17 || this.d.f10802n == -1 || hVar2.J || hVar2.I || (!hVar2.Y && z10)) ? 1 : 2;
        }
        this.f5329e = i16;
    }

    @Override
    public final int a() {
        return this.f5329e;
    }

    @Override
    public final boolean b(n nVar) {
        int i10;
        String str;
        int i11;
        e eVar = (e) nVar;
        t0 t0Var = eVar.d;
        h hVar = this.f5331n;
        boolean z10 = hVar.T;
        t0 t0Var2 = this.d;
        if (z10 || ((i11 = t0Var2.O) != -1 && i11 == t0Var.O)) {
            if (hVar.R || ((str = t0Var2.B) != null && TextUtils.equals(str, t0Var.B))) {
                if (hVar.S || ((i10 = t0Var2.P) != -1 && i10 == t0Var.P)) {
                    if (!hVar.U) {
                        if (this.G != eVar.G || this.H != eVar.H) {
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
    public final int compareTo(e eVar) {
        k0 a2;
        k0 k0Var;
        boolean z10 = this.f5332r;
        boolean z11 = this.f5330f;
        if (z11 && z10) {
            a2 = p.f5363k;
        } else {
            a2 = p.f5363k.a();
        }
        boolean z12 = eVar.f5332r;
        int i10 = eVar.E;
        q8.t c3 = q8.t.f46493a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.v);
        Integer valueOf2 = Integer.valueOf(eVar.v);
        j0 j0Var = j0.f46457c;
        q8.t b10 = c3.b(valueOf, valueOf2, j0Var).a(this.f5333s, eVar.f5333s).a(this.f5334w, eVar.f5334w).c(this.B, eVar.B).c(this.f5335x, eVar.f5335x).b(Integer.valueOf(this.f5336y), Integer.valueOf(eVar.f5336y), j0Var).a(this.A, eVar.A).c(z11, eVar.f5330f).b(Integer.valueOf(this.F), Integer.valueOf(eVar.F), j0Var);
        int i11 = this.E;
        Integer valueOf3 = Integer.valueOf(i11);
        Integer valueOf4 = Integer.valueOf(i10);
        if (this.f5331n.I) {
            k0Var = p.f5363k.a();
        } else {
            k0Var = p.f5364l;
        }
        q8.t b11 = b10.b(valueOf3, valueOf4, k0Var).c(this.G, eVar.G).c(this.H, eVar.H).b(Integer.valueOf(this.C), Integer.valueOf(eVar.C), a2).b(Integer.valueOf(this.D), Integer.valueOf(eVar.D), a2);
        Integer valueOf5 = Integer.valueOf(i11);
        Integer valueOf6 = Integer.valueOf(i10);
        if (!d0.a(this.h, eVar.h)) {
            a2 = p.f5364l;
        }
        return b11.b(valueOf5, valueOf6, a2).e();
    }
}
