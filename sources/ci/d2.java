package ci;

import android.animation.ValueAnimator;
public final class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5251a;
    public final p4 f5252b;

    public d2(p4 p4Var, int i10) {
        this.f5251a = i10;
        this.f5252b = p4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5251a) {
            case 0:
                p4 p4Var = this.f5252b;
                p4Var.getClass();
                p4Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var.invalidate();
                return;
            case 1:
                p4 p4Var2 = this.f5252b;
                p4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var2.f5710t3 = floatValue;
                p4Var2.f5704r3.setTransitionProgress(floatValue);
                return;
            default:
                p4.Y(this.f5252b, valueAnimator);
                return;
        }
    }
}
