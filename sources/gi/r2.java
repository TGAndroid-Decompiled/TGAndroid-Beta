package gi;

import android.animation.ValueAnimator;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f13491a;
    public final s2 f13492b;

    public r2(s2 s2Var, int i3) {
        this.f13491a = i3;
        this.f13492b = s2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13491a) {
            case 0:
                ((d3) this.f13492b.f13553c).invalidate();
                return;
            default:
                ((d3) this.f13492b.f13553c).invalidate();
                return;
        }
    }
}
