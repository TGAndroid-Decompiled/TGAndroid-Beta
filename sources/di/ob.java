package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class ob extends x3 {
    public final pc f7831k0;

    public ob(pc pcVar, int i10, Context context, bi.b bVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, bVar, albumEntry, z10, 1.39f, z11, z12);
        this.f7831k0 = pcVar;
    }

    @Override
    public final void a() {
        pc pcVar = this.f7831k0;
        pcVar.M0.setTranslationY(pcVar.f7910n.getMeasuredHeight() - pcVar.M0.g());
        ua uaVar = pcVar.f7922q2;
        if (uaVar != null) {
            uaVar.run();
            pcVar.f7922q2 = null;
        }
    }

    @Override
    public final void c(boolean z10) {
        if (this.f7831k0.f7888f0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new nb(this, 0));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
            pc pcVar = this.f7831k0;
            pcVar.L0 = true;
            pcVar.f(false);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        pc pcVar = this.f7831k0;
        if (pcVar.f7905k2) {
            float clamp = Utilities.clamp(1.0f - (f7 / (pcVar.f7910n.getMeasuredHeight() - pcVar.M0.g())), 1.0f, 0.0f);
            pcVar.f7923r.b(AndroidUtilities.dp(-32.0f) * clamp);
            pcVar.f7923r.setAlpha(1.0f - (0.6f * clamp));
            pcVar.f7897i0.setAlpha(1.0f - clamp);
        }
    }
}
