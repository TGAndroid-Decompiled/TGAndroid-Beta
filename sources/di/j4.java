package di;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cv0;
public final class j4 implements Runnable {
    public final int f9253a;
    public final cv0 f9254b;

    public j4(cv0 cv0Var, int i7) {
        this.f9253a = i7;
        this.f9254b = cv0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9253a;
        cv0 cv0Var = this.f9254b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.f41975s0;
                ProfileActivity profileActivity = cv0Var.f44903u0;
                RectF rectF = ProfileActivity.S6;
                profileActivity.K4(false);
                return;
            default:
                cv0Var.invalidate();
                return;
        }
    }
}
