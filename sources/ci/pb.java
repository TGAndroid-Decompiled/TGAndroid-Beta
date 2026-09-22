package ci;

import android.animation.ValueAnimator;
public final class pb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5315a;
    public final oc f5316b;

    public pb(oc ocVar, int i10) {
        this.f5315a = i10;
        this.f5316b = ocVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5315a) {
            case 0:
                this.f5316b.f5210c1.m();
                return;
            default:
                this.f5316b.n0();
                return;
        }
    }
}
