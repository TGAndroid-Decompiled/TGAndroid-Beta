package hi;

import android.animation.ValueAnimator;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14970a;
    public final s2 f14971b;

    public r2(s2 s2Var, int i7) {
        this.f14970a = i7;
        this.f14971b = s2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14970a) {
            case 0:
                ((d3) this.f14971b.f15018c).invalidate();
                return;
            default:
                ((d3) this.f14971b.f15018c).invalidate();
                return;
        }
    }
}
