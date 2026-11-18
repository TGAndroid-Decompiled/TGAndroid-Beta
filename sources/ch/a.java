package ch;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f5279a;
    public final b f5280b;
    public final e0 f5281c;

    public a(b bVar, e0 e0Var, int i7) {
        this.f5279a = i7;
        this.f5280b = bVar;
        this.f5281c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5279a) {
            case 0:
                this.f5280b.f5296f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f5281c.invalidate();
                return;
            default:
                this.f5280b.f5296f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f5281c.invalidate();
                return;
        }
    }
}
