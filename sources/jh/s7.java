package jh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class s7 implements ValueAnimator.AnimatorUpdateListener {

    public final int f13978a;

    public final a8 f13979b;

    public final float f13980c;
    public final float d;

    public s7(a8 a8Var, float f10, float f11, int i10) {
        this.f13978a = i10;
        this.f13979b = a8Var;
        this.f13980c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13978a) {
            case 0:
                a8 a8Var = this.f13979b;
                a8Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.setScrollY((int) AndroidUtilities.lerp(this.f13980c, 0.0f, fFloatValue));
                z7 z7Var = a8Var.U;
                z7Var.f14200w = AndroidUtilities.lerp(this.d, 0.0f, fFloatValue);
                z7Var.invalidate();
                break;
            default:
                a8 a8Var2 = this.f13979b;
                a8Var2.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var2.setScrollY((int) AndroidUtilities.lerp(this.f13980c, Math.min((a8Var2.getMeasuredHeight() - a8Var2.f13061q0) - AndroidUtilities.dp(64.0f), a8Var2.f13058n0.getBottom() - a8Var2.getMeasuredHeight()), fFloatValue2));
                z7 z7Var2 = a8Var2.U;
                z7Var2.f14200w = AndroidUtilities.lerp(this.d, 1.0f, fFloatValue2);
                z7Var2.invalidate();
                break;
        }
    }
}
