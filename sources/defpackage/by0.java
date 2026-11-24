package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.q;
public final class by0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final int b;
    public final Object c;

    public by0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((my0) obj).w0(i2, intValue, intValue);
                return;
            case 1:
                cv3 cv3Var = (cv3) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cv3Var.d.setTranslationY(floatValue);
                float f = i2;
                float f2 = 1.0f - (floatValue / f);
                cv3Var.S = f2;
                if (i2 > 0 && ((i = cv3Var.M) == 2 || i == 3)) {
                    cv3Var.d.setAlpha(f2);
                }
                cv3Var.c(floatValue - f);
                return;
            case 2:
                q qVar = (q) obj;
                if (i2 == qVar.v0) {
                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue2 >= 0.5f) {
                        floatValue2 -= 1.0f;
                    }
                    qVar.y.setRotationY(floatValue2 * 180.0f);
                    return;
                }
                return;
            case 3:
                w49 w49Var = (w49) ((m42) obj).d;
                w49Var.b.put(i2, (Float) valueAnimator.getAnimatedValue());
                w49Var.d = true;
                w49Var.a.invalidate();
                return;
            case 4:
                rna rnaVar = (rna) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnaVar.n = floatValue3;
                rnaVar.setAlpha((int) ((1.0f - floatValue3) * i2));
                rnaVar.p = true;
                rnaVar.invalidateSelf();
                return;
            default:
                rc2 rc2Var = (rc2) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (rc2Var.getMessageObject() != null && rc2Var.getMessageObject().e1() == i2) {
                    rc2Var.setSelectedBackgroundProgress(floatValue4);
                    return;
                }
                return;
        }
    }
}
