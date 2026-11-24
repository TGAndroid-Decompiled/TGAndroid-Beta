package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.a;
public final class jx0 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final wx0 f;

    public jx0(wx0 wx0Var, boolean z, float f, float f2, float f3, float f4) {
        this.f = wx0Var;
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        wx0 wx0Var = this.f;
        ox0 ox0Var = wx0Var.E;
        tx0 tx0Var = wx0Var.Y;
        nx0 nx0Var = wx0Var.x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wx0Var.i0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        wx0Var.h0 = floatValue;
        tx0Var.setAlpha(1.0f - floatValue);
        tx0Var.setTranslationY((-a.getCurrentActionBarHeight()) * wx0Var.h0);
        float f = this.b;
        float f2 = wx0Var.i0;
        float f3 = this.c;
        nx0Var.setTranslationY(gm.R1(f, f3, f2));
        nx0Var.setTranslationX(gm.R1(this.d, 0.0f, wx0Var.i0));
        wx0Var.n0.setTranslationX(gm.R1(this.e, 0.0f, wx0Var.i0));
        wx0Var.o0.setAlpha(wx0Var.h0);
        wx0Var.f.invalidate();
        ox0Var.setViewPortHeightOffset(nx0Var.getTranslationY() - f3);
        ox0Var.l(false, false);
        wx0Var.H();
    }
}
