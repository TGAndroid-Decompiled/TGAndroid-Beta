package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.fs;
import org.telegram.ui.lm0;
import org.telegram.ui.qc;
import org.telegram.ui.x71;
public final class ba implements ValueAnimator.AnimatorUpdateListener {
    public final int f14300a;
    public boolean f14301b = false;
    public final fs f14302c;

    public ba(fs fsVar, int i7) {
        this.f14300a = i7;
        this.f14302c = fsVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14300a) {
            case 0:
                sa saVar = (sa) this.f14302c;
                saVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar = saVar.D2;
                if (aaVar != null) {
                    aaVar.invalidate();
                }
                if (!this.f14301b && saVar.E2 > 0.5f) {
                    this.f14301b = true;
                    return;
                }
                return;
            case 1:
                qc qcVar = (qc) this.f14302c;
                qcVar.f51224o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qcVar.f51223n0.invalidate();
                if (!this.f14301b && qcVar.f51224o0 > 0.5f) {
                    this.f14301b = true;
                    return;
                }
                return;
            case 2:
                lm0 lm0Var = (lm0) this.f14302c;
                lm0Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lm0Var.Y.invalidate();
                if (!this.f14301b && lm0Var.Z > 0.5f) {
                    this.f14301b = true;
                    return;
                }
                return;
            default:
                x71 x71Var = (x71) this.f14302c;
                x71Var.f53747k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var.f53744j2.invalidate();
                if (!this.f14301b && x71Var.f53747k2 > 0.5f) {
                    this.f14301b = true;
                    return;
                }
                return;
        }
    }
}
