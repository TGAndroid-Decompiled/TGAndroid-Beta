package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5572a;
    public final s8 f5573b;
    public final float f5574c;
    public final float d;

    public k8(s8 s8Var, float f7, float f10, int i10) {
        this.f5572a = i10;
        this.f5573b = s8Var;
        this.f5574c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5572a) {
            case 0:
                s8 s8Var = this.f5573b;
                s8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var.setScrollY((int) AndroidUtilities.lerp(this.f5574c, 0.0f, floatValue));
                r8 r8Var = s8Var.f5979b0;
                r8Var.f5937w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                r8Var.invalidate();
                return;
            default:
                s8 s8Var2 = this.f5573b;
                s8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var2.setScrollY((int) AndroidUtilities.lerp(this.f5574c, Math.min((s8Var2.getMeasuredHeight() - s8Var2.f5997u0) - AndroidUtilities.dp(64.0f), s8Var2.f5994r0.getBottom() - s8Var2.getMeasuredHeight()), floatValue2));
                r8 r8Var2 = s8Var2.f5979b0;
                r8Var2.f5937w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                r8Var2.invalidate();
                return;
        }
    }
}
