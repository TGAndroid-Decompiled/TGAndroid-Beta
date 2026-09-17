package di;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.d91;
public final class nc extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final oc f7731a;

    public nc(oc ocVar) {
        this.f7731a = ocVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        sb sbVar;
        oc ocVar = this.f7731a;
        pc pcVar = ocVar.E0;
        if (!ocVar.A0 || (sbVar = pcVar.B0) == null || pcVar.f7888f0 != 0 || sbVar.f7075s || pcVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = pcVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        pcVar.T1 = scaleFactor;
        pcVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        pcVar.B0.setZoom(pcVar.T1);
        d91 d91Var = pcVar.V0;
        if (d91Var != null) {
            d91Var.b(pcVar.T1, false);
        }
        pcVar.j0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        oc ocVar = this.f7731a;
        pc pcVar = ocVar.E0;
        if (pcVar.B0 != null && pcVar.f7888f0 == 0 && !pcVar.K0) {
            ocVar.A0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        oc ocVar = this.f7731a;
        ocVar.A0 = false;
        ocVar.E0.f(false);
        pc.c(ocVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
