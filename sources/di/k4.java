package di;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.fv0;
public final class k4 implements Runnable {
    public final int f9284a;
    public final fv0 f9285b;

    public k4(fv0 fv0Var, int i7) {
        this.f9284a = i7;
        this.f9285b = fv0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f9284a;
        fv0 fv0Var = this.f9285b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.f41977s0;
                ProfileActivity profileActivity = fv0Var.f45855u0;
                RectF rectF = ProfileActivity.V6;
                profileActivity.N4(false);
                return;
            default:
                fv0Var.invalidate();
                return;
        }
    }
}
