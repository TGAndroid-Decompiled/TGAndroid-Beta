package di;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bv0;
public final class j4 implements Runnable {
    public final int f9253a;
    public final bv0 f9254b;

    public j4(bv0 bv0Var, int i7) {
        this.f9253a = i7;
        this.f9254b = bv0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9253a;
        bv0 bv0Var = this.f9254b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.f41951s0;
                ProfileActivity profileActivity = bv0Var.f44473u0;
                RectF rectF = ProfileActivity.S6;
                profileActivity.K4(false);
                return;
            default:
                bv0Var.invalidate();
                return;
        }
    }
}
