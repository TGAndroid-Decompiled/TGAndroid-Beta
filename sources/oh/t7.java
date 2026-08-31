package oh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class t7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f17793a;
    public final a8 f17794b;
    public final float f17795c;
    public final float d;

    public t7(a8 a8Var, float f10, float f11, int i10) {
        this.f17793a = i10;
        this.f17794b = a8Var;
        this.f17795c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17793a) {
            case 0:
                a8 a8Var = this.f17794b;
                a8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.setScrollY((int) AndroidUtilities.lerp(this.f17795c, 0.0f, floatValue));
                z7 z7Var = a8Var.V;
                z7Var.f18005w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                z7Var.invalidate();
                return;
            default:
                a8 a8Var2 = this.f17794b;
                a8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var2.setScrollY((int) AndroidUtilities.lerp(this.f17795c, Math.min((a8Var2.getMeasuredHeight() - a8Var2.f16862r0) - AndroidUtilities.dp(64.0f), a8Var2.f16859o0.getBottom() - a8Var2.getMeasuredHeight()), floatValue2));
                z7 z7Var2 = a8Var2.V;
                z7Var2.f18005w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                z7Var2.invalidate();
                return;
        }
    }
}
