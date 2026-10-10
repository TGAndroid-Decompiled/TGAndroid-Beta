package ci;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ka1;
public final class jc extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final kc f5295a;

    public jc(kc kcVar) {
        this.f5295a = kcVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ob obVar;
        kc kcVar = this.f5295a;
        lc lcVar = kcVar.E0;
        if (!kcVar.A0 || (obVar = lcVar.B0) == null || lcVar.f5477f0 != 0 || obVar.f4820s || lcVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = lcVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        lcVar.T1 = scaleFactor;
        lcVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        lcVar.B0.setZoom(lcVar.T1);
        ka1 ka1Var = lcVar.V0;
        if (ka1Var != null) {
            ka1Var.b(lcVar.T1, false);
        }
        lcVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        kc kcVar = this.f5295a;
        lc lcVar = kcVar.E0;
        if (lcVar.B0 != null && lcVar.f5477f0 == 0 && !lcVar.K0) {
            kcVar.A0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        kc kcVar = this.f5295a;
        kcVar.A0 = false;
        kcVar.E0.e(false);
        lc.b(kcVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
