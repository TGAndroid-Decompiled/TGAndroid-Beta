package ci;

import android.animation.ValueAnimator;
public final class mb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5184a;
    public final lc f5185b;

    public mb(lc lcVar, int i10) {
        this.f5184a = i10;
        this.f5185b = lcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5184a) {
            case 0:
                this.f5185b.f5035c1.m();
                return;
            default:
                this.f5185b.n0();
                return;
        }
    }
}
