package defpackage;

import android.view.WindowInsets;
public class jzc extends mzc {
    public final WindowInsets.Builder c;

    public jzc(wzc wzcVar) {
        super(wzcVar);
        WindowInsets.Builder h;
        WindowInsets g = wzcVar.g();
        if (g != null) {
            h = ul1.i(g);
        } else {
            h = ul1.h();
        }
        this.c = h;
    }

    @Override
    public wzc b() {
        a();
        wzc h = wzc.h(null, this.c.build());
        h.a.q(this.b);
        return h;
    }

    @Override
    public void d(iq5 iq5Var) {
        this.c.setMandatorySystemGestureInsets(iq5Var.d());
    }

    @Override
    public void e(iq5 iq5Var) {
        this.c.setStableInsets(iq5Var.d());
    }

    @Override
    public void f(iq5 iq5Var) {
        this.c.setSystemGestureInsets(iq5Var.d());
    }

    @Override
    public void g(iq5 iq5Var) {
        this.c.setSystemWindowInsets(iq5Var.d());
    }

    @Override
    public void h(iq5 iq5Var) {
        this.c.setTappableElementInsets(iq5Var.d());
    }

    public jzc() {
        this.c = ul1.h();
    }
}
