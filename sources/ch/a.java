package ch;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f4993a;
    public final b f4994b;
    public final e0 f4995c;

    public a(b bVar, e0 e0Var, int i7) {
        this.f4993a = i7;
        this.f4994b = bVar;
        this.f4995c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4993a) {
            case 0:
                this.f4994b.f5010f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f4995c.invalidate();
                return;
            default:
                this.f4994b.f5010f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f4995c.invalidate();
                return;
        }
    }
}
