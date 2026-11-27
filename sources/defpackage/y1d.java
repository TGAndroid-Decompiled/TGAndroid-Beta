package defpackage;

import android.view.WindowInsets;
public class y1d extends b2d {
    public final WindowInsets.Builder c;

    public y1d(l2d l2dVar) {
        super(l2dVar);
        WindowInsets.Builder h;
        WindowInsets g = l2dVar.g();
        if (g != null) {
            h = vk1.i(g);
        } else {
            h = vk1.h();
        }
        this.c = h;
    }

    @Override
    public l2d b() {
        a();
        l2d h = l2d.h(null, this.c.build());
        h.a.q(this.b);
        return h;
    }

    @Override
    public void d(mq5 mq5Var) {
        this.c.setMandatorySystemGestureInsets(mq5Var.d());
    }

    @Override
    public void e(mq5 mq5Var) {
        this.c.setStableInsets(mq5Var.d());
    }

    @Override
    public void f(mq5 mq5Var) {
        this.c.setSystemGestureInsets(mq5Var.d());
    }

    @Override
    public void g(mq5 mq5Var) {
        this.c.setSystemWindowInsets(mq5Var.d());
    }

    @Override
    public void h(mq5 mq5Var) {
        this.c.setTappableElementInsets(mq5Var.d());
    }

    public y1d() {
        this.c = vk1.h();
    }
}
