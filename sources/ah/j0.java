package ah;

import android.animation.ValueAnimator;
public final class j0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f787a;
    public final t0 f788b;

    public j0(t0 t0Var, int i10) {
        this.f787a = i10;
        this.f788b = t0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f787a) {
            case 0:
                t0 t0Var = this.f788b;
                t0Var.getClass();
                t0Var.f869a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f788b.f869a.invalidate();
                return;
        }
    }
}
