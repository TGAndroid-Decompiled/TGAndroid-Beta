package ei;

import android.animation.ValueAnimator;
public final class wa implements ValueAnimator.AnimatorUpdateListener {
    public final int f10056a;
    public final vb f10057b;

    public wa(vb vbVar, int i10) {
        this.f10056a = i10;
        this.f10057b = vbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10056a) {
            case 0:
                this.f10057b.f9958c1.m();
                return;
            default:
                this.f10057b.m0();
                return;
        }
    }
}
