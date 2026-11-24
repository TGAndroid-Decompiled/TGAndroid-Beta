package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
public final class wd3 extends de3 implements Comparable {
    public final boolean E;
    public final boolean F;
    public final int G;
    public final int H;
    public final boolean I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final byte e;
    public final boolean f;
    public final String h;
    public final ae3 n;
    public final boolean r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    public wd3(int r8, defpackage.uzb r9, int r10, defpackage.ae3 r11, int r12, boolean r13, defpackage.vd3 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd3.<init>(int, uzb, int, ae3, int, boolean, vd3, int):void");
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(de3 de3Var) {
        int i;
        String str;
        wd3 wd3Var = (wd3) de3Var;
        go4 go4Var = wd3Var.d;
        this.n.getClass();
        go4 go4Var2 = this.d;
        int i2 = go4Var2.N;
        if (i2 != -1 && i2 == go4Var.N) {
            if ((this.E || ((str = go4Var2.t) != null && TextUtils.equals(str, go4Var.t))) && (i = go4Var2.P) != -1 && i == go4Var.P && this.N == wd3Var.N && this.O == wd3Var.O) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int compareTo(wd3 wd3Var) {
        at7 at7Var;
        at7 a;
        boolean z = this.r;
        boolean z2 = this.f;
        if (z2 && z) {
            a = fe3.l;
            at7Var = a;
        } else {
            at7 at7Var2 = fe3.l;
            at7Var = at7Var2;
            a = at7Var2.a();
        }
        boolean z3 = wd3Var.r;
        int i = wd3Var.L;
        hq2 c = hq2.a.c(z, z3);
        Integer valueOf = Integer.valueOf(this.w);
        Integer valueOf2 = Integer.valueOf(wd3Var.w);
        jk7 jk7Var = jk7.c;
        hq2 b = c.b(valueOf, valueOf2, jk7Var).a(this.s, wd3Var.s).a(this.x, wd3Var.x).b(Integer.valueOf(this.y), Integer.valueOf(wd3Var.y), jk7Var).c(this.I, wd3Var.I).c(this.F, wd3Var.F).b(Integer.valueOf(this.G), Integer.valueOf(wd3Var.G), jk7Var).a(this.H, wd3Var.H).c(z2, wd3Var.f).b(Integer.valueOf(this.M), Integer.valueOf(wd3Var.M), jk7Var);
        boolean z4 = this.n.F;
        int i2 = this.L;
        if (z4) {
            b = b.b(Integer.valueOf(i2), Integer.valueOf(i), at7Var.a());
        }
        hq2 b2 = b.c(this.N, wd3Var.N).c(this.O, wd3Var.O).c(this.P, wd3Var.P).b(Integer.valueOf(this.J), Integer.valueOf(wd3Var.J), a).b(Integer.valueOf(this.K), Integer.valueOf(wd3Var.K), a);
        if (Objects.equals(this.h, wd3Var.h)) {
            b2 = b2.b(Integer.valueOf(i2), Integer.valueOf(i), a);
        }
        return b2.e();
    }
}
