package defpackage;

import org.telegram.ui.ProfileActivity;
public final class gp8 extends mz9 {
    public final ProfileActivity e;

    public gp8(ProfileActivity profileActivity, fp8 fp8Var) {
        super(fp8Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.Y5 = null;
    }
}
