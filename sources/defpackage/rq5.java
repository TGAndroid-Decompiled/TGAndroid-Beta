package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.q;
public final class rq5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final q b;

    public rq5(q qVar, byte b) {
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
                jp9 jp9Var = qVar.Q;
                if (jp9Var != null) {
                    jp9Var.y(floatValue2);
                    return;
                }
                return;
        }
    }
}
