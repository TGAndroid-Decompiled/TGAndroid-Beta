package fi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class qa extends o3 {
    public final sb f11503k0;

    public qa(sb sbVar, int i10, Context context, di.b bVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, bVar, albumEntry, z10, 1.39f, z11, z12);
        this.f11503k0 = sbVar;
    }

    @Override
    public final void a() {
        sb sbVar = this.f11503k0;
        sbVar.M0.setTranslationY(sbVar.f11644n.getMeasuredHeight() - sbVar.M0.g());
        z9 z9Var = sbVar.f11656q2;
        if (z9Var != null) {
            z9Var.run();
            sbVar.f11656q2 = null;
        }
    }

    @Override
    public final void c(boolean z10) {
        if (this.f11503k0.f11622f0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new di.s8(this, 28));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
            sb sbVar = this.f11503k0;
            sbVar.L0 = true;
            sbVar.e(false);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        sb sbVar = this.f11503k0;
        if (sbVar.f11639k2) {
            float clamp = Utilities.clamp(1.0f - (f7 / (sbVar.f11644n.getMeasuredHeight() - sbVar.M0.g())), 1.0f, 0.0f);
            sbVar.f11657r.b(AndroidUtilities.dp(-32.0f) * clamp);
            sbVar.f11657r.setAlpha(1.0f - (0.6f * clamp));
            sbVar.f11631i0.setAlpha(1.0f - clamp);
        }
    }
}
