package defpackage;

import org.telegram.ui.ProfileActivity;
public final class ev8 implements Runnable {
    public final byte a;
    public final ProfileActivity b;

    public ev8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                profileActivity.k3(true);
                return;
            default:
                gr8 gr8Var = profileActivity.O;
                if (gr8Var != null) {
                    gr8Var.f1(14);
                    profileActivity.k3(false);
                    return;
                }
                return;
        }
    }
}
