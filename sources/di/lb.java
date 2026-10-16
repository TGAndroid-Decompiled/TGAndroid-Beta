package di;

import android.animation.ValueAnimator;
public final class lb implements ValueAnimator.AnimatorUpdateListener {
    public final int f7373a;
    public final kc f7374b;

    public lb(kc kcVar, int i10) {
        this.f7373a = i10;
        this.f7374b = kcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7373a) {
            case 0:
                this.f7374b.f7246c1.m();
                return;
            default:
                this.f7374b.m0();
                return;
        }
    }
}
