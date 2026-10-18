package ei;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w91;
public final class tb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final ub f9868a;

    public tb(ub ubVar) {
        this.f9868a = ubVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ya yaVar;
        ub ubVar = this.f9868a;
        vb vbVar = ubVar.E0;
        if (!ubVar.A0 || (yaVar = vbVar.B0) == null || vbVar.f9968f0 != 0 || yaVar.f8816s || vbVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = vbVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        vbVar.T1 = scaleFactor;
        vbVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        vbVar.B0.setZoom(vbVar.T1);
        w91 w91Var = vbVar.V0;
        if (w91Var != null) {
            w91Var.b(vbVar.T1, false);
        }
        vbVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ub ubVar = this.f9868a;
        vb vbVar = ubVar.E0;
        if (vbVar.B0 != null && vbVar.f9968f0 == 0 && !vbVar.K0) {
            ubVar.A0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ub ubVar = this.f9868a;
        ubVar.A0 = false;
        ubVar.E0.e(false);
        vb.b(ubVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
