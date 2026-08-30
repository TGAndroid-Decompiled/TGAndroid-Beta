package kh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sz0;
public final class i2 implements Runnable {
    public final int f10668a;
    public final ProfileActivity f10669b;

    public i2(ProfileActivity profileActivity, int i10) {
        this.f10668a = i10;
        this.f10669b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f10668a) {
            case 0:
                this.f10669b.G4(true);
                return;
            case 1:
                this.f10669b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f10669b;
                sz0 sz0Var = profileActivity.L;
                if (sz0Var != null) {
                    sz0Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
