package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3992a;
    public final ea f3993b;
    public final float f3994c;
    public final float d;

    public w9(ea eaVar, float f7, float f10, int i10) {
        this.f3992a = i10;
        this.f3993b = eaVar;
        this.f3994c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3992a) {
            case 0:
                ea eaVar = this.f3993b;
                eaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eaVar.setScrollY((int) AndroidUtilities.lerp(this.f3994c, 0.0f, floatValue));
                da daVar = eaVar.f2949b0;
                daVar.f2911w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                daVar.invalidate();
                return;
            default:
                ea eaVar2 = this.f3993b;
                eaVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eaVar2.setScrollY((int) AndroidUtilities.lerp(this.f3994c, Math.min((eaVar2.getMeasuredHeight() - eaVar2.f2967u0) - AndroidUtilities.dp(64.0f), eaVar2.f2964r0.getBottom() - eaVar2.getMeasuredHeight()), floatValue2));
                da daVar2 = eaVar2.f2949b0;
                daVar2.f2911w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                daVar2.invalidate();
                return;
        }
    }
}
