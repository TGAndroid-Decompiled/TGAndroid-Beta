package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class pa implements ValueAnimator.AnimatorUpdateListener {
    public final int f1403a;
    public final xa f1404b;
    public final float f1405c;
    public final float d;

    public pa(xa xaVar, float f7, float f10, int i10) {
        this.f1403a = i10;
        this.f1404b = xaVar;
        this.f1405c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1403a) {
            case 0:
                xa xaVar = this.f1404b;
                xaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaVar.setScrollY((int) AndroidUtilities.lerp(this.f1405c, 0.0f, floatValue));
                wa waVar = xaVar.f1719b0;
                waVar.f1677w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                waVar.invalidate();
                return;
            default:
                xa xaVar2 = this.f1404b;
                xaVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaVar2.setScrollY((int) AndroidUtilities.lerp(this.f1405c, Math.min((xaVar2.getMeasuredHeight() - xaVar2.f1737u0) - AndroidUtilities.dp(64.0f), xaVar2.f1734r0.getBottom() - xaVar2.getMeasuredHeight()), floatValue2));
                wa waVar2 = xaVar2.f1719b0;
                waVar2.f1677w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                waVar2.invalidate();
                return;
        }
    }
}
