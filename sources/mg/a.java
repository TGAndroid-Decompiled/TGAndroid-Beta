package mg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f13933a;
    public final b f13934b;
    public final f0 f13935c;

    public a(b bVar, f0 f0Var, int i10) {
        this.f13933a = i10;
        this.f13934b = bVar;
        this.f13935c = f0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13933a) {
            case 0:
                this.f13934b.f13942f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f13935c.invalidate();
                return;
            default:
                this.f13934b.f13942f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f13935c.invalidate();
                return;
        }
    }
}
