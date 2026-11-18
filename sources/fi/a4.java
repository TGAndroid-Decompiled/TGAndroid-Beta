package fi;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cv0;
public final class a4 implements Runnable {
    public final int f11724a;
    public final cv0 f11725b;

    public a4(cv0 cv0Var, int i7) {
        this.f11724a = i7;
        this.f11725b = cv0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f11724a;
        cv0 cv0Var = this.f11725b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.f43797t0;
                ProfileActivity profileActivity = cv0Var.f46649v0;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.N4(false);
                return;
            default:
                cv0Var.invalidate();
                return;
        }
    }
}
