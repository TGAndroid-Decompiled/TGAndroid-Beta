package hi;

import android.animation.ValueAnimator;
public final class t9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15518a;
    public final sa f15519b;

    public t9(sa saVar, int i7) {
        this.f15518a = i7;
        this.f15519b = saVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15518a) {
            case 0:
                this.f15519b.f15397d1.m();
                return;
            default:
                this.f15519b.m0();
                return;
        }
    }
}
