package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class pa implements ValueAnimator.AnimatorUpdateListener {
    public final int f1520a;
    public final xa f1521b;
    public final float f1522c;
    public final float d;

    public pa(xa xaVar, float f7, float f10, int i10) {
        this.f1520a = i10;
        this.f1521b = xaVar;
        this.f1522c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1520a) {
            case 0:
                xa xaVar = this.f1521b;
                xaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaVar.setScrollY((int) AndroidUtilities.lerp(this.f1522c, 0.0f, floatValue));
                wa waVar = xaVar.f1865b0;
                waVar.f1819w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                waVar.invalidate();
                return;
            default:
                xa xaVar2 = this.f1521b;
                xaVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaVar2.setScrollY((int) AndroidUtilities.lerp(this.f1522c, Math.min((xaVar2.getMeasuredHeight() - xaVar2.f1883u0) - AndroidUtilities.dp(64.0f), xaVar2.f1880r0.getBottom() - xaVar2.getMeasuredHeight()), floatValue2));
                wa waVar2 = xaVar2.f1865b0;
                waVar2.f1819w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                waVar2.invalidate();
                return;
        }
    }
}
