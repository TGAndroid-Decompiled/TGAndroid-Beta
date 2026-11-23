package hi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f81;
public final class qa extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final ra f15316a;

    public qa(ra raVar) {
        this.f15316a = raVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        v9 v9Var;
        ra raVar = this.f15316a;
        sa saVar = raVar.f15353o0;
        if (!raVar.f15350k0 || (v9Var = saVar.C0) == null || saVar.f15406g0 != 0 || v9Var.f14472s || saVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = saVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        saVar.U1 = scaleFactor;
        saVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        saVar.C0.setZoom(saVar.U1);
        f81 f81Var = saVar.W0;
        if (f81Var != null) {
            f81Var.b(false, saVar.U1);
        }
        saVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ra raVar = this.f15316a;
        sa saVar = raVar.f15353o0;
        if (saVar.C0 != null && saVar.f15406g0 == 0 && !saVar.L0) {
            raVar.f15350k0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ra raVar = this.f15316a;
        raVar.f15350k0 = false;
        raVar.f15353o0.e(false);
        sa.b(raVar.f15353o0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
