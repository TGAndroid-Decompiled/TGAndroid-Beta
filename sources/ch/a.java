package ch;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f5276a;
    public final b f5277b;
    public final e0 f5278c;

    public a(b bVar, e0 e0Var, int i7) {
        this.f5276a = i7;
        this.f5277b = bVar;
        this.f5278c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5276a) {
            case 0:
                this.f5277b.f5293f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f5278c.invalidate();
                return;
            default:
                this.f5277b.f5293f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f5278c.invalidate();
                return;
        }
    }
}
