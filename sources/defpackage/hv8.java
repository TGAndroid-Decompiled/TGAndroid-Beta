package defpackage;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class hv8 implements Runnable {
    public final byte a;
    public final lq8 b;

    public hv8(lq8 lq8Var, byte b) {
        this.a = b;
        this.b = lq8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lq8 lq8Var = this.b;
        switch (b) {
            case 0:
                int i = ProfileStoriesView.t0;
                ProfileActivity profileActivity = lq8Var.v0;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.a3(false);
                return;
            default:
                lq8Var.invalidate();
                return;
        }
    }
}
