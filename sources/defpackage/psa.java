package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class psa implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ssa b;

    public psa(ssa ssaVar, byte b) {
        this.a = b;
        this.b = ssaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ssa ssaVar = this.b;
        switch (b) {
            case 0:
                ssaVar.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ssaVar.d(ssaVar.b0);
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float w = b10.w((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                ssaVar.A0 = w;
                FrameLayout frameLayout = ssaVar.b;
                frameLayout.setScaleX(w);
                frameLayout.setScaleY(ssaVar.A0);
                ssaVar.invalidate();
                return;
            default:
                ssaVar.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ssaVar.d(ssaVar.b0);
                return;
        }
    }
}
