package ei;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10080a;
    public final y2 f10081b;

    public x2(y2 y2Var, int i10) {
        this.f10080a = i10;
        this.f10081b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10080a) {
            case 0:
                this.f10081b.f10145s.invalidate();
                return;
            default:
                this.f10081b.f10145s.invalidate();
                return;
        }
    }
}
