package defpackage;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
public final class gva implements Runnable {
    public final byte a;
    public final jva b;

    public gva(jva jvaVar, byte b) {
        this.a = b;
        this.b = jvaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jva jvaVar = this.b;
        switch (b) {
            case 0:
                jvaVar.invalidate();
                hl.c3(new gva(jvaVar, (byte) 1));
                return;
            default:
                iva ivaVar = jvaVar.e;
                if (ivaVar != null) {
                    jvaVar.getVisibilityFactor();
                    ProfileActivity profileActivity = ((bp8) ivaVar).b;
                    RectF rectF = ProfileActivity.Z6;
                    profileActivity.r.setTranslationX(profileActivity.g2(profileActivity.B6, profileActivity.D6));
                    profileActivity.r.setTranslationY(profileActivity.h2(profileActivity.E6));
                    return;
                }
                return;
        }
    }
}
