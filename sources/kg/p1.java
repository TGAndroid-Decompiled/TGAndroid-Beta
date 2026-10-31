package kg;

import android.animation.ValueAnimator;
public final class p1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11216a;
    public final v1 f11217b;

    public p1(v1 v1Var, int i10) {
        this.f11216a = i10;
        this.f11217b = v1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11216a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1 v1Var = this.f11217b;
                v1Var.f11316y2 = floatValue;
                v1Var.f21589c.invalidate();
                return;
            default:
                v1 v1Var2 = this.f11217b;
                v1Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var2.F2.getLayoutParams().height = org.telegram.messenger.i0.W1(floatValue2, v1Var2.G2[0].getHeight(), v1Var2.G2[1].getHeight());
                v1Var2.F2.requestLayout();
                return;
        }
    }
}
