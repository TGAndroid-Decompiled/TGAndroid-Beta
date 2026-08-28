package ag;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.voip.k0;
import org.telegram.ui.mh1;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f187a;
    public final float f188b;
    public final float f189c;
    public final float d;
    public final Object f190e;

    public c(Object obj, float f10, float f11, float f12, int i9) {
        this.f187a = i9;
        this.f190e = obj;
        this.f188b = f10;
        this.f189c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f187a) {
            case 0:
                j jVar = (j) this.f190e;
                jVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a aVar = jVar.f205b;
                aVar.d = this.f188b * floatValue;
                aVar.f165e = this.f189c * floatValue;
                aVar.f167g = floatValue * this.d;
                return;
            case 1:
                k0 k0Var = (k0) this.f190e;
                k0Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f33623u0 = e2.c.z(1.0f, floatValue2, 1.0f, this.f188b * floatValue2);
                k0Var.f33614n0 = this.f189c * floatValue2;
                k0Var.f33615o0 = this.d * floatValue2;
                k0Var.invalidate();
                return;
            default:
                mh1 mh1Var = (mh1) this.f190e;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh1Var.f40433b1 = e2.c.z(1.0f, floatValue3, 1.0f, this.f188b * floatValue3);
                mh1Var.U0 = this.f189c * floatValue3;
                mh1Var.V0 = this.d * floatValue3;
                mh1Var.f40461s.invalidate();
                return;
        }
    }
}
