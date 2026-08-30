package nh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class t7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15939a;
    public final a8 f15940b;
    public final float f15941c;
    public final float d;

    public t7(a8 a8Var, float f10, float f11, int i10) {
        this.f15939a = i10;
        this.f15940b = a8Var;
        this.f15941c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15939a) {
            case 0:
                a8 a8Var = this.f15940b;
                a8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.setScrollY((int) AndroidUtilities.lerp(this.f15941c, 0.0f, floatValue));
                z7 z7Var = a8Var.V;
                z7Var.f16130w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                z7Var.invalidate();
                return;
            default:
                a8 a8Var2 = this.f15940b;
                a8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var2.setScrollY((int) AndroidUtilities.lerp(this.f15941c, Math.min((a8Var2.getMeasuredHeight() - a8Var2.f15092r0) - AndroidUtilities.dp(64.0f), a8Var2.f15089o0.getBottom() - a8Var2.getMeasuredHeight()), floatValue2));
                z7 z7Var2 = a8Var2.V;
                z7Var2.f16130w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                z7Var2.invalidate();
                return;
        }
    }
}
