package defpackage;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
public final class qbb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final rbb a;

    public qbb(rbb rbbVar) {
        this.a = rbbVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        xab xabVar;
        rbb rbbVar = this.a;
        sbb sbbVar = rbbVar.o0;
        if (!rbbVar.k0 || (xabVar = sbbVar.C0) == null || sbbVar.g0 != 0 || xabVar.s || sbbVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = sbbVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        sbbVar.U1 = scaleFactor;
        sbbVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        sbbVar.C0.setZoom(sbbVar.U1);
        r3d r3dVar = sbbVar.W0;
        if (r3dVar != null) {
            r3dVar.b(false, sbbVar.U1);
        }
        sbbVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        rbb rbbVar = this.a;
        sbb sbbVar = rbbVar.o0;
        if (sbbVar.C0 != null && sbbVar.g0 == 0 && !sbbVar.L0) {
            rbbVar.k0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        rbb rbbVar = this.a;
        rbbVar.k0 = false;
        sbb sbbVar = rbbVar.o0;
        sbbVar.c(false);
        sbbVar.b();
        super.onScaleEnd(scaleGestureDetector);
    }
}
