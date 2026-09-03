package gg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.voip.l0;
import org.telegram.ui.ii1;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f7071a;
    public final float f7072b;
    public final float f7073c;
    public final float d;
    public final Object f7074e;

    public c(Object obj, float f10, float f11, float f12, int i10) {
        this.f7071a = i10;
        this.f7074e = obj;
        this.f7072b = f10;
        this.f7073c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7071a) {
            case 0:
                i iVar = (i) this.f7074e;
                iVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a aVar = iVar.f7087b;
                aVar.d = this.f7072b * floatValue;
                aVar.f7049e = this.f7073c * floatValue;
                aVar.f7051g = floatValue * this.d;
                return;
            case 1:
                l0 l0Var = (l0) this.f7074e;
                l0Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f32171v0 = e2.c.w(1.0f, floatValue2, 1.0f, this.f7072b * floatValue2);
                l0Var.f32162o0 = this.f7073c * floatValue2;
                l0Var.f32163p0 = this.d * floatValue2;
                l0Var.invalidate();
                return;
            default:
                ii1 ii1Var = (ii1) this.f7074e;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii1Var.f37678c1 = e2.c.w(1.0f, floatValue3, 1.0f, this.f7072b * floatValue3);
                ii1Var.V0 = this.f7073c * floatValue3;
                ii1Var.W0 = this.d * floatValue3;
                ii1Var.f37704s.invalidate();
                return;
        }
    }
}
