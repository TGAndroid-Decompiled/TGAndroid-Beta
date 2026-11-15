package hi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.s71;
public final class qa extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final ra f14932a;

    public qa(ra raVar) {
        this.f14932a = raVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        v9 v9Var;
        ra raVar = this.f14932a;
        sa saVar = raVar.f15010o0;
        if (!raVar.f15007k0 || (v9Var = saVar.C0) == null || saVar.f15057g0 != 0 || v9Var.f13966s || saVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = saVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        saVar.U1 = scaleFactor;
        saVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        saVar.C0.setZoom(saVar.U1);
        s71 s71Var = saVar.W0;
        if (s71Var != null) {
            s71Var.b(false, saVar.U1);
        }
        saVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ra raVar = this.f14932a;
        sa saVar = raVar.f15010o0;
        if (saVar.C0 != null && saVar.f15057g0 == 0 && !saVar.L0) {
            raVar.f15007k0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ra raVar = this.f14932a;
        raVar.f15007k0 = false;
        raVar.f15010o0.e(false);
        sa.b(raVar.f15010o0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
