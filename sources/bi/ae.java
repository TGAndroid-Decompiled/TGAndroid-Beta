package bi;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.q91;
public final class ae extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final be f2345a;

    public ae(be beVar) {
        this.f2345a = beVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        bd bdVar;
        be beVar = this.f2345a;
        ce ceVar = beVar.E0;
        if (!beVar.A0 || (bdVar = ceVar.B0) == null || ceVar.f2448f0 != 0 || bdVar.f2845s || ceVar.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = ceVar.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        ceVar.T1 = scaleFactor;
        ceVar.T1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        ceVar.B0.setZoom(ceVar.T1);
        q91 q91Var = ceVar.V0;
        if (q91Var != null) {
            q91Var.b(ceVar.T1, false);
        }
        ceVar.j0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        be beVar = this.f2345a;
        ce ceVar = beVar.E0;
        if (ceVar.B0 != null && ceVar.f2448f0 == 0 && !ceVar.K0) {
            beVar.A0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        be beVar = this.f2345a;
        beVar.A0 = false;
        beVar.E0.f(false);
        ce.c(beVar.E0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
