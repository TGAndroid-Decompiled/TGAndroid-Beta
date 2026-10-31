package lg;

import android.animation.ValueAnimator;
import c3.i0;
import org.telegram.ui.be1;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f11900a;
    public final float f11901b;
    public final float f11902c;
    public final float d;
    public final Object e;

    public j(Object obj, float f7, float f10, float f11, int i10) {
        this.f11900a = i10;
        this.e = obj;
        this.f11901b = f7;
        this.f11902c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11900a) {
            case 0:
                q qVar = (q) this.e;
                qVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar = qVar.f11919b;
                hVar.d = this.f11901b * floatValue;
                hVar.e = this.f11902c * floatValue;
                hVar.f11881i = floatValue * this.d;
                return;
            case 1:
                org.telegram.ui.Components.voip.w wVar = (org.telegram.ui.Components.voip.w) this.e;
                wVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar.f31743y0 = i0.z(1.0f, floatValue2, 1.0f, this.f11901b * floatValue2);
                wVar.f31732r0 = this.f11902c * floatValue2;
                wVar.f31734s0 = this.d * floatValue2;
                wVar.invalidate();
                return;
            default:
                be1 be1Var = (be1) this.e;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                be1Var.f36211f1 = i0.z(1.0f, floatValue3, 1.0f, this.f11901b * floatValue3);
                be1Var.Y0 = this.f11902c * floatValue3;
                be1Var.Z0 = this.d * floatValue3;
                be1Var.f36231s.invalidate();
                return;
        }
    }
}
