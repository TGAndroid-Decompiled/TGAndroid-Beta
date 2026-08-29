package dg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.voip.l0;
import org.telegram.ui.oh1;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f5574a;
    public final float f5575b;
    public final float f5576c;
    public final float d;
    public final Object f5577e;

    public c(Object obj, float f9, float f10, float f11, int i10) {
        this.f5574a = i10;
        this.f5577e = obj;
        this.f5575b = f9;
        this.f5576c = f10;
        this.d = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5574a) {
            case 0:
                i iVar = (i) this.f5577e;
                iVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a aVar = iVar.f5590b;
                aVar.d = this.f5575b * floatValue;
                aVar.f5552e = this.f5576c * floatValue;
                aVar.f5554g = floatValue * this.d;
                return;
            case 1:
                l0 l0Var = (l0) this.f5577e;
                l0Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f33821u0 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue2, 1.0f, this.f5575b * floatValue2);
                l0Var.f33812n0 = this.f5576c * floatValue2;
                l0Var.f33813o0 = this.d * floatValue2;
                l0Var.invalidate();
                return;
            default:
                oh1 oh1Var = (oh1) this.f5577e;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oh1Var.f41141b1 = com.google.android.recaptcha.internal.a.z(1.0f, floatValue3, 1.0f, this.f5575b * floatValue3);
                oh1Var.U0 = this.f5576c * floatValue3;
                oh1Var.V0 = this.d * floatValue3;
                oh1Var.f41169s.invalidate();
                return;
        }
    }
}
