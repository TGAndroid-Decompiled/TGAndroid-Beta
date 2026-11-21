package ch;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f5305a;
    public final b f5306b;
    public final e0 f5307c;

    public a(b bVar, e0 e0Var, int i7) {
        this.f5305a = i7;
        this.f5306b = bVar;
        this.f5307c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5305a) {
            case 0:
                this.f5306b.f5322f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f5307c.invalidate();
                return;
            default:
                this.f5306b.f5322f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f5307c.invalidate();
                return;
        }
    }
}
