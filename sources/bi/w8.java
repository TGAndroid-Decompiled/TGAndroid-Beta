package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.vv0;
public final class w8 implements Runnable {
    public final int f4983a;
    public final ProfileActivity f4984b;

    public w8(ProfileActivity profileActivity, int i7) {
        this.f4983a = i7;
        this.f4984b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f4983a) {
            case 0:
                ProfileActivity profileActivity = this.f4984b;
                vv0 vv0Var = profileActivity.N;
                if (vv0Var != null) {
                    vv0Var.i1(14);
                    profileActivity.U4(false);
                    return;
                }
                return;
            case 1:
                this.f4984b.U4(true);
                return;
            default:
                this.f4984b.U4(true);
                return;
        }
    }
}
