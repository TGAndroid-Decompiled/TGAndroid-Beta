package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class h8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8652a;
    public final p8 f8653b;
    public final float f8654c;
    public final float d;

    public h8(p8 p8Var, float f7, float f10, int i10) {
        this.f8652a = i10;
        this.f8653b = p8Var;
        this.f8654c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8652a) {
            case 0:
                p8 p8Var = this.f8653b;
                p8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p8Var.setScrollY((int) AndroidUtilities.lerp(this.f8654c, 0.0f, floatValue));
                o8 o8Var = p8Var.f8911b0;
                o8Var.f8890w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                o8Var.invalidate();
                return;
            default:
                p8 p8Var2 = this.f8653b;
                p8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p8Var2.setScrollY((int) AndroidUtilities.lerp(this.f8654c, Math.min((p8Var2.getMeasuredHeight() - p8Var2.f8929u0) - AndroidUtilities.dp(64.0f), p8Var2.f8926r0.getBottom() - p8Var2.getMeasuredHeight()), floatValue2));
                o8 o8Var2 = p8Var2.f8911b0;
                o8Var2.f8890w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                o8Var2.invalidate();
                return;
        }
    }
}
