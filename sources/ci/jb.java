package ci;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class jb extends w3 {
    public final kc f5274k0;

    public jb(kc kcVar, int i10, Context context, ai.d dVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, dVar, albumEntry, z10, 1.39f, z11, z12);
        this.f5274k0 = kcVar;
    }

    @Override
    public final void a() {
        kc kcVar = this.f5274k0;
        kcVar.M0.setTranslationY(kcVar.f5415n.getMeasuredHeight() - kcVar.M0.g());
        qa qaVar = kcVar.f5427q2;
        if (qaVar != null) {
            qaVar.run();
            kcVar.f5427q2 = null;
        }
    }

    @Override
    public final void c(boolean z10) {
        if (this.f5274k0.f5393f0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 24));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
            kc kcVar = this.f5274k0;
            kcVar.L0 = true;
            kcVar.f(false);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        kc kcVar = this.f5274k0;
        if (kcVar.f5410k2) {
            float clamp = Utilities.clamp(1.0f - (f7 / (kcVar.f5415n.getMeasuredHeight() - kcVar.M0.g())), 1.0f, 0.0f);
            kcVar.f5428r.b(AndroidUtilities.dp(-32.0f) * clamp);
            kcVar.f5428r.setAlpha(1.0f - (0.6f * clamp));
            kcVar.f5402i0.setAlpha(1.0f - clamp);
        }
    }
}
