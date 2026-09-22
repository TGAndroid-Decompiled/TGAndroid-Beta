package ci;

import android.animation.ValueAnimator;
public final class pb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5317a;
    public final oc f5318b;

    public pb(oc ocVar, int i10) {
        this.f5317a = i10;
        this.f5318b = ocVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5317a) {
            case 0:
                this.f5318b.f5212c1.m();
                return;
            default:
                this.f5318b.n0();
                return;
        }
    }
}
