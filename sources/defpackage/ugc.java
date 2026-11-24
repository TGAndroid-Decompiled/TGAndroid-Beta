package defpackage;

import android.animation.ValueAnimator;
import android.view.WindowManager;
public final class ugc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final xgc b;

    public ugc(xgc xgcVar, byte b) {
        this.a = b;
        this.b = xgcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        xgc xgcVar = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WindowManager.LayoutParams layoutParams = xgcVar.d;
                layoutParams.x = (int) floatValue;
                gl.N3(xgcVar.c, xgcVar.a, layoutParams);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WindowManager.LayoutParams layoutParams2 = xgcVar.d;
                layoutParams2.y = (int) floatValue2;
                gl.N3(xgcVar.c, xgcVar.a, layoutParams2);
                return;
        }
    }
}
