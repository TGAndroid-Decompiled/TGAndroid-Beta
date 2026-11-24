package defpackage;

import android.view.WindowInsets;
public class ixc extends lxc {
    public final WindowInsets.Builder c;

    public ixc(vxc vxcVar) {
        super(vxcVar);
        WindowInsets.Builder h;
        WindowInsets g = vxcVar.g();
        if (g != null) {
            h = mk1.i(g);
        } else {
            h = mk1.h();
        }
        this.c = h;
    }

    @Override
    public vxc b() {
        a();
        vxc h = vxc.h(null, this.c.build());
        h.a.q(this.b);
        return h;
    }

    @Override
    public void d(io5 io5Var) {
        this.c.setMandatorySystemGestureInsets(io5Var.d());
    }

    @Override
    public void e(io5 io5Var) {
        this.c.setStableInsets(io5Var.d());
    }

    @Override
    public void f(io5 io5Var) {
        this.c.setSystemGestureInsets(io5Var.d());
    }

    @Override
    public void g(io5 io5Var) {
        this.c.setSystemWindowInsets(io5Var.d());
    }

    @Override
    public void h(io5 io5Var) {
        this.c.setTappableElementInsets(io5Var.d());
    }

    public ixc() {
        this.c = mk1.h();
    }
}
