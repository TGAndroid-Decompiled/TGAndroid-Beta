package hi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f81;
public final class ra extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final sa f15313a;

    public ra(sa saVar) {
        this.f15313a = saVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        w9 w9Var;
        sa saVar = this.f15313a;
        ta taVar = saVar.f15348o0;
        if (!saVar.f15345k0 || (w9Var = taVar.C0) == null || taVar.f15409g0 != 0 || w9Var.f14260s || taVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = taVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        taVar.U1 = scaleFactor;
        taVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        taVar.C0.setZoom(taVar.U1);
        f81 f81Var = taVar.W0;
        if (f81Var != null) {
            f81Var.b(false, taVar.U1);
        }
        taVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        sa saVar = this.f15313a;
        ta taVar = saVar.f15348o0;
        if (taVar.C0 != null && taVar.f15409g0 == 0 && !taVar.L0) {
            saVar.f15345k0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        sa saVar = this.f15313a;
        saVar.f15345k0 = false;
        saVar.f15348o0.e(false);
        ta.b(saVar.f15348o0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
