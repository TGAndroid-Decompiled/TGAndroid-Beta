package nh;

import android.animation.ValueAnimator;
public final class ia implements ValueAnimator.AnimatorUpdateListener {
    public final int f17910a;
    public final gb f17911b;

    public ia(gb gbVar, int i10) {
        this.f17910a = i10;
        this.f17911b = gbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17910a) {
            case 0:
                this.f17911b.Y0.m();
                return;
            default:
                this.f17911b.n0();
                return;
        }
    }
}
