package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class pua implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final sua b;

    public pua(sua suaVar, byte b) {
        this.a = b;
        this.b = suaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sua suaVar = this.b;
        switch (b) {
            case 0:
                suaVar.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                suaVar.d(suaVar.b0);
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float x = c00.x((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                suaVar.A0 = x;
                FrameLayout frameLayout = suaVar.b;
                frameLayout.setScaleX(x);
                frameLayout.setScaleY(suaVar.A0);
                suaVar.invalidate();
                return;
            default:
                suaVar.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                suaVar.d(suaVar.b0);
                return;
        }
    }
}
