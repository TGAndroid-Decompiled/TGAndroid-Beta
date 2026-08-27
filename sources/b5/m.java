package b5;

import j4.i1;
import p8.j0;

public final class m extends o implements Comparable {

    public final int f1956e;

    public final boolean f1957f;
    public final boolean h;

    public final boolean f1958n;

    public final int f1959r;

    public final int f1960s;
    public final int v;

    public final int f1961w;

    public final boolean f1962x;

    public m(int i10, i1 i1Var, int i11, i iVar, int i12, String str) {
        int iD;
        super(i10, i1Var, i11);
        int i13 = 0;
        this.f1957f = q.f(i12, false);
        int i14 = this.d.d;
        int i15 = iVar.G;
        p8.z zVar = iVar.E;
        int i16 = i14 & (~i15);
        this.h = (i16 & 1) != 0;
        this.f1958n = (i16 & 2) != 0;
        p8.z zVarY = zVar.isEmpty() ? p8.z.y("") : zVar;
        int i17 = 0;
        while (true) {
            if (i17 >= zVarY.size()) {
                i17 = Integer.MAX_VALUE;
                iD = 0;
                break;
            } else {
                iD = q.d(this.d, (String) zVarY.get(i17), iVar.H);
                if (iD > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f1959r = i17;
        this.f1960s = iD;
        int i18 = this.d.f8187e;
        int i19 = iVar.F;
        int iBitCount = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
        this.v = iBitCount;
        this.f1962x = (this.d.f8187e & 1088) != 0;
        int iD2 = q.d(this.d, str, q.h(str) == null);
        this.f1961w = iD2;
        boolean z10 = iD > 0 || (zVar.isEmpty() && iBitCount > 0) || this.h || (this.f1958n && iD2 > 0);
        if (q.f(i12, iVar.W) && z10) {
            i13 = 1;
        }
        this.f1956e = i13;
    }

    @Override
    public final int a() {
        return this.f1956e;
    }

    @Override
    public final boolean b(o oVar) {
        return false;
    }

    @Override
    public final int compareTo(m mVar) {
        p8.t tVarC = p8.t.f45586a.c(this.f1957f, mVar.f1957f);
        Integer numValueOf = Integer.valueOf(this.f1959r);
        Integer numValueOf2 = Integer.valueOf(mVar.f1959r);
        j0 j0Var = j0.f45549b;
        j0 j0Var2 = j0.f45550c;
        p8.t tVarB = tVarC.b(numValueOf, numValueOf2, j0Var2);
        int i10 = mVar.f1960s;
        int i11 = this.f1960s;
        p8.t tVarA = tVarB.a(i11, i10);
        int i12 = mVar.v;
        int i13 = this.v;
        p8.t tVarC2 = tVarA.a(i13, i12).c(this.h, mVar.h);
        Boolean boolValueOf = Boolean.valueOf(this.f1958n);
        Boolean boolValueOf2 = Boolean.valueOf(mVar.f1958n);
        if (i11 != 0) {
            j0Var = j0Var2;
        }
        p8.t tVarA2 = tVarC2.b(boolValueOf, boolValueOf2, j0Var).a(this.f1961w, mVar.f1961w);
        if (i13 == 0) {
            tVarA2 = tVarA2.d(this.f1962x, mVar.f1962x);
        }
        return tVarA2.e();
    }
}
