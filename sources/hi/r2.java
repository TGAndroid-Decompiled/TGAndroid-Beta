package hi;

import android.animation.ValueAnimator;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15295a;
    public final s2 f15296b;

    public r2(s2 s2Var, int i7) {
        this.f15295a = i7;
        this.f15296b = s2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15295a) {
            case 0:
                ((d3) this.f15296b.f15323c).invalidate();
                return;
            default:
                ((d3) this.f15296b.f15323c).invalidate();
                return;
        }
    }
}
