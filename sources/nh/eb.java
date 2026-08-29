package nh;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u81;
public final class eb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final fb f17616a;

    public eb(fb fbVar) {
        this.f17616a = fbVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ka kaVar;
        fb fbVar = this.f17616a;
        gb gbVar = fbVar.A0;
        if (!fbVar.f17686w0 || (kaVar = gbVar.f17812x0) == null || gbVar.f17740b0 != 0 || kaVar.f17464s || gbVar.f17808w0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = gbVar.P1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        gbVar.P1 = scaleFactor;
        gbVar.P1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        gbVar.f17812x0.setZoom(gbVar.P1);
        u81 u81Var = gbVar.R0;
        if (u81Var != null) {
            u81Var.b(gbVar.P1, false);
        }
        gbVar.j0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        fb fbVar = this.f17616a;
        gb gbVar = fbVar.A0;
        if (gbVar.f17812x0 != null && gbVar.f17740b0 == 0 && !gbVar.G0) {
            fbVar.f17686w0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        fb fbVar = this.f17616a;
        fbVar.f17686w0 = false;
        fbVar.A0.f(false);
        gb.c(fbVar.A0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
