package defpackage;

import android.animation.ValueAnimator;
import android.view.WindowManager;
public final class alc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final dlc b;

    public alc(dlc dlcVar, byte b) {
        this.a = b;
        this.b = dlcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dlc dlcVar = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WindowManager.LayoutParams layoutParams = dlcVar.d;
                layoutParams.x = (int) floatValue;
                hl.N3(dlcVar.c, dlcVar.a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WindowManager.LayoutParams layoutParams2 = dlcVar.d;
                layoutParams2.y = (int) floatValue2;
                hl.N3(dlcVar.c, dlcVar.a, layoutParams2);
                return;
        }
    }
}
