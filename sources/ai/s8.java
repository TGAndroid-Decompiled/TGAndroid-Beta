package ai;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pz0;
public final class s8 implements Runnable {
    public final int f2170a;
    public final ProfileActivity f2171b;

    public s8(ProfileActivity profileActivity, int i10) {
        this.f2170a = i10;
        this.f2171b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f2170a) {
            case 0:
                ProfileActivity profileActivity = this.f2171b;
                pz0 pz0Var = profileActivity.O;
                if (pz0Var != null) {
                    pz0Var.a1(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                this.f2171b.G4(true);
                return;
            default:
                this.f2171b.G4(true);
                return;
        }
    }
}
