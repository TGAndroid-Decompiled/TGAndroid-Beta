package ih;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12308a;
    public final e8 f12309b;
    public final float f12310c;
    public final float d;

    public w7(e8 e8Var, float f10, float f11, int i9) {
        this.f12308a = i9;
        this.f12309b = e8Var;
        this.f12310c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12308a) {
            case 0:
                e8 e8Var = this.f12309b;
                e8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8Var.setScrollY((int) AndroidUtilities.lerp(this.f12310c, 0.0f, floatValue));
                d8 d8Var = e8Var.U;
                d8Var.f11338w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                d8Var.invalidate();
                return;
            default:
                e8 e8Var2 = this.f12309b;
                e8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8Var2.setScrollY((int) AndroidUtilities.lerp(this.f12310c, Math.min((e8Var2.getMeasuredHeight() - e8Var2.f11390q0) - AndroidUtilities.dp(64.0f), e8Var2.f11387n0.getBottom() - e8Var2.getMeasuredHeight()), floatValue2));
                d8 d8Var2 = e8Var2.U;
                d8Var2.f11338w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                d8Var2.invalidate();
                return;
        }
    }
}
