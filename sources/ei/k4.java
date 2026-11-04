package ei;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.tu0;
public final class k4 implements Runnable {
    public final int f10567a;
    public final tu0 f10568b;

    public k4(tu0 tu0Var, int i3) {
        this.f10567a = i3;
        this.f10568b = tu0Var;
    }

    @Override
    public final void run() {
        int i3 = this.f10567a;
        tu0 tu0Var = this.f10568b;
        switch (i3) {
            case 0:
                int i10 = ProfileStoriesView.f42008t0;
                ProfileActivity profileActivity = tu0Var.f49891v0;
                RectF rectF = ProfileActivity.T6;
                profileActivity.K4(false);
                return;
            default:
                tu0Var.invalidate();
                return;
        }
    }
}
