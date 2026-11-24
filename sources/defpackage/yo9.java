package defpackage;

import android.animation.ValueAnimator;
public final class yo9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final pp9 b;

    public yo9(pp9 pp9Var, byte b) {
        this.a = b;
        this.b = pp9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        pp9 pp9Var = this.b;
        switch (b) {
            case 0:
                pp9Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                pp9Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                pp9Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rja rjaVar = pp9Var.F;
                if (rjaVar.getTitleTextView() != null) {
                    rjaVar.getTitleTextView().invalidate();
                    return;
                }
                return;
            default:
                pp9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pp9Var.f.requestLayout();
                return;
        }
    }
}
