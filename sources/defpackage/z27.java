package defpackage;

import org.telegram.tgnet.TLRPC;
public final class z27 extends gib {
    public final f37 w0;

    public z27(f37 f37Var) {
        this.w0 = f37Var;
        this.g0 = f37Var.d0.G;
    }

    @Override
    public final void H(int i, int i2, k27 k27Var) {
        bu1 bu1Var;
        k27 k27Var2;
        f37 f37Var = this.w0;
        z27 z27Var = f37Var.e;
        int i3 = z27Var.v - z27Var.u;
        l37 l37Var = f37Var.d0;
        if (i3 > na7.q1(l37Var.x).k4.N1.f()) {
            f37Var.f();
            return;
        }
        o27 o27Var = l37Var.d;
        o27Var.e = z27Var.u;
        o27Var.f = z27Var.v;
        k27 a = f37Var.a(k27Var);
        if (a != null && ((bu1Var = l37Var.d.d) == null || bu1Var.m || (k27Var2 = bu1Var.a) == null || k27Var2.e1() != a.e1())) {
            l37Var.d.d = bu1.b(i, i2, a);
        }
        l37Var.b();
        l37Var.a(true);
    }

    @Override
    public final boolean a() {
        k27 a;
        TLRPC.Message message;
        f37 f37Var = this.w0;
        if (f37Var.a == 0 && (a = f37Var.a(null)) != null && (message = a.k) != null && message.rich_message != null) {
            return false;
        }
        o27 o27Var = f37Var.d0.d;
        if (o27Var != null && o27Var.s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean d() {
        k27 a;
        TLRPC.Message message;
        f37 f37Var = this.w0;
        int i = f37Var.a;
        if (i == 0 && !f37Var.d0.d.i) {
            if (i != 0 || (a = f37Var.a(null)) == null || (message = a.k) == null || message.rich_message == null || vh9.c(f37Var.a(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final wjb p() {
        return this.g0;
    }

    @Override
    public final void v() {
        super.v();
        fu fuVar = this.w0.f;
        if (fuVar != null) {
            fuVar.invalidate();
        }
    }

    @Override
    public final boolean y(k27 k27Var) {
        f37 f37Var = this.w0;
        if (f37Var.a == 0 && !f37Var.d0.d.i && w()) {
            return true;
        }
        return false;
    }
}
