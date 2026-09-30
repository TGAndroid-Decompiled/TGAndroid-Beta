package ci;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class kb extends w3 {
    public final lc f4922k0;

    public kb(lc lcVar, int i10, Context context, ai.d dVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, dVar, albumEntry, z10, 1.39f, z11, z12);
        this.f4922k0 = lcVar;
    }

    @Override
    public final void a() {
        lc lcVar = this.f4922k0;
        lcVar.M0.setTranslationY(lcVar.f5066n.getMeasuredHeight() - lcVar.M0.g());
        ra raVar = lcVar.f5078q2;
        if (raVar != null) {
            raVar.run();
            lcVar.f5078q2 = null;
        }
    }

    @Override
    public final void c(boolean z10) {
        if (this.f4922k0.f5044f0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 24));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
            lc lcVar = this.f4922k0;
            lcVar.L0 = true;
            lcVar.f(false);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        lc lcVar = this.f4922k0;
        if (lcVar.f5061k2) {
            float clamp = Utilities.clamp(1.0f - (f7 / (lcVar.f5066n.getMeasuredHeight() - lcVar.M0.g())), 1.0f, 0.0f);
            lcVar.f5079r.b(AndroidUtilities.dp(-32.0f) * clamp);
            lcVar.f5079r.setAlpha(1.0f - (0.6f * clamp));
            lcVar.f5053i0.setAlpha(1.0f - clamp);
        }
    }
}
