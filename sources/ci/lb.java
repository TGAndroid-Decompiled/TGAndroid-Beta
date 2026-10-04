package ci;

import android.animation.ValueAnimator;
public final class lb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5504a;
    public final kc f5505b;

    public lb(kc kcVar, int i10) {
        this.f5504a = i10;
        this.f5505b = kcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5504a) {
            case 0:
                this.f5505b.f5382c1.m();
                return;
            default:
                this.f5505b.n0();
                return;
        }
    }
}
