package di;

import android.animation.ValueAnimator;
public final class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8482a;
    public final q4 f8483b;

    public d2(q4 q4Var, int i10) {
        this.f8482a = i10;
        this.f8483b = q4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8482a) {
            case 0:
                q4 q4Var = this.f8483b;
                q4Var.getClass();
                q4Var.f9040w2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q4Var.invalidate();
                return;
            case 1:
                q4 q4Var2 = this.f8483b;
                q4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q4Var2.f8989i3 = floatValue;
                q4Var2.f8983g3.setTransitionProgress(floatValue);
                return;
            default:
                q4.X(this.f8483b, valueAnimator);
                return;
        }
    }
}
