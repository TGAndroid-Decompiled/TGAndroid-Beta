package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class cu1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final du1 b;

    public cu1(du1 du1Var, byte b) {
        this.a = b;
        this.b = du1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        du1 du1Var = this.b;
        switch (b) {
            case 0:
                du1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = du1Var.b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                du1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = du1Var.b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                du1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view3 = du1Var.b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
