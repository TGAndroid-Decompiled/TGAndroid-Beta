package b5;

import d5.g0;
import h3.t0;
import j4.i1;
import p8.j0;

public final class p extends o {
    public final int A;
    public final boolean B;
    public final boolean C;
    public final int D;

    public final boolean f1966e;

    public final i f1967f;
    public final boolean h;

    public final boolean f1968n;

    public final int f1969r;

    public final int f1970s;
    public final int v;

    public final int f1971w;

    public final boolean f1972x;

    public final boolean f1973y;

    public p(int i10, i1 i1Var, int i11, i iVar, int i12, int i13, boolean z10) {
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        t0 t0Var;
        int i16;
        int i17;
        int i18;
        t0 t0Var2;
        int i19;
        int i20;
        int i21;
        super(i10, i1Var, i11);
        this.f1967f = iVar;
        boolean z13 = iVar.O;
        p8.z zVar = iVar.f2025w;
        int i22 = z13 ? 24 : 16;
        int i23 = 0;
        this.f1973y = iVar.N && (i13 & i22) != 0;
        if (!z10 || (((i19 = (t0Var2 = this.d).G) != -1 && i19 > iVar.f2017a) || ((i20 = t0Var2.H) != -1 && i20 > iVar.f2018b))) {
            z11 = false;
        } else {
            float f10 = t0Var2.I;
            if ((f10 == -1.0f || f10 <= iVar.f2019c) && ((i21 = t0Var2.f8189n) == -1 || i21 <= iVar.d)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.f1966e = z11;
        if (!z10 || (((i16 = (t0Var = this.d).G) != -1 && i16 < iVar.f2020e) || ((i17 = t0Var.H) != -1 && i17 < iVar.f2021f))) {
            z12 = false;
        } else {
            float f11 = t0Var.I;
            if ((f11 == -1.0f || f11 >= iVar.h) && ((i18 = t0Var.f8189n) == -1 || i18 >= iVar.f2022n)) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        this.h = z12;
        this.f1968n = q.f(i12, false);
        t0 t0Var3 = this.d;
        this.f1969r = t0Var3.f8189n;
        int i24 = t0Var3.G;
        this.f1970s = (i24 == -1 || (i15 = t0Var3.H) == -1) ? -1 : i24 * i15;
        int i25 = t0Var3.f8187e;
        int i26 = iVar.f2026x;
        int i27 = Integer.MAX_VALUE;
        this.f1971w = (i25 == 0 || i25 != i26) ? Integer.bitCount(i25 & i26) : Integer.MAX_VALUE;
        int i28 = this.d.f8187e;
        this.f1972x = i28 == 0 || (i28 & 1) != 0;
        for (int i29 = 0; i29 < zVar.size(); i29++) {
            String str = this.d.B;
            if (str != null && str.equals(zVar.get(i29))) {
                i27 = i29;
                break;
            }
        }
        this.v = i27;
        this.B = (i12 & 384) == 128;
        this.C = (i12 & 64) == 64;
        t0 t0Var4 = this.d;
        String str2 = t0Var4.B;
        if (str2 != null) {
            i14 = 4;
            switch (str2) {
                case "video/dolby-vision":
                    i14 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i14 = 3;
                    break;
                case "video/avc":
                    i14 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i14 = 2;
                    break;
                default:
                    i14 = 0;
                    break;
            }
        } else {
            i14 = 0;
        }
        this.D = i14;
        boolean z14 = this.f1966e;
        i iVar2 = this.f1967f;
        if ((t0Var4.f8187e & 16384) == 0 && q.f(i12, iVar2.W) && (z14 || iVar2.M)) {
            i23 = (!q.f(i12, false) || !this.h || !z14 || t0Var4.f8189n == -1 || iVar2.J || iVar2.I || (i22 & i12) == 0) ? 1 : 2;
        }
        this.A = i23;
    }

    public static int c(p pVar, p pVar2) {
        p8.t tVarB = p8.t.f45586a.c(pVar.f1968n, pVar2.f1968n).a(pVar.f1971w, pVar2.f1971w).c(pVar.f1972x, pVar2.f1972x).c(pVar.f1966e, pVar2.f1966e).c(pVar.h, pVar2.h).b(Integer.valueOf(pVar.v), Integer.valueOf(pVar2.v), j0.f45550c);
        boolean z10 = pVar.B;
        p8.t tVarC = tVarB.c(z10, pVar2.B);
        boolean z11 = pVar.C;
        p8.t tVarC2 = tVarC.c(z11, pVar2.C);
        if (z10 && z11) {
            tVarC2 = tVarC2.a(pVar.D, pVar2.D);
        }
        return tVarC2.e();
    }

    @Override
    public final int a() {
        return this.A;
    }

    @Override
    public final boolean b(o oVar) {
        p pVar = (p) oVar;
        if (!this.f1973y && !g0.a(this.d.B, pVar.d.B)) {
            return false;
        }
        if (this.f1967f.P) {
            return true;
        }
        return this.B == pVar.B && this.C == pVar.C;
    }
}
