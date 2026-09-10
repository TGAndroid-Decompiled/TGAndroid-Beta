package bi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class xc extends p4 {
    public final ce f3941k0;

    public xc(ce ceVar, int i10, Context context, zh.b bVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, bVar, albumEntry, z10, 1.39f, z11, z12);
        this.f3941k0 = ceVar;
    }

    @Override
    public final void a() {
        ce ceVar = this.f3941k0;
        ceVar.M0.setTranslationY(ceVar.f2470n.getMeasuredHeight() - ceVar.M0.g());
        dc dcVar = ceVar.f2482q2;
        if (dcVar != null) {
            dcVar.run();
            ceVar.f2482q2 = null;
        }
    }

    @Override
    public final void c(boolean z10) {
        if (this.f3941k0.f2448f0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new wc(this, 0));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
            ce ceVar = this.f3941k0;
            ceVar.L0 = true;
            ceVar.f(false);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ce ceVar = this.f3941k0;
        if (ceVar.f2465k2) {
            float clamp = Utilities.clamp(1.0f - (f7 / (ceVar.f2470n.getMeasuredHeight() - ceVar.M0.g())), 1.0f, 0.0f);
            ceVar.f2483r.b(AndroidUtilities.dp(-32.0f) * clamp);
            ceVar.f2483r.setAlpha(1.0f - (0.6f * clamp));
            ceVar.f2457i0.setAlpha(1.0f - clamp);
        }
    }
}
