package ng;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f15992a;
    public final b f15993b;
    public final f0 f15994c;

    public a(b bVar, f0 f0Var, int i10) {
        this.f15992a = i10;
        this.f15993b = bVar;
        this.f15994c = f0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15992a) {
            case 0:
                this.f15993b.f16002f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f15994c.invalidate();
                return;
            default:
                this.f15993b.f16002f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f15994c.invalidate();
                return;
        }
    }
}
