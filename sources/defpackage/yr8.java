package defpackage;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class yr8 implements Runnable {
    public final byte a;
    public final an8 b;

    public yr8(an8 an8Var, byte b) {
        this.a = b;
        this.b = an8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        an8 an8Var = this.b;
        switch (b) {
            case 0:
                int i = ProfileStoriesView.t0;
                ProfileActivity profileActivity = an8Var.v0;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.Z2(false);
                return;
            default:
                an8Var.invalidate();
                return;
        }
    }
}
