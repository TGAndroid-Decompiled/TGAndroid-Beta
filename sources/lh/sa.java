package lh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

public final class sa extends p3 {

    public final sb f16741g0;

    public sa(sb sbVar, int i10, Context context, jh.b bVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, bVar, albumEntry, z10, 1.39f, z11, z12);
        this.f16741g0 = sbVar;
    }

    @Override
    public final void a() {
        sb sbVar = this.f16741g0;
        sbVar.I0.setTranslationY(sbVar.f16783n.getMeasuredHeight() - sbVar.I0.g());
        ca caVar = sbVar.f16782m2;
        if (caVar != null) {
            caVar.run();
            sbVar.f16782m2 = null;
        }
    }

    @Override
    public final void c(boolean z10) {
        if (this.f16741g0.f16746b0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new kh.c(this, 21));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        sb sbVar = this.f16741g0;
        sbVar.H0 = true;
        sbVar.f(false);
        return true;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        sb sbVar = this.f16741g0;
        if (sbVar.f16766g2) {
            float fClamp = Utilities.clamp(1.0f - (f10 / (sbVar.f16783n.getMeasuredHeight() - sbVar.I0.g())), 1.0f, 0.0f);
            sbVar.f16796r.b(AndroidUtilities.dp(-32.0f) * fClamp);
            sbVar.f16796r.setAlpha(1.0f - (0.6f * fClamp));
            sbVar.f16757e0.setAlpha(1.0f - fClamp);
        }
    }
}
