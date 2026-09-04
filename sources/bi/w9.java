package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3965a;
    public final ea f3966b;
    public final float f3967c;
    public final float d;

    public w9(ea eaVar, float f7, float f10, int i10) {
        this.f3965a = i10;
        this.f3966b = eaVar;
        this.f3967c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3965a) {
            case 0:
                ea eaVar = this.f3966b;
                eaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eaVar.setScrollY((int) AndroidUtilities.lerp(this.f3967c, 0.0f, floatValue));
                da daVar = eaVar.f2922b0;
                daVar.f2884w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                daVar.invalidate();
                return;
            default:
                ea eaVar2 = this.f3966b;
                eaVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eaVar2.setScrollY((int) AndroidUtilities.lerp(this.f3967c, Math.min((eaVar2.getMeasuredHeight() - eaVar2.f2940u0) - AndroidUtilities.dp(64.0f), eaVar2.f2937r0.getBottom() - eaVar2.getMeasuredHeight()), floatValue2));
                da daVar2 = eaVar2.f2922b0;
                daVar2.f2884w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                daVar2.invalidate();
                return;
        }
    }
}
