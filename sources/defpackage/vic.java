package defpackage;

import android.animation.ValueAnimator;
import android.view.WindowManager;
public final class vic implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final yic b;

    public vic(yic yicVar, byte b) {
        this.a = b;
        this.b = yicVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        yic yicVar = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WindowManager.LayoutParams layoutParams = yicVar.d;
                layoutParams.x = (int) floatValue;
                gm.N3(yicVar.c, yicVar.a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WindowManager.LayoutParams layoutParams2 = yicVar.d;
                layoutParams2.y = (int) floatValue2;
                gm.N3(yicVar.c, yicVar.a, layoutParams2);
                return;
        }
    }
}
