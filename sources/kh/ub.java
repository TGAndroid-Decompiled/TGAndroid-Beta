package kh;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i81;
public final class ub extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final vb f16173a;

    public ub(vb vbVar) {
        this.f16173a = vbVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        za zaVar;
        vb vbVar = this.f16173a;
        wb wbVar = vbVar.A0;
        if (!vbVar.f16217w0 || (zaVar = wbVar.f16322x0) == null || wbVar.f16250b0 != 0 || zaVar.f15086s || wbVar.f16318w0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = wbVar.P1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        wbVar.P1 = scaleFactor;
        wbVar.P1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        wbVar.f16322x0.setZoom(wbVar.P1);
        i81 i81Var = wbVar.R0;
        if (i81Var != null) {
            i81Var.b(wbVar.P1, false);
        }
        wbVar.j0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        vb vbVar = this.f16173a;
        wb wbVar = vbVar.A0;
        if (wbVar.f16322x0 != null && wbVar.f16250b0 == 0 && !wbVar.G0) {
            vbVar.f16217w0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        vb vbVar = this.f16173a;
        vbVar.f16217w0 = false;
        vbVar.A0.f(false);
        wb.c(vbVar.A0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
