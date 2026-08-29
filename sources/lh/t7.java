package lh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class t7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f16270a;
    public final a8 f16271b;
    public final float f16272c;
    public final float d;

    public t7(a8 a8Var, float f9, float f10, int i10) {
        this.f16270a = i10;
        this.f16271b = a8Var;
        this.f16272c = f9;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16270a) {
            case 0:
                a8 a8Var = this.f16271b;
                a8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.setScrollY((int) AndroidUtilities.lerp(this.f16272c, 0.0f, floatValue));
                z7 z7Var = a8Var.U;
                z7Var.f16475w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                z7Var.invalidate();
                return;
            default:
                a8 a8Var2 = this.f16271b;
                a8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var2.setScrollY((int) AndroidUtilities.lerp(this.f16272c, Math.min((a8Var2.getMeasuredHeight() - a8Var2.f15355q0) - AndroidUtilities.dp(64.0f), a8Var2.f15352n0.getBottom() - a8Var2.getMeasuredHeight()), floatValue2));
                z7 z7Var2 = a8Var2.U;
                z7Var2.f16475w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                z7Var2.invalidate();
                return;
        }
    }
}
