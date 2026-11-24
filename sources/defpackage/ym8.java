package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ProfileActivity;
public final class ym8 extends sp8 {
    public final ProfileActivity t1;

    public ym8(ProfileActivity profileActivity, Context context, long j, a aVar, om8 om8Var, xm8 xm8Var, op8 op8Var, kp8 kp8Var) {
        super(context, j, aVar, om8Var, xm8Var, op8Var, kp8Var);
        this.t1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f) {
        ProfileActivity profileActivity = this.t1;
        profileActivity.t5 = f;
        profileActivity.H1();
    }
}
