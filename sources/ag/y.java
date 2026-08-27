package ag;

import android.animation.ValueAnimator;

public final class y implements ValueAnimator.AnimatorUpdateListener {

    public final int f701a;

    public final b0 f702b;

    public final a0 f703c;

    public y(b0 b0Var, a0 a0Var, int i10) {
        this.f701a = i10;
        this.f702b = b0Var;
        this.f703c = a0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f701a) {
            case 0:
                b0 b0Var = this.f702b;
                b0Var.getClass();
                this.f703c.f282c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.invalidate();
                break;
            default:
                b0 b0Var2 = this.f702b;
                b0Var2.getClass();
                this.f703c.f282c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var2.invalidate();
                break;
        }
    }
}
