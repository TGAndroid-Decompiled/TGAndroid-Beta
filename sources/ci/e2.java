package ci;

import android.animation.ValueAnimator;
public final class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5350a;
    public final q4 f5351b;

    public e2(q4 q4Var, int i10) {
        this.f5350a = i10;
        this.f5351b = q4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5350a) {
            case 0:
                q4 q4Var = this.f5351b;
                q4Var.getClass();
                q4Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q4Var.invalidate();
                return;
            case 1:
                q4 q4Var2 = this.f5351b;
                q4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q4Var2.f5823t3 = floatValue;
                q4Var2.f5817r3.setTransitionProgress(floatValue);
                return;
            default:
                q4.Z(this.f5351b, valueAnimator);
                return;
        }
    }
}
