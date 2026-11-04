package gi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j71;
public final class ta extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final ua f13637a;

    public ta(ua uaVar) {
        this.f13637a = uaVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        y9 y9Var;
        ua uaVar = this.f13637a;
        va vaVar = uaVar.f13674o0;
        if (!uaVar.f13671k0 || (y9Var = vaVar.C0) == null || vaVar.f13720g0 != 0 || y9Var.f12437s || vaVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = vaVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        vaVar.U1 = scaleFactor;
        vaVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        vaVar.C0.setZoom(vaVar.U1);
        j71 j71Var = vaVar.W0;
        if (j71Var != null) {
            j71Var.b(false, vaVar.U1);
        }
        vaVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ua uaVar = this.f13637a;
        va vaVar = uaVar.f13674o0;
        if (vaVar.C0 != null && vaVar.f13720g0 == 0 && !vaVar.L0) {
            uaVar.f13671k0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ua uaVar = this.f13637a;
        uaVar.f13671k0 = false;
        uaVar.f13674o0.e(false);
        va.b(uaVar.f13674o0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
