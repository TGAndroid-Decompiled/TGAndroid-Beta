package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5573a;
    public final s8 f5574b;
    public final float f5575c;
    public final float d;

    public k8(s8 s8Var, float f7, float f10, int i10) {
        this.f5573a = i10;
        this.f5574b = s8Var;
        this.f5575c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5573a) {
            case 0:
                s8 s8Var = this.f5574b;
                s8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var.setScrollY((int) AndroidUtilities.lerp(this.f5575c, 0.0f, floatValue));
                r8 r8Var = s8Var.f5980b0;
                r8Var.f5938w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                r8Var.invalidate();
                return;
            default:
                s8 s8Var2 = this.f5574b;
                s8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var2.setScrollY((int) AndroidUtilities.lerp(this.f5575c, Math.min((s8Var2.getMeasuredHeight() - s8Var2.f5998u0) - AndroidUtilities.dp(64.0f), s8Var2.f5995r0.getBottom() - s8Var2.getMeasuredHeight()), floatValue2));
                r8 r8Var2 = s8Var2.f5980b0;
                r8Var2.f5938w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                r8Var2.invalidate();
                return;
        }
    }
}
