package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f9457a;
    public final float f9458b;
    public final float f9459c;
    public final float d;
    public final float f9460e;
    public final l3 f9461f;

    public x2(l3 l3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f9461f = l3Var;
        this.f9457a = z10;
        this.f9458b = f7;
        this.f9459c = f10;
        this.d = f11;
        this.f9460e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        l3 l3Var = this.f9461f;
        c3 c3Var = l3Var.f9181x;
        i3 i3Var = l3Var.W;
        b3 b3Var = l3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        l3Var.f9161g0 = floatValue;
        if (!this.f9457a) {
            floatValue = 1.0f - floatValue;
        }
        l3Var.f9160f0 = floatValue;
        i3Var.setAlpha(1.0f - floatValue);
        i3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * l3Var.f9160f0);
        float f7 = this.f9458b;
        float f10 = l3Var.f9161g0;
        float f11 = this.f9459c;
        b3Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        b3Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, l3Var.f9161g0));
        l3Var.f9166l0.setTranslationX(AndroidUtilities.lerp(this.f9460e, 0.0f, l3Var.f9161g0));
        l3Var.m0.setAlpha(l3Var.f9160f0);
        l3Var.f9157e.invalidate();
        c3Var.setViewPortHeightOffset(b3Var.getTranslationY() - f11);
        c3Var.o(false, false);
        l3Var.C();
    }
}
