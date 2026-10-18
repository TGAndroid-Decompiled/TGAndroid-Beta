package ei;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10066a;
    public final y2 f10067b;

    public x2(y2 y2Var, int i10) {
        this.f10066a = i10;
        this.f10067b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10066a) {
            case 0:
                this.f10067b.f10131s.invalidate();
                return;
            default:
                this.f10067b.f10131s.invalidate();
                return;
        }
    }
}
