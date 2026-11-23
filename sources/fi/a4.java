package fi;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dv0;
public final class a4 implements Runnable {
    public final int f11716a;
    public final dv0 f11717b;

    public a4(dv0 dv0Var, int i7) {
        this.f11716a = i7;
        this.f11717b = dv0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f11716a;
        dv0 dv0Var = this.f11717b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.f43807t0;
                ProfileActivity profileActivity = dv0Var.f47023v0;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.N4(false);
                return;
            default:
                dv0Var.invalidate();
                return;
        }
    }
}
