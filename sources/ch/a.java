package ch;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f5271a;
    public final b f5272b;
    public final e0 f5273c;

    public a(b bVar, e0 e0Var, int i7) {
        this.f5271a = i7;
        this.f5272b = bVar;
        this.f5273c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5271a) {
            case 0:
                this.f5272b.f5288f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f5273c.invalidate();
                return;
            default:
                this.f5272b.f5288f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f5273c.invalidate();
                return;
        }
    }
}
