package ci;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.oa1;
public final class jc extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final kc f5293a;

    public jc(kc kcVar) {
        this.f5293a = kcVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ob obVar;
        kc kcVar = this.f5293a;
        lc lcVar = kcVar.E0;
        if (!kcVar.A0 || (obVar = lcVar.B0) == null || lcVar.f5475f0 != 0 || obVar.f4818s || lcVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = lcVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        lcVar.T1 = scaleFactor;
        lcVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        lcVar.B0.setZoom(lcVar.T1);
        oa1 oa1Var = lcVar.V0;
        if (oa1Var != null) {
            oa1Var.b(lcVar.T1, false);
        }
        lcVar.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        kc kcVar = this.f5293a;
        lc lcVar = kcVar.E0;
        if (lcVar.B0 != null && lcVar.f5475f0 == 0 && !lcVar.K0) {
            kcVar.A0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        kc kcVar = this.f5293a;
        kcVar.A0 = false;
        kcVar.E0.e(false);
        lc.b(kcVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
