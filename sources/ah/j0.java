package ah;

import android.animation.ValueAnimator;
public final class j0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f786a;
    public final t0 f787b;

    public j0(t0 t0Var, int i10) {
        this.f786a = i10;
        this.f787b = t0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f786a) {
            case 0:
                t0 t0Var = this.f787b;
                t0Var.getClass();
                t0Var.f868a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f787b.f868a.invalidate();
                return;
        }
    }
}
