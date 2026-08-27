package bg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.voip.k0;
import org.telegram.ui.lh1;

public final class c implements ValueAnimator.AnimatorUpdateListener {

    public final int f2113a;

    public final float f2114b;

    public final float f2115c;
    public final float d;

    public final Object f2116e;

    public c(Object obj, float f10, float f11, float f12, int i10) {
        this.f2113a = i10;
        this.f2116e = obj;
        this.f2114b = f10;
        this.f2115c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2113a) {
            case 0:
                i iVar = (i) this.f2116e;
                iVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a aVar = iVar.f2129b;
                aVar.d = this.f2114b * fFloatValue;
                aVar.f2091e = this.f2115c * fFloatValue;
                aVar.f2093g = fFloatValue * this.d;
                break;
            case 1:
                k0 k0Var = (k0) this.f2116e;
                k0Var.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f33673u0 = com.google.android.recaptcha.internal.a.z(1.0f, fFloatValue2, 1.0f, this.f2114b * fFloatValue2);
                k0Var.f33664n0 = this.f2115c * fFloatValue2;
                k0Var.f33665o0 = this.d * fFloatValue2;
                k0Var.invalidate();
                break;
            default:
                lh1 lh1Var = (lh1) this.f2116e;
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lh1Var.f40094b1 = com.google.android.recaptcha.internal.a.z(1.0f, fFloatValue3, 1.0f, this.f2114b * fFloatValue3);
                lh1Var.U0 = this.f2115c * fFloatValue3;
                lh1Var.V0 = this.d * fFloatValue3;
                lh1Var.f40122s.invalidate();
                break;
        }
    }
}
