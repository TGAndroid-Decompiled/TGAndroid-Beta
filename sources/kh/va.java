package kh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class va extends q3 {
    public final wb f16212g0;

    public va(wb wbVar, int i9, Context context, ih.b bVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i9, context, bVar, albumEntry, z10, 1.39f, z11, z12);
        this.f16212g0 = wbVar;
    }

    @Override
    public final void a() {
        wb wbVar = this.f16212g0;
        wbVar.I0.setTranslationY(wbVar.f16287n.getMeasuredHeight() - wbVar.I0.g());
        fa faVar = wbVar.f16286m2;
        if (faVar != null) {
            faVar.run();
            wbVar.f16286m2 = null;
        }
    }

    @Override
    public final void c(boolean z10) {
        if (this.f16212g0.f16250b0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new f1(this, 14));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
            wb wbVar = this.f16212g0;
            wbVar.H0 = true;
            wbVar.f(false);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        wb wbVar = this.f16212g0;
        if (wbVar.f16270g2) {
            float clamp = Utilities.clamp(1.0f - (f10 / (wbVar.f16287n.getMeasuredHeight() - wbVar.I0.g())), 1.0f, 0.0f);
            wbVar.f16300r.b(AndroidUtilities.dp(-32.0f) * clamp);
            wbVar.f16300r.setAlpha(1.0f - (0.6f * clamp));
            wbVar.f16261e0.setAlpha(1.0f - clamp);
        }
    }
}
