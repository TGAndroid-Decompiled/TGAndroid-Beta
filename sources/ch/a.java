package ch;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f6163a;
    public final b f6164b;
    public final d0 f6165c;

    public a(b bVar, d0 d0Var, int i7) {
        this.f6163a = i7;
        this.f6164b = bVar;
        this.f6165c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6163a) {
            case 0:
                this.f6164b.f6180f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f6165c.invalidate();
                return;
            default:
                this.f6164b.f6180f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f6165c.invalidate();
                return;
        }
    }
}
