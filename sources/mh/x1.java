package mh;

import android.animation.ValueAnimator;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18197a;
    public final c3 f18198b;

    public x1(c3 c3Var, int i9) {
        this.f18197a = i9;
        this.f18198b = c3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18197a) {
            case 0:
                c3 c3Var = this.f18198b;
                c3Var.getClass();
                c3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var.h();
                return;
            default:
                this.f18198b.f17780y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
