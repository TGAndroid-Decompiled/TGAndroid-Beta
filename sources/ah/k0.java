package ah;

import android.animation.ValueAnimator;
public final class k0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f613a;
    public final u0 f614b;

    public k0(u0 u0Var, int i10) {
        this.f613a = i10;
        this.f614b = u0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f613a) {
            case 0:
                u0 u0Var = this.f614b;
                u0Var.getClass();
                u0Var.f697a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f614b.f697a.invalidate();
                return;
        }
    }
}
