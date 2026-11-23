package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.gs;
import org.telegram.ui.lm0;
import org.telegram.ui.qc;
import org.telegram.ui.x71;
public final class ca implements ValueAnimator.AnimatorUpdateListener {
    public final int f14283a;
    public boolean f14284b = false;
    public final gs f14285c;

    public ca(gs gsVar, int i7) {
        this.f14283a = i7;
        this.f14285c = gsVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14283a) {
            case 0:
                ta taVar = (ta) this.f14285c;
                taVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ba baVar = taVar.D2;
                if (baVar != null) {
                    baVar.invalidate();
                }
                if (!this.f14284b && taVar.E2 > 0.5f) {
                    this.f14284b = true;
                    return;
                }
                return;
            case 1:
                qc qcVar = (qc) this.f14285c;
                qcVar.f51159o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qcVar.f51158n0.invalidate();
                if (!this.f14284b && qcVar.f51159o0 > 0.5f) {
                    this.f14284b = true;
                    return;
                }
                return;
            case 2:
                lm0 lm0Var = (lm0) this.f14285c;
                lm0Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lm0Var.Y.invalidate();
                if (!this.f14284b && lm0Var.Z > 0.5f) {
                    this.f14284b = true;
                    return;
                }
                return;
            default:
                x71 x71Var = (x71) this.f14285c;
                x71Var.f53673k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var.f53670j2.invalidate();
                if (!this.f14284b && x71Var.f53673k2 > 0.5f) {
                    this.f14284b = true;
                    return;
                }
                return;
        }
    }
}
