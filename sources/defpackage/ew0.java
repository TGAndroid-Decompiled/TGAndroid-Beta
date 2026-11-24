package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ew0 extends AnimatorListenerAdapter {
    public final int a;
    public final int b;
    public final iv0 c;
    public final ow0 d;

    public ew0(ow0 ow0Var, int i, int i2, iv0 iv0Var) {
        this.d = ow0Var;
        this.a = i;
        this.b = i2;
        this.c = iv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f = bm2.f(1.0f, this.a, this.b);
        ow0 ow0Var = this.d;
        ow0Var.S = f;
        ow0Var.h();
        nw0 nw0Var = ow0Var.f;
        nw0Var.invalidate();
        lw0 lw0Var = ow0Var.Y;
        lw0Var.setBackgroundColor(ow0Var.S);
        iv0 iv0Var = this.c;
        iv0Var.b(lw0Var, 1.0f);
        ow0Var.a = iv0Var.a(bkb.yj);
        nw0Var.invalidate();
    }
}
