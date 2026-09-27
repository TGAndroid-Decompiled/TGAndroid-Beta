package ci;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.s91;
public final class ic extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final jc f4798a;

    public ic(jc jcVar) {
        this.f4798a = jcVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        nb nbVar;
        jc jcVar = this.f4798a;
        kc kcVar = jcVar.E0;
        if (!jcVar.A0 || (nbVar = kcVar.B0) == null || kcVar.f5000f0 != 0 || nbVar.f4525s || kcVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = kcVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        kcVar.T1 = scaleFactor;
        kcVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        kcVar.B0.setZoom(kcVar.T1);
        s91 s91Var = kcVar.V0;
        if (s91Var != null) {
            s91Var.b(kcVar.T1, false);
        }
        kcVar.j0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        jc jcVar = this.f4798a;
        kc kcVar = jcVar.E0;
        if (kcVar.B0 != null && kcVar.f5000f0 == 0 && !kcVar.K0) {
            jcVar.A0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        jc jcVar = this.f4798a;
        jcVar.A0 = false;
        jcVar.E0.f(false);
        kc.c(jcVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
