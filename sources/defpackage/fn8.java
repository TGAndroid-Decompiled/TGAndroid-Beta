package defpackage;

import org.telegram.ui.ProfileActivity;
public final class fn8 extends kx9 {
    public final ProfileActivity e;

    public fn8(ProfileActivity profileActivity, en8 en8Var) {
        super(en8Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.T5 = null;
    }
}
