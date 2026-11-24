package defpackage;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class zt8 implements Runnable {
    public final byte a;
    public final bp8 b;

    public zt8(bp8 bp8Var, byte b) {
        this.a = b;
        this.b = bp8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bp8 bp8Var = this.b;
        switch (b) {
            case 0:
                int i = ProfileStoriesView.t0;
                ProfileActivity profileActivity = bp8Var.v0;
                RectF rectF = ProfileActivity.e7;
                profileActivity.d3(false);
                return;
            default:
                bp8Var.invalidate();
                return;
        }
    }
}
