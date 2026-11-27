package defpackage;

import java.util.List;
public final class ic3 implements e84 {
    public final byte a;
    public final Object b;

    public ic3() {
        this.a = (byte) 1;
        this.b = new yh7(peb.B, 16);
    }

    @Override
    public final e84 a() {
        switch (this.a) {
            case 0:
                return this;
            default:
                return (yh7) this.b;
        }
    }

    @Override
    public final int b(f84 f84Var, v11 v11Var) {
        switch (this.a) {
            case 0:
                if (((cb3) f84Var).k(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
            default:
                return ((yh7) this.b).b(f84Var, v11Var);
        }
    }

    @Override
    public final boolean c(f84 f84Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((yh7) this.b).c(f84Var);
        }
    }

    @Override
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                return;
            default:
                ((yh7) this.b).d(j, j2);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.a) {
            case 0:
                no5 no5Var = po5.b;
                return j99.e;
            default:
                return ((yh7) this.b).m;
        }
    }

    @Override
    public final void f(g84 g84Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                x1c e0 = g84Var.e0(0, 3);
                g84Var.m0(new qc0(-9223372036854775807L));
                g84Var.D();
                ko4 ko4Var = (ko4) obj;
                jo4 a = ko4Var.a();
                a.s = dg7.n("text/x-unknown");
                a.k = ko4Var.t;
                xnb.v(a, e0);
                return;
            default:
                ((yh7) obj).f(new i09(g84Var, (byte) 8));
                return;
        }
    }

    @Override
    public final void release() {
        byte b = this.a;
    }

    public ic3(ko4 ko4Var) {
        this.a = (byte) 0;
        this.b = ko4Var;
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i(long j, long j2) {
    }
}
