package ah;

import android.animation.ValueAnimator;
public final class k0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f601a;
    public final u0 f602b;

    public k0(u0 u0Var, int i10) {
        this.f601a = i10;
        this.f602b = u0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f601a) {
            case 0:
                u0 u0Var = this.f602b;
                u0Var.getClass();
                u0Var.f685a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f602b.f685a.invalidate();
                return;
        }
    }
}
