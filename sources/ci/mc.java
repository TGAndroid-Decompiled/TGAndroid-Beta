package ci;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.e91;
public final class mc extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final nc f5051a;

    public mc(nc ncVar) {
        this.f5051a = ncVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        rb rbVar;
        nc ncVar = this.f5051a;
        oc ocVar = ncVar.E0;
        if (!ncVar.A0 || (rbVar = ocVar.B0) == null || ocVar.f5217f0 != 0 || rbVar.f4479s || ocVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = ocVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        ocVar.T1 = scaleFactor;
        ocVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        ocVar.B0.setZoom(ocVar.T1);
        e91 e91Var = ocVar.V0;
        if (e91Var != null) {
            e91Var.b(ocVar.T1, false);
        }
        ocVar.j0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        nc ncVar = this.f5051a;
        oc ocVar = ncVar.E0;
        if (ocVar.B0 != null && ocVar.f5217f0 == 0 && !ocVar.K0) {
            ncVar.A0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        nc ncVar = this.f5051a;
        ncVar.A0 = false;
        ncVar.E0.f(false);
        oc.c(ncVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
