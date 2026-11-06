package ch;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f6165a;
    public final b f6166b;
    public final d0 f6167c;

    public a(b bVar, d0 d0Var, int i7) {
        this.f6165a = i7;
        this.f6166b = bVar;
        this.f6167c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6165a) {
            case 0:
                this.f6166b.f6182f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f6167c.invalidate();
                return;
            default:
                this.f6166b.f6182f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f6167c.invalidate();
                return;
        }
    }
}
