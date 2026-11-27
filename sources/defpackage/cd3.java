package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
public final class cd3 extends jd3 implements Comparable {
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
    public final gd3 n;
    public final boolean r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    public cd3(int r8, defpackage.t1c r9, int r10, defpackage.gd3 r11, int r12, boolean r13, defpackage.bd3 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd3.<init>(int, t1c, int, gd3, int, boolean, bd3, int):void");
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(jd3 jd3Var) {
        int i;
        String str;
        cd3 cd3Var = (cd3) jd3Var;
        ko4 ko4Var = cd3Var.d;
        this.n.getClass();
        ko4 ko4Var2 = this.d;
        int i2 = ko4Var2.N;
        if (i2 != -1 && i2 == ko4Var.N) {
            if ((this.E || ((str = ko4Var2.t) != null && TextUtils.equals(str, ko4Var.t))) && (i = ko4Var2.P) != -1 && i == ko4Var.P && this.N == cd3Var.N && this.O == cd3Var.O) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int compareTo(cd3 cd3Var) {
        eu7 eu7Var;
        eu7 a;
        boolean z = this.r;
        boolean z2 = this.f;
        if (z2 && z) {
            a = ld3.l;
            eu7Var = a;
        } else {
            eu7 eu7Var2 = ld3.l;
            eu7Var = eu7Var2;
            a = eu7Var2.a();
        }
        boolean z3 = cd3Var.r;
        int i = cd3Var.L;
        pp2 c = pp2.a.c(z, z3);
        Integer valueOf = Integer.valueOf(this.w);
        Integer valueOf2 = Integer.valueOf(cd3Var.w);
        qk7 qk7Var = qk7.c;
        pp2 b = c.b(valueOf, valueOf2, qk7Var).a(this.s, cd3Var.s).a(this.x, cd3Var.x).b(Integer.valueOf(this.y), Integer.valueOf(cd3Var.y), qk7Var).c(this.I, cd3Var.I).c(this.F, cd3Var.F).b(Integer.valueOf(this.G), Integer.valueOf(cd3Var.G), qk7Var).a(this.H, cd3Var.H).c(z2, cd3Var.f).b(Integer.valueOf(this.M), Integer.valueOf(cd3Var.M), qk7Var);
        boolean z4 = this.n.F;
        int i2 = this.L;
        if (z4) {
            b = b.b(Integer.valueOf(i2), Integer.valueOf(i), eu7Var.a());
        }
        pp2 b2 = b.c(this.N, cd3Var.N).c(this.O, cd3Var.O).c(this.P, cd3Var.P).b(Integer.valueOf(this.J), Integer.valueOf(cd3Var.J), a).b(Integer.valueOf(this.K), Integer.valueOf(cd3Var.K), a);
        if (Objects.equals(this.h, cd3Var.h)) {
            b2 = b2.b(Integer.valueOf(i2), Integer.valueOf(i), a);
        }
        return b2.e();
    }
}
