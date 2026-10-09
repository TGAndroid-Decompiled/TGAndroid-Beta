package ci;

import android.animation.ValueAnimator;
public final class mb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5614a;
    public final lc f5615b;

    public mb(lc lcVar, int i10) {
        this.f5614a = i10;
        this.f5615b = lcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5614a) {
            case 0:
                this.f5615b.f5467c1.m();
                return;
            default:
                this.f5615b.m0();
                return;
        }
    }
}
