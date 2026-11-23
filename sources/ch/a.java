package ch;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f5308a;
    public final b f5309b;
    public final e0 f5310c;

    public a(b bVar, e0 e0Var, int i7) {
        this.f5308a = i7;
        this.f5309b = bVar;
        this.f5310c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5308a) {
            case 0:
                this.f5309b.f5325f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f5310c.invalidate();
                return;
            default:
                this.f5309b.f5325f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f5310c.invalidate();
                return;
        }
    }
}
