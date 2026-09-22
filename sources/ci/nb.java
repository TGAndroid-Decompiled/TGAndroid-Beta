package ci;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class nb extends x3 {
    public final oc f5096k0;

    public nb(oc ocVar, int i10, Context context, ai.d dVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, dVar, albumEntry, z10, 1.39f, z11, z12);
        this.f5096k0 = ocVar;
    }

    @Override
    public final void a() {
        oc ocVar = this.f5096k0;
        ocVar.M0.setTranslationY(ocVar.f5243n.getMeasuredHeight() - ocVar.M0.g());
        ua uaVar = ocVar.f5255q2;
        if (uaVar != null) {
            uaVar.run();
            ocVar.f5255q2 = null;
        }
    }

    @Override
    public final void c(boolean z10) {
        if (this.f5096k0.f5221f0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 24));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
            oc ocVar = this.f5096k0;
            ocVar.L0 = true;
            ocVar.f(false);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        oc ocVar = this.f5096k0;
        if (ocVar.f5238k2) {
            float clamp = Utilities.clamp(1.0f - (f7 / (ocVar.f5243n.getMeasuredHeight() - ocVar.M0.g())), 1.0f, 0.0f);
            ocVar.f5256r.b(AndroidUtilities.dp(-32.0f) * clamp);
            ocVar.f5256r.setAlpha(1.0f - (0.6f * clamp));
            ocVar.f5230i0.setAlpha(1.0f - clamp);
        }
    }
}
