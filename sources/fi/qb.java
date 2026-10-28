package fi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kc1;
public final class qb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final rb f11504a;

    public qb(rb rbVar) {
        this.f11504a = rbVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        va vaVar;
        rb rbVar = this.f11504a;
        sb sbVar = rbVar.f11567t0;
        if (!rbVar.f11563p0 || (vaVar = sbVar.B0) == null || sbVar.f11622f0 != 0 || vaVar.f10599s || sbVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = sbVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        sbVar.T1 = scaleFactor;
        sbVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        sbVar.B0.setZoom(sbVar.T1);
        kc1 kc1Var = sbVar.V0;
        if (kc1Var != null) {
            kc1Var.b(sbVar.T1, false);
        }
        sbVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        rb rbVar = this.f11504a;
        sb sbVar = rbVar.f11567t0;
        if (sbVar.B0 != null && sbVar.f11622f0 == 0 && !sbVar.K0) {
            rbVar.f11563p0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        rb rbVar = this.f11504a;
        rbVar.f11563p0 = false;
        rbVar.f11567t0.e(false);
        sb.b(rbVar.f11567t0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
