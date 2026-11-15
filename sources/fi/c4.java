package fi;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.av0;
public final class c4 implements Runnable {
    public final int f11593a;
    public final av0 f11594b;

    public c4(av0 av0Var, int i7) {
        this.f11593a = i7;
        this.f11594b = av0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f11593a;
        av0 av0Var = this.f11594b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.f43351t0;
                ProfileActivity profileActivity = av0Var.f45520v0;
                RectF rectF = ProfileActivity.X6;
                profileActivity.M4(false);
                return;
            default:
                av0Var.invalidate();
                return;
        }
    }
}
