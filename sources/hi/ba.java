package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.gs;
import org.telegram.ui.lm0;
import org.telegram.ui.qc;
import org.telegram.ui.x71;
public final class ba implements ValueAnimator.AnimatorUpdateListener {
    public final int f14303a;
    public boolean f14304b = false;
    public final gs f14305c;

    public ba(gs gsVar, int i7) {
        this.f14303a = i7;
        this.f14305c = gsVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14303a) {
            case 0:
                sa saVar = (sa) this.f14305c;
                saVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar = saVar.D2;
                if (aaVar != null) {
                    aaVar.invalidate();
                }
                if (!this.f14304b && saVar.E2 > 0.5f) {
                    this.f14304b = true;
                    return;
                }
                return;
            case 1:
                qc qcVar = (qc) this.f14305c;
                qcVar.f51228o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qcVar.f51227n0.invalidate();
                if (!this.f14304b && qcVar.f51228o0 > 0.5f) {
                    this.f14304b = true;
                    return;
                }
                return;
            case 2:
                lm0 lm0Var = (lm0) this.f14305c;
                lm0Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lm0Var.Y.invalidate();
                if (!this.f14304b && lm0Var.Z > 0.5f) {
                    this.f14304b = true;
                    return;
                }
                return;
            default:
                x71 x71Var = (x71) this.f14305c;
                x71Var.f53751k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var.f53748j2.invalidate();
                if (!this.f14304b && x71Var.f53751k2 > 0.5f) {
                    this.f14304b = true;
                    return;
                }
                return;
        }
    }
}
