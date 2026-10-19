package ei;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10063a;
    public final y2 f10064b;

    public x2(y2 y2Var, int i10) {
        this.f10063a = i10;
        this.f10064b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10063a) {
            case 0:
                this.f10064b.f10128s.invalidate();
                return;
            default:
                this.f10064b.f10128s.invalidate();
                return;
        }
    }
}
