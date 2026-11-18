package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.vv0;
public final class l5 implements Runnable {
    public final int f3816a;
    public final ProfileActivity f3817b;

    public l5(ProfileActivity profileActivity, int i7) {
        this.f3816a = i7;
        this.f3817b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f3816a) {
            case 0:
                this.f3817b.X4(true);
                return;
            case 1:
                this.f3817b.X4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f3817b;
                vv0 vv0Var = profileActivity.O;
                if (vv0Var != null) {
                    vv0Var.k1(14);
                    profileActivity.X4(false);
                    return;
                }
                return;
        }
    }
}
