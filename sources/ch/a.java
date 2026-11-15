package ch;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f4990a;
    public final b f4991b;
    public final e0 f4992c;

    public a(b bVar, e0 e0Var, int i7) {
        this.f4990a = i7;
        this.f4991b = bVar;
        this.f4992c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4990a) {
            case 0:
                this.f4991b.f5007f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f4992c.invalidate();
                return;
            default:
                this.f4991b.f5007f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f4992c.invalidate();
                return;
        }
    }
}
