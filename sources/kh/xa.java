package kh;

import android.animation.ValueAnimator;
public final class xa implements ValueAnimator.AnimatorUpdateListener {
    public final int f16385a;
    public final wb f16386b;

    public xa(wb wbVar, int i9) {
        this.f16385a = i9;
        this.f16386b = wbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16385a) {
            case 0:
                this.f16386b.Y0.m();
                return;
            default:
                this.f16386b.n0();
                return;
        }
    }
}
