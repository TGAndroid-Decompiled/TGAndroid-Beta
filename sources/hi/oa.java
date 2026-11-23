package hi;

import android.animation.ValueAnimator;
public final class oa implements ValueAnimator.AnimatorUpdateListener {
    public final int f15170a;
    public final nb f15171b;

    public oa(nb nbVar, int i7) {
        this.f15170a = i7;
        this.f15171b = nbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15170a) {
            case 0:
                this.f15171b.f15067d1.m();
                return;
            default:
                this.f15171b.m0();
                return;
        }
    }
}
