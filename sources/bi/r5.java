package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uv0;
public final class r5 implements Runnable {
    public final int f4028a;
    public final ProfileActivity f4029b;

    public r5(ProfileActivity profileActivity, int i7) {
        this.f4028a = i7;
        this.f4029b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f4028a) {
            case 0:
                this.f4029b.X4(true);
                return;
            case 1:
                this.f4029b.X4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f4029b;
                uv0 uv0Var = profileActivity.O;
                if (uv0Var != null) {
                    uv0Var.k1(14);
                    profileActivity.X4(false);
                    return;
                }
                return;
        }
    }
}
