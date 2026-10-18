package ei;

import android.animation.ValueAnimator;
public final class wa implements ValueAnimator.AnimatorUpdateListener {
    public final int f10057a;
    public final vb f10058b;

    public wa(vb vbVar, int i10) {
        this.f10057a = i10;
        this.f10058b = vbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10057a) {
            case 0:
                this.f10058b.f9959c1.m();
                return;
            default:
                this.f10058b.m0();
                return;
        }
    }
}
