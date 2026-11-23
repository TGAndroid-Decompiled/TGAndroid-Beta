package hi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g81;
public final class lb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final mb f14848a;

    public lb(mb mbVar) {
        this.f14848a = mbVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        qa qaVar;
        mb mbVar = this.f14848a;
        nb nbVar = mbVar.f14926o0;
        if (!mbVar.f14923k0 || (qaVar = nbVar.C0) == null || nbVar.f15076g0 != 0 || qaVar.f14818s || nbVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = nbVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        nbVar.U1 = scaleFactor;
        nbVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        nbVar.C0.setZoom(nbVar.U1);
        g81 g81Var = nbVar.W0;
        if (g81Var != null) {
            g81Var.b(false, nbVar.U1);
        }
        nbVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        mb mbVar = this.f14848a;
        nb nbVar = mbVar.f14926o0;
        if (nbVar.C0 != null && nbVar.f15076g0 == 0 && !nbVar.L0) {
            mbVar.f14923k0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        mb mbVar = this.f14848a;
        mbVar.f14923k0 = false;
        mbVar.f14926o0.e(false);
        nb.b(mbVar.f14926o0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
