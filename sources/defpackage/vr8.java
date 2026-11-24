package defpackage;

import org.telegram.ui.ProfileActivity;
public final class vr8 implements Runnable {
    public final byte a;
    public final ProfileActivity b;

    public vr8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                profileActivity.j3(true);
                return;
            default:
                vn8 vn8Var = profileActivity.O;
                if (vn8Var != null) {
                    vn8Var.f1(14);
                    profileActivity.j3(false);
                    return;
                }
                return;
        }
    }
}
