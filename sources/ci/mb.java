package ci;

import android.animation.ValueAnimator;
public final class mb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5191a;
    public final lc f5192b;

    public mb(lc lcVar, int i10) {
        this.f5191a = i10;
        this.f5192b = lcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5191a) {
            case 0:
                this.f5192b.f5042c1.m();
                return;
            default:
                this.f5192b.n0();
                return;
        }
    }
}
