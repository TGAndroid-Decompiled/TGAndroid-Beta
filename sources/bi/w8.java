package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xv0;
public final class w8 implements Runnable {
    public final int f4981a;
    public final ProfileActivity f4982b;

    public w8(ProfileActivity profileActivity, int i7) {
        this.f4981a = i7;
        this.f4982b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f4981a) {
            case 0:
                ProfileActivity profileActivity = this.f4982b;
                xv0 xv0Var = profileActivity.N;
                if (xv0Var != null) {
                    xv0Var.k1(14);
                    profileActivity.X4(false);
                    return;
                }
                return;
            case 1:
                this.f4982b.X4(true);
                return;
            default:
                this.f4982b.X4(true);
                return;
        }
    }
}
