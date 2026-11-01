package lg;

import android.animation.ValueAnimator;
import c3.i0;
import org.telegram.ui.Components.voip.x;
import org.telegram.ui.zd1;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f11901a;
    public final float f11902b;
    public final float f11903c;
    public final float d;
    public final Object e;

    public j(Object obj, float f7, float f10, float f11, int i10) {
        this.f11901a = i10;
        this.e = obj;
        this.f11902b = f7;
        this.f11903c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11901a) {
            case 0:
                q qVar = (q) this.e;
                qVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar = qVar.f11920b;
                hVar.d = this.f11902b * floatValue;
                hVar.e = this.f11903c * floatValue;
                hVar.f11882i = floatValue * this.d;
                return;
            case 1:
                x xVar = (x) this.e;
                xVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar.f31823y0 = i0.z(1.0f, floatValue2, 1.0f, this.f11902b * floatValue2);
                xVar.f31812r0 = this.f11903c * floatValue2;
                xVar.f31814s0 = this.d * floatValue2;
                xVar.invalidate();
                return;
            default:
                zd1 zd1Var = (zd1) this.e;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zd1Var.f43950f1 = i0.z(1.0f, floatValue3, 1.0f, this.f11902b * floatValue3);
                zd1Var.Y0 = this.f11903c * floatValue3;
                zd1Var.Z0 = this.d * floatValue3;
                zd1Var.f43970s.invalidate();
                return;
        }
    }
}
