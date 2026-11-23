package fi;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bv0;
public final class a4 implements Runnable {
    public final int f11715a;
    public final bv0 f11716b;

    public a4(bv0 bv0Var, int i7) {
        this.f11715a = i7;
        this.f11716b = bv0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f11715a;
        bv0 bv0Var = this.f11716b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.f43923t0;
                ProfileActivity profileActivity = bv0Var.f46515v0;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.N4(false);
                return;
            default:
                bv0Var.invalidate();
                return;
        }
    }
}
