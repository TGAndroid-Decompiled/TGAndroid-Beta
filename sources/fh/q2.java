package fh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hz0;
public final class q2 implements Runnable {
    public final int f6725a;
    public final ProfileActivity f6726b;

    public q2(ProfileActivity profileActivity, int i9) {
        this.f6725a = i9;
        this.f6726b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f6725a) {
            case 0:
                this.f6726b.G4(true);
                return;
            case 1:
                this.f6726b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f6726b;
                hz0 hz0Var = profileActivity.K;
                if (hz0Var != null) {
                    hz0Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
