package di;

import android.animation.ValueAnimator;
public final class wa implements ValueAnimator.AnimatorUpdateListener {
    public final int f8352a;
    public final pc f8353b;

    public wa(pc pcVar, int i10) {
        this.f8352a = i10;
        this.f8353b = pcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8352a) {
            case 0:
                this.f8353b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f8353b.f7897r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f8353b.f7897r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f8353b.f7901s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f8353b.f7901s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                pc pcVar = this.f8353b;
                pcVar.getClass();
                pcVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pcVar.o();
                pcVar.f7895r.invalidate();
                pcVar.f7882n.invalidate();
                return;
        }
    }
}
