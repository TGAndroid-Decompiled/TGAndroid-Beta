package ci;

import android.animation.ValueAnimator;
public final class mb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5613a;
    public final lc f5614b;

    public mb(lc lcVar, int i10) {
        this.f5613a = i10;
        this.f5614b = lcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5613a) {
            case 0:
                this.f5614b.f5466c1.m();
                return;
            default:
                this.f5614b.m0();
                return;
        }
    }
}
