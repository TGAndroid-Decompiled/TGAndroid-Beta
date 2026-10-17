package ai;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pz0;
public final class s8 implements Runnable {
    public final int f2168a;
    public final ProfileActivity f2169b;

    public s8(ProfileActivity profileActivity, int i10) {
        this.f2168a = i10;
        this.f2169b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f2168a) {
            case 0:
                ProfileActivity profileActivity = this.f2169b;
                pz0 pz0Var = profileActivity.O;
                if (pz0Var != null) {
                    pz0Var.a1(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                this.f2169b.G4(true);
                return;
            default:
                this.f2169b.G4(true);
                return;
        }
    }
}
