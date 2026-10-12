package di;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ea1;
public final class ic extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final jc f7088a;

    public ic(jc jcVar) {
        this.f7088a = jcVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        nb nbVar;
        jc jcVar = this.f7088a;
        kc kcVar = jcVar.E0;
        if (!jcVar.A0 || (nbVar = kcVar.B0) == null || kcVar.f7252f0 != 0 || nbVar.f6689s || kcVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = kcVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        kcVar.T1 = scaleFactor;
        kcVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        kcVar.B0.setZoom(kcVar.T1);
        ea1 ea1Var = kcVar.V0;
        if (ea1Var != null) {
            ea1Var.b(kcVar.T1, false);
        }
        kcVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        jc jcVar = this.f7088a;
        kc kcVar = jcVar.E0;
        if (kcVar.B0 != null && kcVar.f7252f0 == 0 && !kcVar.K0) {
            jcVar.A0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        jc jcVar = this.f7088a;
        jcVar.A0 = false;
        jcVar.E0.e(false);
        kc.b(jcVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
