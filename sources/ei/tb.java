package ei;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fa1;
public final class tb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final ub f9881a;

    public tb(ub ubVar) {
        this.f9881a = ubVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ya yaVar;
        ub ubVar = this.f9881a;
        vb vbVar = ubVar.E0;
        if (!ubVar.A0 || (yaVar = vbVar.B0) == null || vbVar.f9982f0 != 0 || yaVar.f8822s || vbVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = vbVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        vbVar.T1 = scaleFactor;
        vbVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        vbVar.B0.setZoom(vbVar.T1);
        fa1 fa1Var = vbVar.V0;
        if (fa1Var != null) {
            fa1Var.b(vbVar.T1, false);
        }
        vbVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ub ubVar = this.f9881a;
        vb vbVar = ubVar.E0;
        if (vbVar.B0 != null && vbVar.f9982f0 == 0 && !vbVar.K0) {
            ubVar.A0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ub ubVar = this.f9881a;
        ubVar.A0 = false;
        ubVar.E0.e(false);
        vb.b(ubVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
