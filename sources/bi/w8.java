package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yv0;
public final class w8 implements Runnable {
    public final int f4985a;
    public final ProfileActivity f4986b;

    public w8(ProfileActivity profileActivity, int i7) {
        this.f4985a = i7;
        this.f4986b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f4985a) {
            case 0:
                ProfileActivity profileActivity = this.f4986b;
                yv0 yv0Var = profileActivity.N;
                if (yv0Var != null) {
                    yv0Var.k1(14);
                    profileActivity.X4(false);
                    return;
                }
                return;
            case 1:
                this.f4986b.X4(true);
                return;
            default:
                this.f4986b.X4(true);
                return;
        }
    }
}
