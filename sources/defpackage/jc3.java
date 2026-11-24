package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
public final class jc3 extends qc3 implements Comparable {
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
    public final nc3 n;
    public final boolean r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    public jc3(int r8, defpackage.sxb r9, int r10, defpackage.nc3 r11, int r12, boolean r13, defpackage.ic3 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc3.<init>(int, sxb, int, nc3, int, boolean, ic3, int):void");
    }

    @Override
    public final int a() {
        return this.e;
    }

    @Override
    public final boolean b(qc3 qc3Var) {
        int i;
        String str;
        jc3 jc3Var = (jc3) qc3Var;
        fm4 fm4Var = jc3Var.d;
        this.n.getClass();
        fm4 fm4Var2 = this.d;
        int i2 = fm4Var2.N;
        if (i2 != -1 && i2 == fm4Var.N) {
            if ((this.E || ((str = fm4Var2.t) != null && TextUtils.equals(str, fm4Var.t))) && (i = fm4Var2.P) != -1 && i == fm4Var.P && this.N == jc3Var.N && this.O == jc3Var.O) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int compareTo(jc3 jc3Var) {
        yq7 yq7Var;
        yq7 a;
        boolean z = this.r;
        boolean z2 = this.f;
        if (z2 && z) {
            a = sc3.l;
            yq7Var = a;
        } else {
            yq7 yq7Var2 = sc3.l;
            yq7Var = yq7Var2;
            a = yq7Var2.a();
        }
        boolean z3 = jc3Var.r;
        int i = jc3Var.L;
        wo2 c = wo2.a.c(z, z3);
        Integer valueOf = Integer.valueOf(this.w);
        Integer valueOf2 = Integer.valueOf(jc3Var.w);
        hi7 hi7Var = hi7.c;
        wo2 b = c.b(valueOf, valueOf2, hi7Var).a(this.s, jc3Var.s).a(this.x, jc3Var.x).b(Integer.valueOf(this.y), Integer.valueOf(jc3Var.y), hi7Var).c(this.I, jc3Var.I).c(this.F, jc3Var.F).b(Integer.valueOf(this.G), Integer.valueOf(jc3Var.G), hi7Var).a(this.H, jc3Var.H).c(z2, jc3Var.f).b(Integer.valueOf(this.M), Integer.valueOf(jc3Var.M), hi7Var);
        boolean z4 = this.n.F;
        int i2 = this.L;
        if (z4) {
            b = b.b(Integer.valueOf(i2), Integer.valueOf(i), yq7Var.a());
        }
        wo2 b2 = b.c(this.N, jc3Var.N).c(this.O, jc3Var.O).c(this.P, jc3Var.P).b(Integer.valueOf(this.J), Integer.valueOf(jc3Var.J), a).b(Integer.valueOf(this.K), Integer.valueOf(jc3Var.K), a);
        if (Objects.equals(this.h, jc3Var.h)) {
            b2 = b2.b(Integer.valueOf(i2), Integer.valueOf(i), a);
        }
        return b2.e();
    }
}
