package ah;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f447a;
    public final c f448b;
    public final x0 f449c;

    public a(c cVar, x0 x0Var, int i10) {
        this.f447a = i10;
        this.f448b = cVar;
        this.f449c = x0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f447a) {
            case 0:
                this.f448b.f480f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f449c.invalidate();
                return;
            default:
                this.f448b.f480f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f449c.invalidate();
                return;
        }
    }
}
