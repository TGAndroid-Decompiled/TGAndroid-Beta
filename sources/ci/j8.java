package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class j8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5478a;
    public final r8 f5479b;
    public final float f5480c;
    public final float d;

    public j8(r8 r8Var, float f7, float f10, int i10) {
        this.f5478a = i10;
        this.f5479b = r8Var;
        this.f5480c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5478a) {
            case 0:
                r8 r8Var = this.f5479b;
                r8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.setScrollY((int) AndroidUtilities.lerp(this.f5480c, 0.0f, floatValue));
                q8 q8Var = r8Var.f5876b0;
                q8Var.f5805w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                q8Var.invalidate();
                return;
            default:
                r8 r8Var2 = this.f5479b;
                r8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var2.setScrollY((int) AndroidUtilities.lerp(this.f5480c, Math.min((r8Var2.getMeasuredHeight() - r8Var2.f5894u0) - AndroidUtilities.dp(64.0f), r8Var2.f5891r0.getBottom() - r8Var2.getMeasuredHeight()), floatValue2));
                q8 q8Var2 = r8Var2.f5876b0;
                q8Var2.f5805w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                q8Var2.invalidate();
                return;
        }
    }
}
