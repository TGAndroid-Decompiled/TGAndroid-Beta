package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class j8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5477a;
    public final r8 f5478b;
    public final float f5479c;
    public final float d;

    public j8(r8 r8Var, float f7, float f10, int i10) {
        this.f5477a = i10;
        this.f5478b = r8Var;
        this.f5479c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5477a) {
            case 0:
                r8 r8Var = this.f5478b;
                r8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.setScrollY((int) AndroidUtilities.lerp(this.f5479c, 0.0f, floatValue));
                q8 q8Var = r8Var.f5872b0;
                q8Var.f5801w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                q8Var.invalidate();
                return;
            default:
                r8 r8Var2 = this.f5478b;
                r8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var2.setScrollY((int) AndroidUtilities.lerp(this.f5479c, Math.min((r8Var2.getMeasuredHeight() - r8Var2.f5890u0) - AndroidUtilities.dp(64.0f), r8Var2.f5887r0.getBottom() - r8Var2.getMeasuredHeight()), floatValue2));
                q8 q8Var2 = r8Var2.f5872b0;
                q8Var2.f5801w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                q8Var2.invalidate();
                return;
        }
    }
}
