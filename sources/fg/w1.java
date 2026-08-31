package fg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6623a;
    public final d2 f6624b;

    public w1(d2 d2Var, int i10) {
        this.f6623a = i10;
        this.f6624b = d2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6623a) {
            case 0:
                d2 d2Var = this.f6624b;
                d2Var.getClass();
                d2Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d2Var.container.invalidate();
                return;
            default:
                d2 d2Var2 = this.f6624b;
                d2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d2Var2.K0.getLayoutParams().height = AndroidUtilities.lerp(d2Var2.L0[0].getHeight(), d2Var2.L0[1].getHeight(), floatValue);
                d2Var2.K0.requestLayout();
                return;
        }
    }
}
