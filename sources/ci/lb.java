package ci;

import android.animation.ValueAnimator;
public final class lb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5110a;
    public final kc f5111b;

    public lb(kc kcVar, int i10) {
        this.f5110a = i10;
        this.f5111b = kcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5110a) {
            case 0:
                this.f5111b.f4991c1.m();
                return;
            default:
                this.f5111b.n0();
                return;
        }
    }
}
