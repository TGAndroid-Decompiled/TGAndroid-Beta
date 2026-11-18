package hi;

import android.animation.ValueAnimator;
public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15372a;
    public final t2 f15373b;

    public s2(t2 t2Var, int i7) {
        this.f15372a = i7;
        this.f15373b = t2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15372a) {
            case 0:
                ((e3) this.f15373b.f15406c).invalidate();
                return;
            default:
                ((e3) this.f15373b.f15406c).invalidate();
                return;
        }
    }
}
