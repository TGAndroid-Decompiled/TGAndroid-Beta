package defpackage;

import j$.util.Objects;
public final class rc3 extends qc3 {
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
    public final nc3 f;
    public final boolean h;
    public final boolean n;
    public final boolean r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    public rc3(int r7, defpackage.sxb r8, int r9, defpackage.nc3 r10, int r11, java.lang.String r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc3.<init>(int, sxb, int, nc3, int, java.lang.String, int, boolean):void");
    }

    public static int c(rc3 rc3Var, rc3 rc3Var2) {
        wo2 c = wo2.a.c(rc3Var.n, rc3Var2.n);
        Integer valueOf = Integer.valueOf(rc3Var.y);
        Integer valueOf2 = Integer.valueOf(rc3Var2.y);
        hi7 hi7Var = hi7.c;
        return c.b(valueOf, valueOf2, hi7Var).a(rc3Var.E, rc3Var2.E).a(rc3Var.F, rc3Var2.F).b(Integer.valueOf(rc3Var.G), Integer.valueOf(rc3Var2.G), hi7Var).c(rc3Var.H, rc3Var2.H).a(rc3Var.I, rc3Var2.I).c(rc3Var.r, rc3Var2.r).c(rc3Var.e, rc3Var2.e).c(rc3Var.h, rc3Var2.h).b(Integer.valueOf(rc3Var.x), Integer.valueOf(rc3Var2.x), hi7Var).c(rc3Var.L, rc3Var2.L).c(rc3Var.N, rc3Var2.N).e();
    }

    @Override
    public final int a() {
        return this.K;
    }

    @Override
    public final boolean b(qc3 qc3Var) {
        rc3 rc3Var = (rc3) qc3Var;
        if (this.J || Objects.equals(this.Q, rc3Var.Q)) {
            this.f.getClass();
            if (this.L == rc3Var.L && this.N == rc3Var.N) {
                return true;
            }
            return false;
        }
        return false;
    }
}
