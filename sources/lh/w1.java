package lh;

import android.animation.ValueAnimator;
public final class w1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f16353a;
    public final d4 f16354b;

    public w1(d4 d4Var, int i10) {
        this.f16353a = i10;
        this.f16354b = d4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16353a) {
            case 0:
                d4 d4Var = this.f16354b;
                d4Var.getClass();
                d4Var.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d4Var.invalidate();
                return;
            case 1:
                d4 d4Var2 = this.f16354b;
                d4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d4Var2.f15512p3 = floatValue;
                d4Var2.f15506n3.setTransitionProgress(floatValue);
                return;
            default:
                d4.Z(this.f16354b, valueAnimator);
                return;
        }
    }
}
