package hg;

import android.animation.ValueAnimator;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f10774a;
    public final e0 f10775b;

    public x(e0 e0Var, int i9) {
        this.f10774a = i9;
        this.f10775b = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10774a) {
            case 0:
                e0 e0Var = this.f10775b;
                e0Var.getClass();
                e0Var.f10574a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f10775b.f10574a.invalidate();
                return;
        }
    }
}
