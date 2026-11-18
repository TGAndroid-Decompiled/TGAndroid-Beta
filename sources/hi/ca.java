package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.fs;
import org.telegram.ui.lm0;
import org.telegram.ui.qc;
import org.telegram.ui.x71;
public final class ca implements ValueAnimator.AnimatorUpdateListener {
    public final int f14322a;
    public boolean f14323b = false;
    public final fs f14324c;

    public ca(fs fsVar, int i7) {
        this.f14322a = i7;
        this.f14324c = fsVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14322a) {
            case 0:
                ta taVar = (ta) this.f14324c;
                taVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ba baVar = taVar.D2;
                if (baVar != null) {
                    baVar.invalidate();
                }
                if (!this.f14323b && taVar.E2 > 0.5f) {
                    this.f14323b = true;
                    return;
                }
                return;
            case 1:
                qc qcVar = (qc) this.f14324c;
                qcVar.f51220o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qcVar.f51219n0.invalidate();
                if (!this.f14323b && qcVar.f51220o0 > 0.5f) {
                    this.f14323b = true;
                    return;
                }
                return;
            case 2:
                lm0 lm0Var = (lm0) this.f14324c;
                lm0Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lm0Var.Y.invalidate();
                if (!this.f14323b && lm0Var.Z > 0.5f) {
                    this.f14323b = true;
                    return;
                }
                return;
            default:
                x71 x71Var = (x71) this.f14324c;
                x71Var.f53718k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var.f53715j2.invalidate();
                if (!this.f14323b && x71Var.f53718k2 > 0.5f) {
                    this.f14323b = true;
                    return;
                }
                return;
        }
    }
}
