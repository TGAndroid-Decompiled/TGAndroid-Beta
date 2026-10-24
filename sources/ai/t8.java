package ai;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qz0;
public final class t8 implements Runnable {
    public final int f2220a;
    public final ProfileActivity f2221b;

    public t8(ProfileActivity profileActivity, int i10) {
        this.f2220a = i10;
        this.f2221b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f2220a) {
            case 0:
                ProfileActivity profileActivity = this.f2221b;
                qz0 qz0Var = profileActivity.O;
                if (qz0Var != null) {
                    qz0Var.b1(14);
                    profileActivity.I4(false);
                    return;
                }
                return;
            case 1:
                this.f2221b.I4(true);
                return;
            default:
                this.f2221b.I4(true);
                return;
        }
    }
}
