package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uv0;
public final class e3 implements Runnable {
    public final int f3479a;
    public final ProfileActivity f3480b;

    public e3(ProfileActivity profileActivity, int i7) {
        this.f3479a = i7;
        this.f3480b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f3479a) {
            case 0:
                this.f3480b.W4(true);
                return;
            case 1:
                this.f3480b.W4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f3480b;
                uv0 uv0Var = profileActivity.O;
                if (uv0Var != null) {
                    uv0Var.k1(14);
                    profileActivity.W4(false);
                    return;
                }
                return;
        }
    }
}
