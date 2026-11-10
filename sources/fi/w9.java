package fi;

import android.animation.ValueAnimator;
public final class w9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f13066a;
    public final va f13067b;

    public w9(va vaVar, int i7) {
        this.f13066a = i7;
        this.f13067b = vaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13066a) {
            case 0:
                this.f13067b.f12946c1.m();
                return;
            default:
                this.f13067b.m0();
                return;
        }
    }
}
