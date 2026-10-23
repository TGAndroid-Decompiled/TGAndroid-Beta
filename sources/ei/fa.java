package ei;

import android.animation.ValueAnimator;
public final class fa implements ValueAnimator.AnimatorUpdateListener {
    public final int f9061a;
    public final vb f9062b;

    public fa(vb vbVar, int i10) {
        this.f9061a = i10;
        this.f9062b = vbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9061a) {
            case 0:
                this.f9062b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f9062b.f10019r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                this.f9062b.f10019r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                this.f9062b.f10023s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.f9062b.f10023s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                vb vbVar = this.f9062b;
                vbVar.getClass();
                vbVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vbVar.n();
                vbVar.f10017r.invalidate();
                vbVar.f10004n.invalidate();
                return;
        }
    }
}
