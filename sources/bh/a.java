package bh;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f3983a;
    public final c f3984b;
    public final l0 f3985c;

    public a(c cVar, l0 l0Var, int i10) {
        this.f3983a = i10;
        this.f3984b = cVar;
        this.f3985c = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3983a) {
            case 0:
                this.f3984b.f3998f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f3985c.invalidate();
                return;
            default:
                this.f3984b.f3998f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f3985c.invalidate();
                return;
        }
    }
}
