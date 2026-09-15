package ci;

import android.animation.ValueAnimator;
public final class pb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5313a;
    public final oc f5314b;

    public pb(oc ocVar, int i10) {
        this.f5313a = i10;
        this.f5314b = ocVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5313a) {
            case 0:
                this.f5314b.f5208c1.m();
                return;
            default:
                this.f5314b.n0();
                return;
        }
    }
}
