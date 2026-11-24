package defpackage;

import j$.util.Objects;
public final class ee3 extends de3 {
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final byte K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final byte O;
    public final boolean P;
    public final String Q;
    public final boolean e;
    public final ae3 f;
    public final boolean h;
    public final boolean n;
    public final boolean r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    public ee3(int r7, defpackage.uzb r8, int r9, defpackage.ae3 r10, int r11, java.lang.String r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee3.<init>(int, uzb, int, ae3, int, java.lang.String, int, boolean):void");
    }

    public static int c(ee3 ee3Var, ee3 ee3Var2) {
        hq2 c = hq2.a.c(ee3Var.n, ee3Var2.n);
        Integer valueOf = Integer.valueOf(ee3Var.y);
        Integer valueOf2 = Integer.valueOf(ee3Var2.y);
        jk7 jk7Var = jk7.c;
        return c.b(valueOf, valueOf2, jk7Var).a(ee3Var.E, ee3Var2.E).a(ee3Var.F, ee3Var2.F).b(Integer.valueOf(ee3Var.G), Integer.valueOf(ee3Var2.G), jk7Var).c(ee3Var.H, ee3Var2.H).a(ee3Var.I, ee3Var2.I).c(ee3Var.r, ee3Var2.r).c(ee3Var.e, ee3Var2.e).c(ee3Var.h, ee3Var2.h).b(Integer.valueOf(ee3Var.x), Integer.valueOf(ee3Var2.x), jk7Var).c(ee3Var.L, ee3Var2.L).c(ee3Var.N, ee3Var2.N).e();
    }

    @Override
    public final int a() {
        return this.K;
    }

    @Override
    public final boolean b(de3 de3Var) {
        ee3 ee3Var = (ee3) de3Var;
        if (this.J || Objects.equals(this.Q, ee3Var.Q)) {
            this.f.getClass();
            if (this.L == ee3Var.L && this.N == ee3Var.N) {
                return true;
            }
            return false;
        }
        return false;
    }
}
