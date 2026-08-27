package ag;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class q2 implements ValueAnimator.AnimatorUpdateListener {

    public final int f625a;

    public final y2 f626b;

    public q2(y2 y2Var, int i10) {
        this.f625a = i10;
        this.f626b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f625a) {
            case 0:
                y2 y2Var = this.f626b;
                y2Var.getClass();
                y2Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var.container.invalidate();
                break;
            default:
                y2 y2Var2 = this.f626b;
                y2Var2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var2.J0.getLayoutParams().height = AndroidUtilities.lerp(y2Var2.K0[0].getHeight(), y2Var2.K0[1].getHeight(), fFloatValue);
                y2Var2.J0.requestLayout();
                break;
        }
    }
}
