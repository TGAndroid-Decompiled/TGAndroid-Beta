package lh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zz0;
public final class h2 implements Runnable {
    public final int f12795a;
    public final ProfileActivity f12796b;

    public h2(ProfileActivity profileActivity, int i10) {
        this.f12795a = i10;
        this.f12796b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f12795a) {
            case 0:
                this.f12796b.G4(true);
                return;
            case 1:
                this.f12796b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f12796b;
                zz0 zz0Var = profileActivity.L;
                if (zz0Var != null) {
                    zz0Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
