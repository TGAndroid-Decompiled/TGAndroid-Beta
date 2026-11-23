package ki;

import android.animation.ValueAnimator;
public final class r1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18968a;
    public final t2 f18969b;

    public r1(t2 t2Var, int i7) {
        this.f18968a = i7;
        this.f18969b = t2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18968a) {
            case 0:
                t2 t2Var = this.f18969b;
                t2Var.getClass();
                t2Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.l();
                return;
            default:
                this.f18969b.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
