package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.q;
public final class tw0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final int b;
    public final Object c;

    public tw0(Object obj, int i, byte b) {
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
                ((fx0) obj).w0(i2, intValue, intValue);
                return;
            case 1:
                rt3 rt3Var = (rt3) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rt3Var.d.setTranslationY(floatValue);
                float f = i2;
                float f2 = 1.0f - (floatValue / f);
                rt3Var.S = f2;
                if (i2 > 0 && ((i = rt3Var.M) == 2 || i == 3)) {
                    rt3Var.d.setAlpha(f2);
                }
                rt3Var.c(floatValue - f);
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
                t29 t29Var = (t29) ((a32) obj).d;
                t29Var.b.put(i2, (Float) valueAnimator.getAnimatedValue());
                t29Var.d = true;
                t29Var.a.invalidate();
                return;
            case 4:
                qla qlaVar = (qla) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qlaVar.n = floatValue3;
                qlaVar.setAlpha((int) ((1.0f - floatValue3) * i2));
                qlaVar.p = true;
                qlaVar.invalidateSelf();
                return;
            default:
                gb2 gb2Var = (gb2) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (gb2Var.getMessageObject() != null && gb2Var.getMessageObject().e1() == i2) {
                    gb2Var.setSelectedBackgroundProgress(floatValue4);
                    return;
                }
                return;
        }
    }
}
