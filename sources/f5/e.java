package f5;

import android.text.TextUtils;
import h5.d0;
import j3.n0;
import o4.s0;
import s8.g0;
import s8.h0;
public final class e extends n implements Comparable {
    public final int B;
    public final boolean C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final boolean I;
    public final int f6016e;
    public final boolean f6017f;
    public final String h;
    public final h f6018n;
    public final boolean f6019r;
    public final int f6020s;
    public final int v;
    public final int f6021w;
    public final boolean f6022x;
    public final int f6023y;

    public e(int i10, s0 s0Var, int i11, h hVar, int i12, boolean z4, d dVar) {
        super(i10, s0Var, i11);
        s8.v vVar;
        int i13;
        int i14;
        int bitCount;
        boolean z10;
        boolean z11;
        boolean z12;
        int i15;
        boolean z13;
        boolean z14;
        this.f6018n = hVar;
        this.h = p.h(this.d.f9320c);
        int i16 = 0;
        this.f6019r = p.f(i12, false);
        int i17 = 0;
        while (true) {
            s8.v vVar2 = hVar.f6106y;
            vVar = hVar.E;
            i13 = Integer.MAX_VALUE;
            if (i17 < vVar2.size()) {
                i14 = p.d(this.d, (String) hVar.f6106y.get(i17), false);
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
        this.f6020s = i14;
        int i18 = this.d.f9321e;
        int i19 = hVar.B;
        if (i18 != 0 && i18 == i19) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i18 & i19);
        }
        this.f6021w = bitCount;
        n0 n0Var = this.d;
        int i20 = n0Var.f9321e;
        if (i20 != 0 && (i20 & 1) == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f6022x = z10;
        if ((n0Var.d & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.C = z11;
        int i21 = n0Var.P;
        this.D = i21;
        this.E = n0Var.Q;
        int i22 = n0Var.f9323n;
        this.F = i22;
        if ((i22 == -1 || i22 <= hVar.D) && ((i21 == -1 || i21 <= hVar.C) && dVar.apply(n0Var))) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f6017f = z12;
        String[] z15 = d0.z();
        int i23 = 0;
        while (true) {
            if (i23 < z15.length) {
                i15 = p.d(this.d, z15[i23], false);
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
        this.f6023y = i23;
        this.B = i15;
        int i24 = 0;
        while (true) {
            if (i24 < vVar.size()) {
                String str = this.d.C;
                if (str != null && str.equals(vVar.get(i24))) {
                    i13 = i24;
                    break;
                }
                i24++;
            } else {
                break;
            }
        }
        this.G = i13;
        if ((i12 & 384) == 128) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.H = z13;
        if ((i12 & 64) == 64) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.I = z14;
        boolean z16 = this.f6017f;
        h hVar2 = this.f6018n;
        if (p.f(i12, hVar2.X) && (z16 || hVar2.R)) {
            i16 = (!p.f(i12, false) || !z16 || this.d.f9323n == -1 || hVar2.K || hVar2.J || (!hVar2.Z && z4)) ? 1 : 2;
        }
        this.f6016e = i16;
    }

    @Override
    public final int a() {
        return this.f6016e;
    }

    @Override
    public final boolean b(n nVar) {
        int i10;
        String str;
        int i11;
        e eVar = (e) nVar;
        n0 n0Var = eVar.d;
        h hVar = this.f6018n;
        boolean z4 = hVar.U;
        n0 n0Var2 = this.d;
        if (z4 || ((i11 = n0Var2.P) != -1 && i11 == n0Var.P)) {
            if (hVar.S || ((str = n0Var2.C) != null && TextUtils.equals(str, n0Var.C))) {
                if (hVar.T || ((i10 = n0Var2.Q) != -1 && i10 == n0Var.Q)) {
                    if (!hVar.V) {
                        if (this.H != eVar.H || this.I != eVar.I) {
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
        h0 a2;
        h0 h0Var;
        boolean z4 = this.f6019r;
        boolean z10 = this.f6017f;
        if (z10 && z4) {
            a2 = p.f6052k;
        } else {
            a2 = p.f6052k.a();
        }
        boolean z11 = eVar.f6019r;
        int i10 = eVar.F;
        s8.p c3 = s8.p.f47158a.c(z4, z11);
        Integer valueOf = Integer.valueOf(this.v);
        Integer valueOf2 = Integer.valueOf(eVar.v);
        g0 g0Var = g0.f47136c;
        s8.p b10 = c3.b(valueOf, valueOf2, g0Var).a(this.f6020s, eVar.f6020s).a(this.f6021w, eVar.f6021w).c(this.C, eVar.C).c(this.f6022x, eVar.f6022x).b(Integer.valueOf(this.f6023y), Integer.valueOf(eVar.f6023y), g0Var).a(this.B, eVar.B).c(z10, eVar.f6017f).b(Integer.valueOf(this.G), Integer.valueOf(eVar.G), g0Var);
        int i11 = this.F;
        Integer valueOf3 = Integer.valueOf(i11);
        Integer valueOf4 = Integer.valueOf(i10);
        if (this.f6018n.J) {
            h0Var = p.f6052k.a();
        } else {
            h0Var = p.f6053l;
        }
        s8.p b11 = b10.b(valueOf3, valueOf4, h0Var).c(this.H, eVar.H).c(this.I, eVar.I).b(Integer.valueOf(this.D), Integer.valueOf(eVar.D), a2).b(Integer.valueOf(this.E), Integer.valueOf(eVar.E), a2);
        Integer valueOf5 = Integer.valueOf(i11);
        Integer valueOf6 = Integer.valueOf(i10);
        if (!d0.a(this.h, eVar.h)) {
            a2 = p.f6053l;
        }
        return b11.b(valueOf5, valueOf6, a2).e();
    }
}
