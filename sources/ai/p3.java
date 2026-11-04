package ai;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.mv0;
public final class p3 implements Runnable {
    public final int f879a;
    public final ProfileActivity f880b;

    public p3(ProfileActivity profileActivity, int i3) {
        this.f879a = i3;
        this.f880b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f879a) {
            case 0:
                this.f880b.U4(true);
                return;
            case 1:
                this.f880b.U4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f880b;
                mv0 mv0Var = profileActivity.O;
                if (mv0Var != null) {
                    mv0Var.i1(14);
                    profileActivity.U4(false);
                    return;
                }
                return;
        }
    }
}
