package ai;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pz0;
public final class s8 implements Runnable {
    public final int f2172a;
    public final ProfileActivity f2173b;

    public s8(ProfileActivity profileActivity, int i10) {
        this.f2172a = i10;
        this.f2173b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f2172a) {
            case 0:
                ProfileActivity profileActivity = this.f2173b;
                pz0 pz0Var = profileActivity.O;
                if (pz0Var != null) {
                    pz0Var.a1(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                this.f2173b.G4(true);
                return;
            default:
                this.f2173b.G4(true);
                return;
        }
    }
}
