package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.q;
public final class dx0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final int b;
    public final Object c;

    public dx0(Object obj, int i, byte b) {
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
                ((nx0) obj).x0(i2, intValue, intValue);
                return;
            case 1:
                iu3 iu3Var = (iu3) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iu3Var.d.setTranslationY(floatValue);
                float f = i2;
                float f2 = 1.0f - (floatValue / f);
                iu3Var.S = f2;
                if (i2 > 0 && ((i = iu3Var.M) == 2 || i == 3)) {
                    iu3Var.d.setAlpha(f2);
                }
                iu3Var.c(floatValue - f);
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
                i69 i69Var = (i69) ((r32) obj).d;
                i69Var.b.put(i2, (Float) valueAnimator.getAnimatedValue());
                i69Var.d = true;
                i69Var.a.invalidate();
                return;
            case 4:
                npa npaVar = (npa) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                npaVar.n = floatValue3;
                npaVar.setAlpha((int) ((1.0f - floatValue3) * i2));
                npaVar.p = true;
                npaVar.invalidateSelf();
                return;
            default:
                wb2 wb2Var = (wb2) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (wb2Var.getMessageObject() != null && wb2Var.getMessageObject().e1() == i2) {
                    wb2Var.setSelectedBackgroundProgress(floatValue4);
                    return;
                }
                return;
        }
    }
}
