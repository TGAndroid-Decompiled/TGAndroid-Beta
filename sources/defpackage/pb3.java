package defpackage;

import java.util.List;
public final class pb3 implements j74 {
    public final byte a;
    public final Object b;

    public pb3() {
        this.a = (byte) 1;
        this.b = new pf7(sab.B, 16);
    }

    @Override
    public final j74 a() {
        switch (this.a) {
            case 0:
                return this;
            default:
                return (pf7) this.b;
        }
    }

    @Override
    public final int b(k74 k74Var, m11 m11Var) {
        switch (this.a) {
            case 0:
                if (((ja3) k74Var).k(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
            default:
                return ((pf7) this.b).b(k74Var, m11Var);
        }
    }

    @Override
    public final boolean c(k74 k74Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((pf7) this.b).c(k74Var);
        }
    }

    @Override
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                return;
            default:
                ((pf7) this.b).d(j, j2);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.a) {
            case 0:
                km5 km5Var = mm5.b;
                return w59.e;
            default:
                return ((pf7) this.b).m;
        }
    }

    @Override
    public final void f(l74 l74Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wxb S = l74Var.S(0, 3);
                l74Var.g0(new oc0(-9223372036854775807L));
                l74Var.z();
                fm4 fm4Var = (fm4) obj;
                em4 a = fm4Var.a();
                a.s = ud7.n("text/x-unknown");
                a.k = fm4Var.t;
                yjb.v(a, S);
                return;
            default:
                ((pf7) obj).f(new ln8(l74Var, (byte) 10));
                return;
        }
    }

    @Override
    public final void release() {
        byte b = this.a;
    }

    public pb3(fm4 fm4Var) {
        this.a = (byte) 0;
        this.b = fm4Var;
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i(long j, long j2) {
    }
}
