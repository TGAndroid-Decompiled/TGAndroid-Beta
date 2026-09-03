package kh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zz0;
public final class h2 implements Runnable {
    public final int f10766a;
    public final ProfileActivity f10767b;

    public h2(ProfileActivity profileActivity, int i10) {
        this.f10766a = i10;
        this.f10767b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f10766a) {
            case 0:
                this.f10767b.G4(true);
                return;
            case 1:
                this.f10767b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f10767b;
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
