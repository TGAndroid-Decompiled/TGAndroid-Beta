package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.fs;
import org.telegram.ui.jm0;
import org.telegram.ui.qc;
import org.telegram.ui.v71;
public final class wa implements ValueAnimator.AnimatorUpdateListener {
    public final int f15687a;
    public boolean f15688b = false;
    public final fs f15689c;

    public wa(fs fsVar, int i7) {
        this.f15687a = i7;
        this.f15689c = fsVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15687a) {
            case 0:
                nb nbVar = (nb) this.f15689c;
                nbVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                va vaVar = nbVar.D2;
                if (vaVar != null) {
                    vaVar.invalidate();
                }
                if (!this.f15688b && nbVar.E2 > 0.5f) {
                    this.f15688b = true;
                    return;
                }
                return;
            case 1:
                qc qcVar = (qc) this.f15689c;
                qcVar.f51420o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qcVar.f51419n0.invalidate();
                if (!this.f15688b && qcVar.f51420o0 > 0.5f) {
                    this.f15688b = true;
                    return;
                }
                return;
            case 2:
                jm0 jm0Var = (jm0) this.f15689c;
                jm0Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jm0Var.Y.invalidate();
                if (!this.f15688b && jm0Var.Z > 0.5f) {
                    this.f15688b = true;
                    return;
                }
                return;
            default:
                v71 v71Var = (v71) this.f15689c;
                v71Var.f52881k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var.f52878j2.invalidate();
                if (!this.f15688b && v71Var.f52881k2 > 0.5f) {
                    this.f15688b = true;
                    return;
                }
                return;
        }
    }
}
