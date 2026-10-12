package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qa implements ValueAnimator.AnimatorUpdateListener {
    public final int f1627a;
    public final ya f1628b;
    public final float f1629c;
    public final float d;

    public qa(ya yaVar, float f7, float f10, int i10) {
        this.f1627a = i10;
        this.f1628b = yaVar;
        this.f1629c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1627a) {
            case 0:
                ya yaVar = this.f1628b;
                yaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yaVar.setScrollY((int) AndroidUtilities.lerp(this.f1629c, 0.0f, floatValue));
                xa xaVar = yaVar.f1967b0;
                xaVar.f1923w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                xaVar.invalidate();
                return;
            default:
                ya yaVar2 = this.f1628b;
                yaVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yaVar2.setScrollY((int) AndroidUtilities.lerp(this.f1629c, Math.min((yaVar2.getMeasuredHeight() - yaVar2.f1985u0) - AndroidUtilities.dp(64.0f), yaVar2.f1982r0.getBottom() - yaVar2.getMeasuredHeight()), floatValue2));
                xa xaVar2 = yaVar2.f1967b0;
                xaVar2.f1923w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                xaVar2.invalidate();
                return;
        }
    }
}
