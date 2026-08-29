package nh;

import android.animation.ValueAnimator;
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18713a;
    public final v2 f18714b;

    public u2(v2 v2Var, int i10) {
        this.f18713a = i10;
        this.f18714b = v2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18713a) {
            case 0:
                this.f18714b.h.invalidate();
                return;
            default:
                this.f18714b.h.invalidate();
                return;
        }
    }
}
