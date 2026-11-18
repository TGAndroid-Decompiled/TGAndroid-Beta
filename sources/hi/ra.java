package hi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.c81;
public final class ra extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final sa f15337a;

    public ra(sa saVar) {
        this.f15337a = saVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        w9 w9Var;
        sa saVar = this.f15337a;
        ta taVar = saVar.f15401o0;
        if (!saVar.f15398k0 || (w9Var = taVar.C0) == null || taVar.f15445g0 != 0 || w9Var.f14368s || taVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = taVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        taVar.U1 = scaleFactor;
        taVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        taVar.C0.setZoom(taVar.U1);
        c81 c81Var = taVar.W0;
        if (c81Var != null) {
            c81Var.b(false, taVar.U1);
        }
        taVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        sa saVar = this.f15337a;
        ta taVar = saVar.f15401o0;
        if (taVar.C0 != null && taVar.f15445g0 == 0 && !taVar.L0) {
            saVar.f15398k0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        sa saVar = this.f15337a;
        saVar.f15398k0 = false;
        saVar.f15401o0.e(false);
        ta.b(saVar.f15401o0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
