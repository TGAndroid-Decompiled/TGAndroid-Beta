package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.fs;
import org.telegram.ui.lm0;
import org.telegram.ui.qc;
import org.telegram.ui.x71;
public final class ca implements ValueAnimator.AnimatorUpdateListener {
    public final int f14319a;
    public boolean f14320b = false;
    public final fs f14321c;

    public ca(fs fsVar, int i7) {
        this.f14319a = i7;
        this.f14321c = fsVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14319a) {
            case 0:
                ta taVar = (ta) this.f14321c;
                taVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ba baVar = taVar.D2;
                if (baVar != null) {
                    baVar.invalidate();
                }
                if (!this.f14320b && taVar.E2 > 0.5f) {
                    this.f14320b = true;
                    return;
                }
                return;
            case 1:
                qc qcVar = (qc) this.f14321c;
                qcVar.f51178o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qcVar.f51177n0.invalidate();
                if (!this.f14320b && qcVar.f51178o0 > 0.5f) {
                    this.f14320b = true;
                    return;
                }
                return;
            case 2:
                lm0 lm0Var = (lm0) this.f14321c;
                lm0Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lm0Var.Y.invalidate();
                if (!this.f14320b && lm0Var.Z > 0.5f) {
                    this.f14320b = true;
                    return;
                }
                return;
            default:
                x71 x71Var = (x71) this.f14321c;
                x71Var.f53706k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var.f53703j2.invalidate();
                if (!this.f14320b && x71Var.f53706k2 > 0.5f) {
                    this.f14320b = true;
                    return;
                }
                return;
        }
    }
}
