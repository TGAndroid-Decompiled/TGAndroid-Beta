package ei;

import android.animation.ValueAnimator;
public final class wa implements ValueAnimator.AnimatorUpdateListener {
    public final int f10055a;
    public final vb f10056b;

    public wa(vb vbVar, int i10) {
        this.f10055a = i10;
        this.f10056b = vbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10055a) {
            case 0:
                this.f10056b.f9957c1.m();
                return;
            default:
                this.f10056b.m0();
                return;
        }
    }
}
