package lh;

import android.animation.ValueAnimator;

public final class ua implements ValueAnimator.AnimatorUpdateListener {

    public final int f16918a;

    public final sb f16919b;

    public ua(sb sbVar, int i10) {
        this.f16918a = i10;
        this.f16919b = sbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16918a) {
            case 0:
                this.f16919b.Y0.m();
                break;
            default:
                this.f16919b.n0();
                break;
        }
    }
}
