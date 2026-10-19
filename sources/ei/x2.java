package ei;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10065a;
    public final y2 f10066b;

    public x2(y2 y2Var, int i10) {
        this.f10065a = i10;
        this.f10066b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10065a) {
            case 0:
                this.f10066b.f10130s.invalidate();
                return;
            default:
                this.f10066b.f10130s.invalidate();
                return;
        }
    }
}
