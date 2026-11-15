package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.is;
import org.telegram.ui.im0;
import org.telegram.ui.qc;
import org.telegram.ui.t71;
public final class ba implements ValueAnimator.AnimatorUpdateListener {
    public final int f13941a;
    public boolean f13942b = false;
    public final is f13943c;

    public ba(is isVar, int i7) {
        this.f13941a = i7;
        this.f13943c = isVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13941a) {
            case 0:
                sa saVar = (sa) this.f13943c;
                saVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar = saVar.D2;
                if (aaVar != null) {
                    aaVar.invalidate();
                }
                if (!this.f13942b && saVar.E2 > 0.5f) {
                    this.f13942b = true;
                    return;
                }
                return;
            case 1:
                qc qcVar = (qc) this.f13943c;
                qcVar.f50571o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qcVar.f50570n0.invalidate();
                if (!this.f13942b && qcVar.f50571o0 > 0.5f) {
                    this.f13942b = true;
                    return;
                }
                return;
            case 2:
                im0 im0Var = (im0) this.f13943c;
                im0Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                im0Var.Y.invalidate();
                if (!this.f13942b && im0Var.Z > 0.5f) {
                    this.f13942b = true;
                    return;
                }
                return;
            default:
                t71 t71Var = (t71) this.f13943c;
                t71Var.f51444k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t71Var.f51441j2.invalidate();
                if (!this.f13942b && t71Var.f51444k2 > 0.5f) {
                    this.f13942b = true;
                    return;
                }
                return;
        }
    }
}
