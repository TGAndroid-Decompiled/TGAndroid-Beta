package a3;

import android.text.TextUtils;
import h9.o1;
import h9.r1;
import j$.util.Objects;
public final class i extends q implements Comparable {
    public final boolean D;
    public final boolean E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final int f90e;
    public final boolean f91f;
    public final String h;
    public final n f92n;
    public final boolean f93r;
    public final int f94s;
    public final int f95w;
    public final int f96x;
    public final int f97y;

    public i(int r8, e2.m1 r9, int r10, a3.n r11, int r12, boolean r13, a3.e r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: a3.i.<init>(int, e2.m1, int, a3.n, int, boolean, a3.e, int):void");
    }

    @Override
    public final int a() {
        return this.f90e;
    }

    @Override
    public final boolean b(q qVar) {
        int i7;
        String str;
        i iVar = (i) qVar;
        e2.u uVar = iVar.d;
        this.f92n.getClass();
        e2.u uVar2 = this.d;
        int i10 = uVar2.K;
        if (i10 != -1 && i10 == uVar.K) {
            if ((this.D || ((str = uVar2.f10615s) != null && TextUtils.equals(str, uVar.f10615s))) && (i7 = uVar2.L) != -1 && i7 == uVar.L && this.M == iVar.M && this.N == iVar.N) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int compareTo(i iVar) {
        r1 a10;
        boolean z9 = this.f93r;
        boolean z10 = this.f91f;
        if (z10 && z9) {
            a10 = s.f126l;
        } else {
            a10 = s.f126l.a();
        }
        boolean z11 = iVar.f93r;
        int i7 = iVar.K;
        h9.w c10 = h9.w.f14407a.c(z9, z11);
        Integer valueOf = Integer.valueOf(this.f95w);
        Integer valueOf2 = Integer.valueOf(iVar.f95w);
        o1 o1Var = o1.f14360c;
        h9.w b10 = c10.b(valueOf, valueOf2, o1Var).a(this.f94s, iVar.f94s).a(this.f96x, iVar.f96x).b(Integer.valueOf(this.f97y), Integer.valueOf(iVar.f97y), o1Var).c(this.H, iVar.H).c(this.E, iVar.E).b(Integer.valueOf(this.F), Integer.valueOf(iVar.F), o1Var).a(this.G, iVar.G).c(z10, iVar.f91f).b(Integer.valueOf(this.L), Integer.valueOf(iVar.L), o1Var);
        boolean z12 = this.f92n.F;
        int i10 = this.K;
        if (z12) {
            b10 = b10.b(Integer.valueOf(i10), Integer.valueOf(i7), s.f126l.a());
        }
        h9.w b11 = b10.c(this.M, iVar.M).c(this.N, iVar.N).c(this.O, iVar.O).b(Integer.valueOf(this.I), Integer.valueOf(iVar.I), a10).b(Integer.valueOf(this.J), Integer.valueOf(iVar.J), a10);
        if (Objects.equals(this.h, iVar.h)) {
            b11 = b11.b(Integer.valueOf(i10), Integer.valueOf(i7), a10);
        }
        return b11.e();
    }
}
