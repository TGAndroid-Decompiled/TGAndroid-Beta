package ah;

import android.animation.ValueAnimator;
public final class j0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f788a;
    public final t0 f789b;

    public j0(t0 t0Var, int i10) {
        this.f788a = i10;
        this.f789b = t0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f788a) {
            case 0:
                t0 t0Var = this.f789b;
                t0Var.getClass();
                t0Var.f870a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f789b.f870a.invalidate();
                return;
        }
    }
}
