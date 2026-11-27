package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class pu1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final qu1 b;

    public pu1(qu1 qu1Var, byte b) {
        this.a = b;
        this.b = qu1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        qu1 qu1Var = this.b;
        switch (b) {
            case 0:
                qu1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = qu1Var.b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                qu1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = qu1Var.b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                qu1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view3 = qu1Var.b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
