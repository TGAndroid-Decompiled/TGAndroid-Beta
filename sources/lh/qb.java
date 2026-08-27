package lh;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k81;

public final class qb extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    public final rb f16606a;

    public qb(rb rbVar) {
        this.f16606a = rbVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        wa waVar;
        rb rbVar = this.f16606a;
        sb sbVar = rbVar.A0;
        if (!rbVar.f16684w0 || (waVar = sbVar.f16818x0) == null || sbVar.f16746b0 != 0 || waVar.f15728s || sbVar.f16814w0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = sbVar.P1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        sbVar.P1 = scaleFactor;
        sbVar.P1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        sbVar.f16818x0.setZoom(sbVar.P1);
        k81 k81Var = sbVar.R0;
        if (k81Var != null) {
            k81Var.b(sbVar.P1, false);
        }
        sbVar.j0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        rb rbVar = this.f16606a;
        sb sbVar = rbVar.A0;
        if (sbVar.f16818x0 == null || sbVar.f16746b0 != 0 || sbVar.G0) {
            return false;
        }
        rbVar.f16684w0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        rb rbVar = this.f16606a;
        rbVar.f16684w0 = false;
        rbVar.A0.f(false);
        sb.c(rbVar.A0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
