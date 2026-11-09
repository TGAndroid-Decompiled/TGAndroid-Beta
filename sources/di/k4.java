package di;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ev0;
public final class k4 implements Runnable {
    public final int f9279a;
    public final ev0 f9280b;

    public k4(ev0 ev0Var, int i7) {
        this.f9279a = i7;
        this.f9280b = ev0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9279a;
        ev0 ev0Var = this.f9280b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.f41986s0;
                ProfileActivity profileActivity = ev0Var.f45518u0;
                RectF rectF = ProfileActivity.V6;
                profileActivity.N4(false);
                return;
            default:
                ev0Var.invalidate();
                return;
        }
    }
}
