package dh;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f8928a;
    public final b f8929b;
    public final c0 f8930c;

    public a(b bVar, c0 c0Var, int i3) {
        this.f8928a = i3;
        this.f8929b = bVar;
        this.f8930c = c0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8928a) {
            case 0:
                this.f8929b.f8958f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f8930c.invalidate();
                return;
            default:
                this.f8929b.f8958f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f8930c.invalidate();
                return;
        }
    }
}
