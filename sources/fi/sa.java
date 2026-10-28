package fi;

import android.animation.ValueAnimator;
public final class sa implements ValueAnimator.AnimatorUpdateListener {
    public final int f11602a;
    public final sb f11603b;

    public sa(sb sbVar, int i10) {
        this.f11602a = i10;
        this.f11603b = sbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11602a) {
            case 0:
                this.f11603b.f11613c1.m();
                return;
            default:
                this.f11603b.m0();
                return;
        }
    }
}
