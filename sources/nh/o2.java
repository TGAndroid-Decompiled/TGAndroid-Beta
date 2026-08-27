package nh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class o2 implements ValueAnimator.AnimatorUpdateListener {

    public final boolean f18856a;

    public final float f18857b;

    public final float f18858c;
    public final float d;

    public final float f18859e;

    public final b3 f18860f;

    public o2(b3 b3Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f18860f = b3Var;
        this.f18856a = z10;
        this.f18857b = f10;
        this.f18858c = f11;
        this.d = f12;
        this.f18859e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        b3 b3Var = this.f18860f;
        t2 t2Var = b3Var.f18599x;
        y2 y2Var = b3Var.S;
        s2 s2Var = b3Var.v;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b3Var.f18573c0 = fFloatValue;
        if (!this.f18856a) {
            fFloatValue = 1.0f - fFloatValue;
        }
        b3Var.f18571b0 = fFloatValue;
        y2Var.setAlpha(1.0f - fFloatValue);
        y2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * b3Var.f18571b0);
        float f10 = this.f18857b;
        float f11 = b3Var.f18573c0;
        float f12 = this.f18858c;
        s2Var.setTranslationY(AndroidUtilities.lerp(f10, f12, f11));
        s2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, b3Var.f18573c0));
        b3Var.f18580h0.setTranslationX(AndroidUtilities.lerp(this.f18859e, 0.0f, b3Var.f18573c0));
        b3Var.f18581i0.setAlpha(b3Var.f18571b0);
        b3Var.f18575e.invalidate();
        t2Var.setViewPortHeightOffset(s2Var.getTranslationY() - f12);
        t2Var.n(false, false);
        b3Var.C();
    }
}
