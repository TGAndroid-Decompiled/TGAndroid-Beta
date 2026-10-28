package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xz0;
public final class p8 implements Runnable {
    public final int f5235a;
    public final ProfileActivity f5236b;

    public p8(ProfileActivity profileActivity, int i10) {
        this.f5235a = i10;
        this.f5236b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f5235a) {
            case 0:
                ProfileActivity profileActivity = this.f5236b;
                xz0 xz0Var = profileActivity.N;
                if (xz0Var != null) {
                    xz0Var.e1(14);
                    profileActivity.O4(false);
                    return;
                }
                return;
            case 1:
                this.f5236b.O4(true);
                return;
            default:
                this.f5236b.O4(true);
                return;
        }
    }
}
