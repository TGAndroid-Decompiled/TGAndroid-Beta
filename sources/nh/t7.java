package nh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class t7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15919a;
    public final a8 f15920b;
    public final float f15921c;
    public final float d;

    public t7(a8 a8Var, float f10, float f11, int i10) {
        this.f15919a = i10;
        this.f15920b = a8Var;
        this.f15921c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15919a) {
            case 0:
                a8 a8Var = this.f15920b;
                a8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.setScrollY((int) AndroidUtilities.lerp(this.f15921c, 0.0f, floatValue));
                z7 z7Var = a8Var.V;
                z7Var.f16110w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                z7Var.invalidate();
                return;
            default:
                a8 a8Var2 = this.f15920b;
                a8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var2.setScrollY((int) AndroidUtilities.lerp(this.f15921c, Math.min((a8Var2.getMeasuredHeight() - a8Var2.f15072r0) - AndroidUtilities.dp(64.0f), a8Var2.f15069o0.getBottom() - a8Var2.getMeasuredHeight()), floatValue2));
                z7 z7Var2 = a8Var2.V;
                z7Var2.f16110w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                z7Var2.invalidate();
                return;
        }
    }
}
