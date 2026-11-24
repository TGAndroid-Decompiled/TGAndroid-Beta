package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.q;
public final class oq5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final q b;

    public oq5(q qVar, byte b) {
        this.a = b;
        this.b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        q qVar = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * qVar.getMeasuredHeight() * 0.5f;
                qVar.z0 = floatValue;
                qVar.w.setTranslationY(floatValue + qVar.y0);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar.B0 = floatValue2;
                un9 un9Var = qVar.Q;
                if (un9Var != null) {
                    un9Var.y(floatValue2);
                    return;
                }
                return;
        }
    }
}
