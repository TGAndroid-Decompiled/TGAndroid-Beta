package ei;

import android.animation.ValueAnimator;
public final class fa implements ValueAnimator.AnimatorUpdateListener {
    public final int f9050a;
    public final vb f9051b;

    public fa(vb vbVar, int i10) {
        this.f9050a = i10;
        this.f9051b = vbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9050a) {
            case 0:
                this.f9051b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f9051b.f10002r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f9051b.f10002r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f9051b.f10006s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f9051b.f10006s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                vb vbVar = this.f9051b;
                vbVar.getClass();
                vbVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vbVar.n();
                vbVar.f10000r.invalidate();
                vbVar.f9987n.invalidate();
                return;
        }
    }
}
