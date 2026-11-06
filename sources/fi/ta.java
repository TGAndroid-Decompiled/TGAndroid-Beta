package fi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.q71;
public final class ta extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final ua f12865a;

    public ta(ua uaVar) {
        this.f12865a = uaVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        y9 y9Var;
        ua uaVar = this.f12865a;
        va vaVar = uaVar.f12908n0;
        if (!uaVar.f12905j0 || (y9Var = vaVar.B0) == null || vaVar.f12953f0 != 0 || y9Var.f11643s || vaVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = vaVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        vaVar.T1 = scaleFactor;
        vaVar.T1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        vaVar.B0.setZoom(vaVar.T1);
        q71 q71Var = vaVar.V0;
        if (q71Var != null) {
            q71Var.b(false, vaVar.T1);
        }
        vaVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ua uaVar = this.f12865a;
        va vaVar = uaVar.f12908n0;
        if (vaVar.B0 != null && vaVar.f12953f0 == 0 && !vaVar.K0) {
            uaVar.f12905j0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ua uaVar = this.f12865a;
        uaVar.f12905j0 = false;
        uaVar.f12908n0.e(false);
        va.b(uaVar.f12908n0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
