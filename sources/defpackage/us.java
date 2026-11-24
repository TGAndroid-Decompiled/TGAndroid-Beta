package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.o;
public final class us implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final o b;

    public us(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                oVar.V(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oVar.a1 = floatValue;
                oVar.r0.setTranslationY(((1.0f - floatValue) * gl.L(51.0f)) + oVar.q0);
                return;
        }
    }
}
