package defpackage;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
public final class fta implements Runnable {
    public final byte a;
    public final ita b;

    public fta(ita itaVar, byte b) {
        this.a = b;
        this.b = itaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ita itaVar = this.b;
        switch (b) {
            case 0:
                itaVar.invalidate();
                gm.c3(new fta(itaVar, (byte) 1));
                return;
            default:
                hta htaVar = itaVar.e;
                if (htaVar != null) {
                    itaVar.getVisibilityFactor();
                    ProfileActivity profileActivity = ((tn8) htaVar).b;
                    RectF rectF = ProfileActivity.e7;
                    profileActivity.r.setTranslationX(profileActivity.h2(profileActivity.G6, profileActivity.I6));
                    profileActivity.r.setTranslationY(profileActivity.i2(profileActivity.J6));
                    return;
                }
                return;
        }
    }
}
