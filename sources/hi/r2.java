package hi;

import android.animation.ValueAnimator;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15327a;
    public final s2 f15328b;

    public r2(s2 s2Var, int i7) {
        this.f15327a = i7;
        this.f15328b = s2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15327a) {
            case 0:
                ((d3) this.f15328b.f15369c).invalidate();
                return;
            default:
                ((d3) this.f15328b.f15369c).invalidate();
                return;
        }
    }
}
