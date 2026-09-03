package fg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.voip.k0;
import org.telegram.ui.ii1;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f6141a;
    public final float f6142b;
    public final float f6143c;
    public final float d;
    public final Object e;

    public c(Object obj, float f10, float f11, float f12, int i10) {
        this.f6141a = i10;
        this.e = obj;
        this.f6142b = f10;
        this.f6143c = f11;
        this.d = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6141a) {
            case 0:
                i iVar = (i) this.e;
                iVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a aVar = iVar.f6156b;
                aVar.d = this.f6142b * floatValue;
                aVar.e = this.f6143c * floatValue;
                aVar.f6121g = floatValue * this.d;
                return;
            case 1:
                k0 k0Var = (k0) this.e;
                k0Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f29710v0 = e2.c.w(1.0f, floatValue2, 1.0f, this.f6142b * floatValue2);
                k0Var.f29701o0 = this.f6143c * floatValue2;
                k0Var.f29702p0 = this.d * floatValue2;
                k0Var.invalidate();
                return;
            default:
                ii1 ii1Var = (ii1) this.e;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii1Var.f34952c1 = e2.c.w(1.0f, floatValue3, 1.0f, this.f6142b * floatValue3);
                ii1Var.V0 = this.f6143c * floatValue3;
                ii1Var.W0 = this.d * floatValue3;
                ii1Var.f34977s.invalidate();
                return;
        }
    }
}
