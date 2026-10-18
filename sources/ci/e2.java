package ci;

import android.animation.ValueAnimator;
public final class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5353a;
    public final q4 f5354b;

    public e2(q4 q4Var, int i10) {
        this.f5353a = i10;
        this.f5354b = q4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5353a) {
            case 0:
                q4 q4Var = this.f5354b;
                q4Var.getClass();
                q4Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q4Var.invalidate();
                return;
            case 1:
                q4 q4Var2 = this.f5354b;
                q4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q4Var2.f5826t3 = floatValue;
                q4Var2.f5820r3.setTransitionProgress(floatValue);
                return;
            default:
                q4.Z(this.f5354b, valueAnimator);
                return;
        }
    }
}
