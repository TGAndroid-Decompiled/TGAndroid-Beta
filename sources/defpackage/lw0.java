package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.a;
public final class lw0 extends AnimatorListenerAdapter {
    public final boolean a;
    public final float b;
    public final float c;
    public final xw0 d;

    public lw0(xw0 xw0Var, boolean z, float f, float f2) {
        this.d = xw0Var;
        this.a = z;
        this.b = f;
        this.c = f2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        xw0 xw0Var = this.d;
        pw0 pw0Var = xw0Var.E;
        uw0 uw0Var = xw0Var.Y;
        ow0 ow0Var = xw0Var.x;
        xw0Var.j0 = false;
        boolean z = this.a;
        if (!z) {
            xw0Var.I();
            xw0Var.L();
            float f2 = this.b;
            ow0Var.setForceOffsetY(f2 - hl.L(24.0f));
            ow0Var.setTopActionBarOffsetY(f2 - hl.L(24.0f));
            ow0Var.setSwipeOffsetY(0.0f);
            f = 1.0f - xw0Var.i0;
        } else {
            ow0Var.setForceOffsetY(-hl.L(24.0f));
            ow0Var.setTopActionBarOffsetY(-hl.L(24.0f));
            ow0Var.setSwipeOffsetY(0.0f);
            f = xw0Var.i0;
        }
        xw0Var.h0 = f;
        uw0Var.setAlpha(1.0f - f);
        uw0Var.setTranslationY((-a.getCurrentActionBarHeight()) * xw0Var.h0);
        xw0Var.o0.setAlpha(xw0Var.h0);
        if (z) {
            uw0Var.setVisibility(8);
        }
        ow0Var.setSwipeOffsetAnimationDisallowed(false);
        ow0Var.setTranslationX(hl.R1(this.c, 0.0f, xw0Var.i0));
        xw0Var.n0.setTranslationX(0.0f);
        xw0Var.f.invalidate();
        pw0Var.setViewPortHeightOffset(0.0f);
        pw0Var.l(true, true);
        xw0Var.H();
    }
}
