package ai;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f693a;
    public final f6 f694b;

    public d3(f6 f6Var, int i10) {
        this.f693a = i10;
        this.f694b = f6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f693a) {
            case 0:
                f6 f6Var = this.f694b;
                f6Var.getClass();
                f6Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.invalidate();
                return;
            case 1:
                f6 f6Var2 = this.f694b;
                f6Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var2.f851t3 = floatValue;
                f6Var2.f845r3.setTransitionProgress(floatValue);
                return;
            default:
                f6.Z(this.f694b, valueAnimator);
                return;
        }
    }
}
