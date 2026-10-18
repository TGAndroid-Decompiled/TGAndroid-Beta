package ei;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10064a;
    public final y2 f10065b;

    public x2(y2 y2Var, int i10) {
        this.f10064a = i10;
        this.f10065b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10064a) {
            case 0:
                this.f10065b.f10129s.invalidate();
                return;
            default:
                this.f10065b.f10129s.invalidate();
                return;
        }
    }
}
