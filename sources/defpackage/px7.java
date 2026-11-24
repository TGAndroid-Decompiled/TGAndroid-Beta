package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;
public final class px7 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final by7 b;

    public px7(by7 by7Var, byte b) {
        this.a = b;
        this.b = by7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        by7 by7Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a6 a6Var = by7Var.e;
                a6Var.setScaleX(gm.R1(0.8f, 1.0f, floatValue));
                a6Var.setScaleY(gm.R1(0.8f, 1.0f, floatValue));
                a6Var.setAlpha(gm.R1(0.0f, 1.0f, floatValue));
                TextView textView = by7Var.x;
                textView.setScaleX(gm.R1(1.0f, 0.9f, floatValue));
                textView.setScaleY(gm.R1(1.0f, 0.9f, floatValue));
                textView.setAlpha(gm.R1(1.0f, 0.0f, floatValue));
                by7Var.s.setAlpha(gm.R1(0.0f, 1.0f, floatValue));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                by7Var.b0 = floatValue2;
                by7Var.h(floatValue2);
                by7Var.setAlpha(by7Var.b0);
                return;
        }
    }
}
