package ih;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hz0;
public final class i2 implements Runnable {
    public final int f9240a;
    public final ProfileActivity f9241b;

    public i2(ProfileActivity profileActivity, int i10) {
        this.f9240a = i10;
        this.f9241b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f9240a) {
            case 0:
                this.f9241b.G4(true);
                return;
            case 1:
                this.f9241b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f9241b;
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
