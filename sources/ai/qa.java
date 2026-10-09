package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qa implements ValueAnimator.AnimatorUpdateListener {
    public final int f1629a;
    public final ya f1630b;
    public final float f1631c;
    public final float d;

    public qa(ya yaVar, float f7, float f10, int i10) {
        this.f1629a = i10;
        this.f1630b = yaVar;
        this.f1631c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1629a) {
            case 0:
                ya yaVar = this.f1630b;
                yaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yaVar.setScrollY((int) AndroidUtilities.lerp(this.f1631c, 0.0f, floatValue));
                xa xaVar = yaVar.f1969b0;
                xaVar.f1925w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                xaVar.invalidate();
                return;
            default:
                ya yaVar2 = this.f1630b;
                yaVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yaVar2.setScrollY((int) AndroidUtilities.lerp(this.f1631c, Math.min((yaVar2.getMeasuredHeight() - yaVar2.f1987u0) - AndroidUtilities.dp(64.0f), yaVar2.f1984r0.getBottom() - yaVar2.getMeasuredHeight()), floatValue2));
                xa xaVar2 = yaVar2.f1969b0;
                xaVar2.f1925w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                xaVar2.invalidate();
                return;
        }
    }
}
