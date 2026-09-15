package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class pa implements ValueAnimator.AnimatorUpdateListener {
    public final int f1397a;
    public final xa f1398b;
    public final float f1399c;
    public final float d;

    public pa(xa xaVar, float f7, float f10, int i10) {
        this.f1397a = i10;
        this.f1398b = xaVar;
        this.f1399c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1397a) {
            case 0:
                xa xaVar = this.f1398b;
                xaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaVar.setScrollY((int) AndroidUtilities.lerp(this.f1399c, 0.0f, floatValue));
                wa waVar = xaVar.f1712b0;
                waVar.f1670w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                waVar.invalidate();
                return;
            default:
                xa xaVar2 = this.f1398b;
                xaVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaVar2.setScrollY((int) AndroidUtilities.lerp(this.f1399c, Math.min((xaVar2.getMeasuredHeight() - xaVar2.f1730u0) - AndroidUtilities.dp(64.0f), xaVar2.f1727r0.getBottom() - xaVar2.getMeasuredHeight()), floatValue2));
                wa waVar2 = xaVar2.f1712b0;
                waVar2.f1670w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                waVar2.invalidate();
                return;
        }
    }
}
