package ci;

import android.animation.ValueAnimator;
public final class pb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5318a;
    public final oc f5319b;

    public pb(oc ocVar, int i10) {
        this.f5318a = i10;
        this.f5319b = ocVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5318a) {
            case 0:
                this.f5319b.f5213c1.m();
                return;
            default:
                this.f5319b.n0();
                return;
        }
    }
}
