package a3;

import e2.m1;
import h9.i0;
import h9.o1;
import h9.r1;
public final class o extends q implements Comparable {
    public final boolean D;
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
        boolean z9;
        boolean z10;
        i0 i0Var;
        int i12;
        int i13;
        int bitCount;
        boolean z11;
        boolean z12;
        boolean z13;
        int i14 = 0;
        this.f108f = jg.g.c(i11, false);
        int i15 = this.d.f10602e;
        int i16 = nVar.C;
        i0 i0Var2 = nVar.f10528y;
        int i17 = i15 & (~i16);
        if ((i17 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.h = z9;
        if ((i17 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f109n = z10;
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
        int i19 = this.d.f10603f;
        r1 r1Var = s.f126l;
        if (i19 != 0 && i19 == i13) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i13 & i19);
        }
        this.f112w = bitCount;
        e2.u uVar = this.d;
        if ((1088 & uVar.f10603f) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.D = z11;
        int c10 = s.c(uVar, nVar.f10529z);
        this.f113x = c10;
        if (s.l(str) == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i20 = s.i(this.d, str, z12);
        this.f114y = i20;
        if (i12 <= 0 && ((!i0Var2.isEmpty() || bitCount <= 0) && ((!i0Var2.isEmpty() || c10 == Integer.MAX_VALUE) && !this.h && ((!this.f109n || i20 <= 0) && !nVar.f10527x)))) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (jg.g.c(i11, nVar.B0) && z13) {
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
        h9.w c10 = h9.w.f14407a.c(this.f108f, oVar.f108f);
        Integer valueOf = Integer.valueOf(this.f110r);
        Integer valueOf2 = Integer.valueOf(oVar.f110r);
        o1 o1Var = o1.f14359b;
        o1 o1Var2 = o1.f14360c;
        h9.w b10 = c10.b(valueOf, valueOf2, o1Var2);
        int i7 = oVar.f111s;
        int i10 = this.f111s;
        h9.w a10 = b10.a(i10, i7);
        int i11 = oVar.f112w;
        int i12 = this.f112w;
        h9.w c11 = a10.a(i12, i11).b(Integer.valueOf(this.f113x), Integer.valueOf(oVar.f113x), o1Var2).c(this.h, oVar.h);
        Boolean valueOf3 = Boolean.valueOf(this.f109n);
        Boolean valueOf4 = Boolean.valueOf(oVar.f109n);
        if (i10 != 0) {
            o1Var = o1Var2;
        }
        h9.w a11 = c11.b(valueOf3, valueOf4, o1Var).a(this.f114y, oVar.f114y);
        if (i12 == 0) {
            a11 = a11.d(this.D, oVar.D);
        }
        return a11.e();
    }
}
