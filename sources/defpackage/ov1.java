package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class ov1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final pv1 b;

    public ov1(pv1 pv1Var, byte b) {
        this.a = b;
        this.b = pv1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        pv1 pv1Var = this.b;
        switch (b) {
            case 0:
                pv1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = pv1Var.b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                pv1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = pv1Var.b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                pv1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view3 = pv1Var.b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
