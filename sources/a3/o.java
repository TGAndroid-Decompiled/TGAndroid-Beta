package a3;

import e2.m1;
import h9.i0;
import h9.n1;
import h9.q1;
public final class o extends q implements Comparable {
    public final boolean E;
    public final int f107e;
    public final boolean f108f;
    public final boolean h;
    public final boolean f109n;
    public final int f110r;
    public final int f111s;
    public final int f112w;
    public final int f113x;
    public final int f114y;

    public o(int i7, m1 m1Var, int i10, n nVar, int i11, String str, String str2) {
        super(i7, m1Var, i10);
        boolean z10;
        boolean z11;
        i0 i0Var;
        int i12;
        int i13;
        int bitCount;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14 = 0;
        this.f108f = i5.c.b(i11, false);
        int i15 = this.d.f10438e;
        int i16 = nVar.C;
        i0 i0Var2 = nVar.f10364y;
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
        this.f109n = z11;
        if (str2 != null) {
            i0Var = i0.u(str2);
        } else if (i0Var2.isEmpty()) {
            i0Var = i0.u("");
        } else {
            i0Var = i0Var2;
        }
        int i18 = 0;
        while (true) {
            if (i18 < i0Var.size()) {
                i12 = s.i(this.d, (String) i0Var.get(i18), nVar.D);
                if (i12 > 0) {
                    break;
                }
                i18++;
            } else {
                i12 = 0;
                i18 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f110r = i18;
        this.f111s = i12;
        if (str2 != null) {
            i13 = 1088;
        } else {
            i13 = nVar.A;
        }
        int i19 = this.d.f10439f;
        q1 q1Var = s.f126l;
        if (i19 != 0 && i19 == i13) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i13 & i19);
        }
        this.f112w = bitCount;
        e2.u uVar = this.d;
        if ((1088 & uVar.f10439f) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.E = z12;
        int c10 = s.c(uVar, nVar.f10365z);
        this.f113x = c10;
        if (s.l(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i20 = s.i(this.d, str, z13);
        this.f114y = i20;
        if (i12 <= 0 && ((!i0Var2.isEmpty() || bitCount <= 0) && ((!i0Var2.isEmpty() || c10 == Integer.MAX_VALUE) && !this.h && ((!this.f109n || i20 <= 0) && !nVar.f10363x)))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (i5.c.b(i11, nVar.B0) && z14) {
            i14 = 1;
        }
        this.f107e = i14;
    }

    @Override
    public final int a() {
        return this.f107e;
    }

    @Override
    public final boolean b(q qVar) {
        o oVar = (o) qVar;
        return false;
    }

    @Override
    public final int compareTo(o oVar) {
        h9.w c10 = h9.w.f13763a.c(this.f108f, oVar.f108f);
        Integer valueOf = Integer.valueOf(this.f110r);
        Integer valueOf2 = Integer.valueOf(oVar.f110r);
        n1 n1Var = n1.f13710b;
        n1 n1Var2 = n1.f13711c;
        h9.w b10 = c10.b(valueOf, valueOf2, n1Var2);
        int i7 = oVar.f111s;
        int i10 = this.f111s;
        h9.w a10 = b10.a(i10, i7);
        int i11 = oVar.f112w;
        int i12 = this.f112w;
        h9.w c11 = a10.a(i12, i11).b(Integer.valueOf(this.f113x), Integer.valueOf(oVar.f113x), n1Var2).c(this.h, oVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.f109n);
        Boolean valueOf4 = Boolean.valueOf(oVar.f109n);
        if (i10 != 0) {
            n1Var = n1Var2;
        }
        h9.w a11 = c11.b(valueOf3, valueOf4, n1Var).a(this.f114y, oVar.f114y);
        if (i12 == 0) {
            a11 = a11.d(this.E, oVar.E);
        }
        return a11.e();
    }
}
