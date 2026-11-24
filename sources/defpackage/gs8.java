package defpackage;

import org.telegram.ui.ProfileActivity;
public final class gs8 implements Runnable {
    public final byte a;
    public final ProfileActivity b;

    public gs8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                profileActivity.n3(true);
                return;
            case 1:
                profileActivity.n3(true);
                return;
            default:
                wp8 wp8Var = profileActivity.O;
                if (wp8Var != null) {
                    wp8Var.f1(14);
                    profileActivity.n3(false);
                    return;
                }
                return;
        }
    }
}
