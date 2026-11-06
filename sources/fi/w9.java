package fi;

import android.animation.ValueAnimator;
public final class w9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f13064a;
    public final va f13065b;

    public w9(va vaVar, int i7) {
        this.f13064a = i7;
        this.f13065b = vaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13064a) {
            case 0:
                this.f13065b.f12944c1.m();
                return;
            default:
                this.f13065b.m0();
                return;
        }
    }
}
