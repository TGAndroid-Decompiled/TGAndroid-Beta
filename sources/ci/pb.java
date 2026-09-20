package ci;

import android.animation.ValueAnimator;
public final class pb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5319a;
    public final oc f5320b;

    public pb(oc ocVar, int i10) {
        this.f5319a = i10;
        this.f5320b = ocVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5319a) {
            case 0:
                this.f5320b.f5214c1.m();
                return;
            default:
                this.f5320b.n0();
                return;
        }
    }
}
