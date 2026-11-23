package fi;

import android.animation.ValueAnimator;
public final class p7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12448a;
    public final x7 f12449b;
    public final float f12450c;
    public final float d;

    public p7(x7 x7Var, float f10, float f11, int i7) {
        this.f12448a = i7;
        this.f12449b = x7Var;
        this.f12450c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12448a) {
            case 0:
                x7 x7Var = this.f12449b;
                x7Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x7Var.setScrollY((int) org.telegram.messenger.g0.T1(this.f12450c, 0.0f, floatValue));
                w7 w7Var = x7Var.f12780c0;
                w7Var.f12754x = org.telegram.messenger.g0.T1(this.d, 0.0f, floatValue);
                w7Var.invalidate();
                return;
            default:
                x7 x7Var2 = this.f12449b;
                x7Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x7Var2.setScrollY((int) org.telegram.messenger.g0.T1(this.f12450c, Math.min((x7Var2.getMeasuredHeight() - x7Var2.f12798v0) - org.telegram.messenger.g0.L(64.0f), x7Var2.f12795s0.getBottom() - x7Var2.getMeasuredHeight()), floatValue2));
                w7 w7Var2 = x7Var2.f12780c0;
                w7Var2.f12754x = org.telegram.messenger.g0.T1(this.d, 1.0f, floatValue2);
                w7Var2.invalidate();
                return;
        }
    }
}
