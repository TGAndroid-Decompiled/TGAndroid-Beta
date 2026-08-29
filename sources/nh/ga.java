package nh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class ga extends n3 {
    public final gb f17735g0;

    public ga(gb gbVar, int i10, Context context, lh.b bVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, bVar, albumEntry, z10, 1.39f, z11, z12);
        this.f17735g0 = gbVar;
    }

    @Override
    public final void a() {
        gb gbVar = this.f17735g0;
        gbVar.I0.setTranslationY(gbVar.f17777n.getMeasuredHeight() - gbVar.I0.g());
        q9 q9Var = gbVar.f17776m2;
        if (q9Var != null) {
            q9Var.run();
            gbVar.f17776m2 = null;
        }
    }

    @Override
    public final void c(boolean z10) {
        if (this.f17735g0.f17740b0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new m6(this, 5));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
            gb gbVar = this.f17735g0;
            gbVar.H0 = true;
            gbVar.f(false);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        gb gbVar = this.f17735g0;
        if (gbVar.f17760g2) {
            float clamp = Utilities.clamp(1.0f - (f9 / (gbVar.f17777n.getMeasuredHeight() - gbVar.I0.g())), 1.0f, 0.0f);
            gbVar.f17790r.b(AndroidUtilities.dp(-32.0f) * clamp);
            gbVar.f17790r.setAlpha(1.0f - (0.6f * clamp));
            gbVar.f17751e0.setAlpha(1.0f - clamp);
        }
    }
}
