package ai;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nz0;
public final class t8 implements Runnable {
    public final int f2217a;
    public final ProfileActivity f2218b;

    public t8(ProfileActivity profileActivity, int i10) {
        this.f2217a = i10;
        this.f2218b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f2217a) {
            case 0:
                ProfileActivity profileActivity = this.f2218b;
                nz0 nz0Var = profileActivity.O;
                if (nz0Var != null) {
                    nz0Var.a1(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                this.f2218b.G4(true);
                return;
            default:
                this.f2218b.G4(true);
                return;
        }
    }
}
