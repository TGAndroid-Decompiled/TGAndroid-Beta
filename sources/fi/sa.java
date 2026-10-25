package fi;

import android.animation.ValueAnimator;
public final class sa implements ValueAnimator.AnimatorUpdateListener {
    public final int f11603a;
    public final sb f11604b;

    public sa(sb sbVar, int i10) {
        this.f11603a = i10;
        this.f11604b = sbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11603a) {
            case 0:
                this.f11604b.f11614c1.m();
                return;
            default:
                this.f11604b.m0();
                return;
        }
    }
}
