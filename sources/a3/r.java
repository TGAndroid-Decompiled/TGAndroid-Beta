package a3;

import h9.o1;
import j$.util.Objects;
public final class r extends q {
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final int K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final int O;
    public final boolean P;
    public final String Q;
    public final boolean f118e;
    public final n f119f;
    public final boolean h;
    public final boolean f120n;
    public final boolean f121r;
    public final int f122s;
    public final int f123w;
    public final int f124x;
    public final int f125y;

    public r(int r7, e2.m1 r8, int r9, a3.n r10, int r11, java.lang.String r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: a3.r.<init>(int, e2.m1, int, a3.n, int, java.lang.String, int, boolean):void");
    }

    public static int c(r rVar, r rVar2) {
        h9.w c10 = h9.w.f14081a.c(rVar.f120n, rVar2.f120n);
        Integer valueOf = Integer.valueOf(rVar.f125y);
        Integer valueOf2 = Integer.valueOf(rVar2.f125y);
        o1 o1Var = o1.f14034c;
        return c10.b(valueOf, valueOf2, o1Var).a(rVar.E, rVar2.E).a(rVar.F, rVar2.F).b(Integer.valueOf(rVar.G), Integer.valueOf(rVar2.G), o1Var).c(rVar.H, rVar2.H).a(rVar.I, rVar2.I).c(rVar.f121r, rVar2.f121r).c(rVar.f118e, rVar2.f118e).c(rVar.h, rVar2.h).b(Integer.valueOf(rVar.f124x), Integer.valueOf(rVar2.f124x), o1Var).c(rVar.L, rVar2.L).c(rVar.N, rVar2.N).e();
    }

    @Override
    public final int a() {
        return this.K;
    }

    @Override
    public final boolean b(q qVar) {
        r rVar = (r) qVar;
        if (this.J || Objects.equals(this.Q, rVar.Q)) {
            this.f119f.getClass();
            if (this.L == rVar.L && this.N == rVar.N) {
                return true;
            }
            return false;
        }
        return false;
    }
}
