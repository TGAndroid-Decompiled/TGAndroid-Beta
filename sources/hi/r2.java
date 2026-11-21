package hi;

import android.animation.ValueAnimator;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15324a;
    public final s2 f15325b;

    public r2(s2 s2Var, int i7) {
        this.f15324a = i7;
        this.f15325b = s2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15324a) {
            case 0:
                ((d3) this.f15325b.f15366c).invalidate();
                return;
            default:
                ((d3) this.f15325b.f15366c).invalidate();
                return;
        }
    }
}
