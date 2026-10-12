package ah;

import android.animation.ValueAnimator;
public final class j0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f782a;
    public final t0 f783b;

    public j0(t0 t0Var, int i10) {
        this.f782a = i10;
        this.f783b = t0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f782a) {
            case 0:
                t0 t0Var = this.f783b;
                t0Var.getClass();
                t0Var.f864a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f783b.f864a.invalidate();
                return;
        }
    }
}
