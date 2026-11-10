package ch;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f6168a;
    public final b f6169b;
    public final d0 f6170c;

    public a(b bVar, d0 d0Var, int i7) {
        this.f6168a = i7;
        this.f6169b = bVar;
        this.f6170c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6168a) {
            case 0:
                this.f6169b.f6185f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f6170c.invalidate();
                return;
            default:
                this.f6169b.f6185f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f6170c.invalidate();
                return;
        }
    }
}
