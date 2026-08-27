package ig;

import android.animation.ValueAnimator;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    public final int f11225a;

    public final b f11226b;

    public final f0 f11227c;

    public a(b bVar, f0 f0Var, int i10) {
        this.f11225a = i10;
        this.f11226b = bVar;
        this.f11227c = f0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11225a) {
            case 0:
                this.f11226b.f11235f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f11227c.invalidate();
                break;
            default:
                this.f11226b.f11235f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f11227c.invalidate();
                break;
        }
    }
}
