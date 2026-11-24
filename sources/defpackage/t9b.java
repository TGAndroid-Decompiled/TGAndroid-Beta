package defpackage;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
public final class t9b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final u9b a;

    public t9b(u9b u9bVar) {
        this.a = u9bVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        a9b a9bVar;
        u9b u9bVar = this.a;
        v9b v9bVar = u9bVar.u0;
        if (!u9bVar.q0 || (a9bVar = v9bVar.C0) == null || v9bVar.g0 != 0 || a9bVar.s || v9bVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = v9bVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        v9bVar.U1 = scaleFactor;
        v9bVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        v9bVar.C0.setZoom(v9bVar.U1);
        b1d b1dVar = v9bVar.W0;
        if (b1dVar != null) {
            b1dVar.b(false, v9bVar.U1);
        }
        v9bVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        u9b u9bVar = this.a;
        v9b v9bVar = u9bVar.u0;
        if (v9bVar.C0 != null && v9bVar.g0 == 0 && !v9bVar.L0) {
            u9bVar.q0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        u9b u9bVar = this.a;
        u9bVar.q0 = false;
        v9b v9bVar = u9bVar.u0;
        v9bVar.c(false);
        v9bVar.b();
        super.onScaleEnd(scaleGestureDetector);
    }
}
