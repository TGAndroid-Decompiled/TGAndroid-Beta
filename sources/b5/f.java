package b5;

import android.text.TextUtils;
import d5.g0;
import h3.t0;
import j4.i1;
import p8.j0;
import p8.k0;

public final class f extends o implements Comparable {
    public final int A;
    public final boolean B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final boolean G;
    public final boolean H;

    public final int f1940e;

    public final boolean f1941f;
    public final String h;

    public final i f1942n;

    public final boolean f1943r;

    public final int f1944s;
    public final int v;

    public final int f1945w;

    public final boolean f1946x;

    public final int f1947y;

    public f(int i10, i1 i1Var, int i11, i iVar, int i12, boolean z10, e eVar) {
        p8.z zVar;
        int i13;
        int iD;
        int iD2;
        super(i10, i1Var, i11);
        this.f1942n = iVar;
        this.h = q.h(this.d.f8186c);
        int i14 = 0;
        this.f1943r = q.f(i12, false);
        int i15 = 0;
        while (true) {
            p8.z zVar2 = iVar.f2027y;
            zVar = iVar.D;
            i13 = Integer.MAX_VALUE;
            if (i15 >= zVar2.size()) {
                i15 = Integer.MAX_VALUE;
                iD = 0;
                break;
            } else {
                iD = q.d(this.d, (String) iVar.f2027y.get(i15), false);
                if (iD > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.v = i15;
        this.f1944s = iD;
        int i16 = this.d.f8187e;
        int i17 = iVar.A;
        this.f1945w = (i16 == 0 || i16 != i17) ? Integer.bitCount(i16 & i17) : Integer.MAX_VALUE;
        t0 t0Var = this.d;
        int i18 = t0Var.f8187e;
        this.f1946x = i18 == 0 || (i18 & 1) != 0;
        this.B = (t0Var.d & 1) != 0;
        int i19 = t0Var.O;
        this.C = i19;
        this.D = t0Var.P;
        int i20 = t0Var.f8189n;
        this.E = i20;
        this.f1941f = (i20 == -1 || i20 <= iVar.C) && (i19 == -1 || i19 <= iVar.B) && eVar.apply(t0Var);
        String[] strArrZ = g0.z();
        int i21 = 0;
        while (true) {
            if (i21 >= strArrZ.length) {
                i21 = Integer.MAX_VALUE;
                iD2 = 0;
                break;
            } else {
                iD2 = q.d(this.d, strArrZ[i21], false);
                if (iD2 > 0) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.f1947y = i21;
        this.A = iD2;
        for (int i22 = 0; i22 < zVar.size(); i22++) {
            String str = this.d.B;
            if (str != null && str.equals(zVar.get(i22))) {
                i13 = i22;
                break;
            }
        }
        this.F = i13;
        this.G = (i12 & 384) == 128;
        this.H = (i12 & 64) == 64;
        boolean z11 = this.f1941f;
        i iVar2 = this.f1942n;
        if (q.f(i12, iVar2.W) && (z11 || iVar2.Q)) {
            i14 = (!q.f(i12, false) || !z11 || this.d.f8189n == -1 || iVar2.J || iVar2.I || (!iVar2.Y && z10)) ? 1 : 2;
        }
        this.f1940e = i14;
    }

    @Override
    public final int a() {
        return this.f1940e;
    }

    @Override
    public final boolean b(o oVar) {
        int i10;
        String str;
        int i11;
        f fVar = (f) oVar;
        t0 t0Var = fVar.d;
        i iVar = this.f1942n;
        boolean z10 = iVar.T;
        t0 t0Var2 = this.d;
        if (!z10 && ((i11 = t0Var2.O) == -1 || i11 != t0Var.O)) {
            return false;
        }
        if (!iVar.R && ((str = t0Var2.B) == null || !TextUtils.equals(str, t0Var.B))) {
            return false;
        }
        if (!iVar.S && ((i10 = t0Var2.P) == -1 || i10 != t0Var.P)) {
            return false;
        }
        if (iVar.U) {
            return true;
        }
        return this.G == fVar.G && this.H == fVar.H;
    }

    @Override
    public final int compareTo(f fVar) {
        boolean z10 = this.f1943r;
        boolean z11 = this.f1941f;
        k0 k0VarA = (z11 && z10) ? q.f1974k : q.f1974k.a();
        boolean z12 = fVar.f1943r;
        int i10 = fVar.E;
        p8.t tVarC = p8.t.f45586a.c(z10, z12);
        Integer numValueOf = Integer.valueOf(this.v);
        Integer numValueOf2 = Integer.valueOf(fVar.v);
        j0 j0Var = j0.f45550c;
        p8.t tVarB = tVarC.b(numValueOf, numValueOf2, j0Var).a(this.f1944s, fVar.f1944s).a(this.f1945w, fVar.f1945w).c(this.B, fVar.B).c(this.f1946x, fVar.f1946x).b(Integer.valueOf(this.f1947y), Integer.valueOf(fVar.f1947y), j0Var).a(this.A, fVar.A).c(z11, fVar.f1941f).b(Integer.valueOf(this.F), Integer.valueOf(fVar.F), j0Var);
        int i11 = this.E;
        p8.t tVarB2 = tVarB.b(Integer.valueOf(i11), Integer.valueOf(i10), this.f1942n.I ? q.f1974k.a() : q.f1975l).c(this.G, fVar.G).c(this.H, fVar.H).b(Integer.valueOf(this.C), Integer.valueOf(fVar.C), k0VarA).b(Integer.valueOf(this.D), Integer.valueOf(fVar.D), k0VarA);
        Integer numValueOf3 = Integer.valueOf(i11);
        Integer numValueOf4 = Integer.valueOf(i10);
        if (!g0.a(this.h, fVar.h)) {
            k0VarA = q.f1975l;
        }
        return tVarB2.b(numValueOf3, numValueOf4, k0VarA).e();
    }
}
