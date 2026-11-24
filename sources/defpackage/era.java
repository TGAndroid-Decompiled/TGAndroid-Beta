package defpackage;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
public final class era implements Runnable {
    public final byte a;
    public final hra b;

    public era(hra hraVar, byte b) {
        this.a = b;
        this.b = hraVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hra hraVar = this.b;
        switch (b) {
            case 0:
                hraVar.invalidate();
                gl.c3(new era(hraVar, (byte) 1));
                return;
            default:
                gra graVar = hraVar.e;
                if (graVar != null) {
                    hraVar.getVisibilityFactor();
                    ProfileActivity profileActivity = ((ql8) graVar).b;
                    RectF rectF = ProfileActivity.Z6;
                    profileActivity.r.setTranslationX(profileActivity.f2(profileActivity.B6, profileActivity.D6));
                    profileActivity.r.setTranslationY(profileActivity.g2(profileActivity.E6));
                    return;
                }
                return;
        }
    }
}
