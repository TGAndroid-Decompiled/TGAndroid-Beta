package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4072a;
    public final ha f4073b;
    public final float f4074c;
    public final float d;

    public z9(ha haVar, float f7, float f10, int i10) {
        this.f4072a = i10;
        this.f4073b = haVar;
        this.f4074c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4072a) {
            case 0:
                ha haVar = this.f4073b;
                haVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                haVar.setScrollY((int) AndroidUtilities.lerp(this.f4074c, 0.0f, floatValue));
                ga gaVar = haVar.f3132b0;
                gaVar.f3095w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                gaVar.invalidate();
                return;
            default:
                ha haVar2 = this.f4073b;
                haVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                haVar2.setScrollY((int) AndroidUtilities.lerp(this.f4074c, Math.min((haVar2.getMeasuredHeight() - haVar2.f3150u0) - AndroidUtilities.dp(64.0f), haVar2.f3147r0.getBottom() - haVar2.getMeasuredHeight()), floatValue2));
                ga gaVar2 = haVar2.f3132b0;
                gaVar2.f3095w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                gaVar2.invalidate();
                return;
        }
    }
}
