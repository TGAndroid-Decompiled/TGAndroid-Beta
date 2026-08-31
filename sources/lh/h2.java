package lh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uz0;
public final class h2 implements Runnable {
    public final int f12793a;
    public final ProfileActivity f12794b;

    public h2(ProfileActivity profileActivity, int i10) {
        this.f12793a = i10;
        this.f12794b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f12793a) {
            case 0:
                this.f12794b.G4(true);
                return;
            case 1:
                this.f12794b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f12794b;
                uz0 uz0Var = profileActivity.L;
                if (uz0Var != null) {
                    uz0Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
