package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5570a;
    public final s8 f5571b;
    public final float f5572c;
    public final float d;

    public k8(s8 s8Var, float f7, float f10, int i10) {
        this.f5570a = i10;
        this.f5571b = s8Var;
        this.f5572c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5570a) {
            case 0:
                s8 s8Var = this.f5571b;
                s8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var.setScrollY((int) AndroidUtilities.lerp(this.f5572c, 0.0f, floatValue));
                r8 r8Var = s8Var.f5977b0;
                r8Var.f5935w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                r8Var.invalidate();
                return;
            default:
                s8 s8Var2 = this.f5571b;
                s8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var2.setScrollY((int) AndroidUtilities.lerp(this.f5572c, Math.min((s8Var2.getMeasuredHeight() - s8Var2.f5995u0) - AndroidUtilities.dp(64.0f), s8Var2.f5992r0.getBottom() - s8Var2.getMeasuredHeight()), floatValue2));
                r8 r8Var2 = s8Var2.f5977b0;
                r8Var2.f5935w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                r8Var2.invalidate();
                return;
        }
    }
}
