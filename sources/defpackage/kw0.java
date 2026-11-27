package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.a;
public final class kw0 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final xw0 f;

    public kw0(xw0 xw0Var, boolean z, float f, float f2, float f3, float f4) {
        this.f = xw0Var;
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        xw0 xw0Var = this.f;
        pw0 pw0Var = xw0Var.E;
        uw0 uw0Var = xw0Var.Y;
        ow0 ow0Var = xw0Var.x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        xw0Var.i0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        xw0Var.h0 = floatValue;
        uw0Var.setAlpha(1.0f - floatValue);
        uw0Var.setTranslationY((-a.getCurrentActionBarHeight()) * xw0Var.h0);
        float f = this.b;
        float f2 = xw0Var.i0;
        float f3 = this.c;
        ow0Var.setTranslationY(hl.R1(f, f3, f2));
        ow0Var.setTranslationX(hl.R1(this.d, 0.0f, xw0Var.i0));
        xw0Var.n0.setTranslationX(hl.R1(this.e, 0.0f, xw0Var.i0));
        xw0Var.o0.setAlpha(xw0Var.h0);
        xw0Var.f.invalidate();
        pw0Var.setViewPortHeightOffset(ow0Var.getTranslationY() - f3);
        pw0Var.l(false, false);
        xw0Var.H();
    }
}
