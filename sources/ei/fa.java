package ei;

import android.animation.ValueAnimator;
public final class fa implements ValueAnimator.AnimatorUpdateListener {
    public final int f9051a;
    public final vb f9052b;

    public fa(vb vbVar, int i10) {
        this.f9051a = i10;
        this.f9052b = vbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9051a) {
            case 0:
                this.f9052b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f9052b.f10003r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f9052b.f10003r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f9052b.f10007s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f9052b.f10007s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                vb vbVar = this.f9052b;
                vbVar.getClass();
                vbVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vbVar.n();
                vbVar.f10001r.invalidate();
                vbVar.f9988n.invalidate();
                return;
        }
    }
}
