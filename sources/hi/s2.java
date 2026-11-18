package hi;

import android.animation.ValueAnimator;
public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15375a;
    public final t2 f15376b;

    public s2(t2 t2Var, int i7) {
        this.f15375a = i7;
        this.f15376b = t2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15375a) {
            case 0:
                ((e3) this.f15376b.f15409c).invalidate();
                return;
            default:
                ((e3) this.f15376b.f15409c).invalidate();
                return;
        }
    }
}
