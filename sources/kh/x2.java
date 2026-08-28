package kh;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f16338a;
    public final y2 f16339b;

    public x2(y2 y2Var, int i9) {
        this.f16338a = i9;
        this.f16339b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16338a) {
            case 0:
                this.f16339b.h.invalidate();
                return;
            default:
                this.f16339b.h.invalidate();
                return;
        }
    }
}
