package defpackage;

import android.animation.ValueAnimator;
public final class gkc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final hkc b;

    public gkc(hkc hkcVar, byte b) {
        this.a = b;
        this.b = hkcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hkc hkcVar = this.b;
        switch (b) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                hkcVar.d = intValue;
                hkcVar.e = intValue;
                hkcVar.f = intValue;
                hkcVar.h = intValue;
                hkcVar.n = intValue;
                hkcVar.invalidate();
                return;
            default:
                hkcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hkcVar.d = gm.U1(floatValue, hkcVar.G, gm.L(56.0f));
                hkcVar.e = gm.U1(floatValue, hkcVar.G, gm.L(36.0f));
                hkcVar.f = gm.U1(floatValue, hkcVar.G, gm.L(60.0f));
                hkcVar.h = gm.U1(floatValue, hkcVar.G, gm.L(36.0f));
                hkcVar.n = gm.U1(floatValue, hkcVar.G, gm.L(64.0f));
                hkcVar.r = gm.U1(floatValue, 0, gm.L(50.0f));
                hkcVar.s = gm.U1(floatValue, 0, gm.L(20.0f));
                hkcVar.w = gm.U1(floatValue, 0, 0);
                hkcVar.x = gm.U1(floatValue, 0, gm.L(-20.0f));
                hkcVar.y = gm.U1(floatValue, 0, gm.L(-40.0f));
                hkcVar.invalidate();
                return;
        }
    }
}
