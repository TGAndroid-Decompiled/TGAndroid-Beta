package gh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hz0;

public final class l2 implements Runnable {

    public final int f7411a;

    public final ProfileActivity f7412b;

    public l2(ProfileActivity profileActivity, int i10) {
        this.f7411a = i10;
        this.f7412b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f7411a) {
            case 0:
                this.f7412b.G4(true);
                break;
            case 1:
                this.f7412b.G4(true);
                break;
            default:
                ProfileActivity profileActivity = this.f7412b;
                hz0 hz0Var = profileActivity.K;
                if (hz0Var != null) {
                    hz0Var.Y0(14);
                    profileActivity.G4(false);
                }
                break;
        }
    }
}
