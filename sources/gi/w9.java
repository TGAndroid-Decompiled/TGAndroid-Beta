package gi;

import android.animation.ValueAnimator;
public final class w9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f13807a;
    public final va f13808b;

    public w9(va vaVar, int i3) {
        this.f13807a = i3;
        this.f13808b = vaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13807a) {
            case 0:
                this.f13808b.f13710d1.m();
                return;
            default:
                this.f13808b.m0();
                return;
        }
    }
}
