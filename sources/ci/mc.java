package ci;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.r91;
public final class mc extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final nc f5057a;

    public mc(nc ncVar) {
        this.f5057a = ncVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        rb rbVar;
        nc ncVar = this.f5057a;
        oc ocVar = ncVar.E0;
        if (!ncVar.A0 || (rbVar = ocVar.B0) == null || ocVar.f5223f0 != 0 || rbVar.f4485s || ocVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = ocVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        ocVar.T1 = scaleFactor;
        ocVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        ocVar.B0.setZoom(ocVar.T1);
        r91 r91Var = ocVar.V0;
        if (r91Var != null) {
            r91Var.b(ocVar.T1, false);
        }
        ocVar.j0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        nc ncVar = this.f5057a;
        oc ocVar = ncVar.E0;
        if (ocVar.B0 != null && ocVar.f5223f0 == 0 && !ocVar.K0) {
            ncVar.A0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        nc ncVar = this.f5057a;
        ncVar.A0 = false;
        ncVar.E0.f(false);
        oc.c(ncVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
