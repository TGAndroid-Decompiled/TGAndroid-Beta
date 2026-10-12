package di;

import android.animation.ValueAnimator;
public final class lb implements ValueAnimator.AnimatorUpdateListener {
    public final int f7370a;
    public final kc f7371b;

    public lb(kc kcVar, int i10) {
        this.f7370a = i10;
        this.f7371b = kcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7370a) {
            case 0:
                this.f7371b.f7243c1.m();
                return;
            default:
                this.f7371b.m0();
                return;
        }
    }
}
