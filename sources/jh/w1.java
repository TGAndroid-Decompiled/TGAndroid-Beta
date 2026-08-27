package jh;

import android.animation.ValueAnimator;

public final class w1 implements ValueAnimator.AnimatorUpdateListener {

    public final int f14088a;

    public final e4 f14089b;

    public w1(e4 e4Var, int i10) {
        this.f14088a = i10;
        this.f14089b = e4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14088a) {
            case 0:
                e4 e4Var = this.f14089b;
                e4Var.getClass();
                e4Var.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e4Var.invalidate();
                break;
            case 1:
                e4 e4Var2 = this.f14089b;
                e4Var2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e4Var2.f13263p3 = fFloatValue;
                e4Var2.f13257n3.setTransitionProgress(fFloatValue);
                break;
            default:
                e4.Z(this.f14089b, valueAnimator);
                break;
        }
    }
}
