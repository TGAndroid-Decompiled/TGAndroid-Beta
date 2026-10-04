package ci;

import android.animation.ValueAnimator;
public final class lb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5505a;
    public final kc f5506b;

    public lb(kc kcVar, int i10) {
        this.f5505a = i10;
        this.f5506b = kcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5505a) {
            case 0:
                this.f5506b.f5383c1.m();
                return;
            default:
                this.f5506b.n0();
                return;
        }
    }
}
