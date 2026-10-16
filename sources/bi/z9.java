package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4076a;
    public final ha f4077b;
    public final float f4078c;
    public final float d;

    public z9(ha haVar, float f7, float f10, int i10) {
        this.f4076a = i10;
        this.f4077b = haVar;
        this.f4078c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4076a) {
            case 0:
                ha haVar = this.f4077b;
                haVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                haVar.setScrollY((int) AndroidUtilities.lerp(this.f4078c, 0.0f, floatValue));
                ga gaVar = haVar.f3136b0;
                gaVar.f3099w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                gaVar.invalidate();
                return;
            default:
                ha haVar2 = this.f4077b;
                haVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                haVar2.setScrollY((int) AndroidUtilities.lerp(this.f4078c, Math.min((haVar2.getMeasuredHeight() - haVar2.f3154u0) - AndroidUtilities.dp(64.0f), haVar2.f3151r0.getBottom() - haVar2.getMeasuredHeight()), floatValue2));
                ga gaVar2 = haVar2.f3136b0;
                gaVar2.f3099w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                gaVar2.invalidate();
                return;
        }
    }
}
