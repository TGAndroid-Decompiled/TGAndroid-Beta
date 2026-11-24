package defpackage;

import org.telegram.tgnet.TLRPC;
public final class z47 extends hkb {
    public final f57 w0;

    public z47(f57 f57Var) {
        this.w0 = f57Var;
        this.g0 = f57Var.d0.G;
    }

    @Override
    public final void H(int i, int i2, k47 k47Var) {
        nv1 nv1Var;
        k47 k47Var2;
        f57 f57Var = this.w0;
        z47 z47Var = f57Var.e;
        int i3 = z47Var.v - z47Var.u;
        l57 l57Var = f57Var.d0;
        if (i3 > oc7.r1(l57Var.x).l4.N1.f()) {
            f57Var.f();
            return;
        }
        o47 o47Var = l57Var.d;
        o47Var.e = z47Var.u;
        o47Var.f = z47Var.v;
        k47 a = f57Var.a(k47Var);
        if (a != null && ((nv1Var = l57Var.d.d) == null || nv1Var.m || (k47Var2 = nv1Var.a) == null || k47Var2.e1() != a.e1())) {
            l57Var.d.d = nv1.b(i, i2, a);
        }
        l57Var.b();
        l57Var.a(true);
    }

    @Override
    public final boolean a() {
        k47 a;
        TLRPC.Message message;
        f57 f57Var = this.w0;
        if (f57Var.a == 0 && (a = f57Var.a(null)) != null && (message = a.k) != null && message.rich_message != null) {
            return false;
        }
        o47 o47Var = f57Var.d0.d;
        if (o47Var != null && o47Var.s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean d() {
        k47 a;
        TLRPC.Message message;
        f57 f57Var = this.w0;
        int i = f57Var.a;
        if (i == 0 && !f57Var.d0.d.i) {
            if (i != 0 || (a = f57Var.a(null)) == null || (message = a.k) == null || message.rich_message == null || yj9.c(f57Var.a(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final ylb p() {
        return this.g0;
    }

    @Override
    public final void v() {
        super.v();
        fv fvVar = this.w0.f;
        if (fvVar != null) {
            fvVar.invalidate();
        }
    }

    @Override
    public final boolean y(k47 k47Var) {
        f57 f57Var = this.w0;
        if (f57Var.a == 0 && !f57Var.d0.d.i && w()) {
            return true;
        }
        return false;
    }
}
