package lh;

import android.animation.ValueAnimator;

public final class w2 implements ValueAnimator.AnimatorUpdateListener {

    public final int f16970a;

    public final x2 f16971b;

    public w2(x2 x2Var, int i10) {
        this.f16970a = i10;
        this.f16971b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16970a) {
            case 0:
                this.f16971b.h.invalidate();
                break;
            default:
                this.f16971b.h.invalidate();
                break;
        }
    }
}
