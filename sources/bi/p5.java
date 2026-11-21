package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.vv0;
public final class p5 implements Runnable {
    public final int f4000a;
    public final ProfileActivity f4001b;

    public p5(ProfileActivity profileActivity, int i7) {
        this.f4000a = i7;
        this.f4001b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f4000a) {
            case 0:
                this.f4001b.X4(true);
                return;
            case 1:
                this.f4001b.X4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f4001b;
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
