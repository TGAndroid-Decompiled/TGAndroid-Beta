package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class pa implements ValueAnimator.AnimatorUpdateListener {
    public final int f1399a;
    public final xa f1400b;
    public final float f1401c;
    public final float d;

    public pa(xa xaVar, float f7, float f10, int i10) {
        this.f1399a = i10;
        this.f1400b = xaVar;
        this.f1401c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1399a) {
            case 0:
                xa xaVar = this.f1400b;
                xaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaVar.setScrollY((int) AndroidUtilities.lerp(this.f1401c, 0.0f, floatValue));
                wa waVar = xaVar.f1714b0;
                waVar.f1672w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                waVar.invalidate();
                return;
            default:
                xa xaVar2 = this.f1400b;
                xaVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaVar2.setScrollY((int) AndroidUtilities.lerp(this.f1401c, Math.min((xaVar2.getMeasuredHeight() - xaVar2.f1732u0) - AndroidUtilities.dp(64.0f), xaVar2.f1729r0.getBottom() - xaVar2.getMeasuredHeight()), floatValue2));
                wa waVar2 = xaVar2.f1714b0;
                waVar2.f1672w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                waVar2.invalidate();
                return;
        }
    }
}
