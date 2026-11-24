package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ProfileActivity;
public final class zo8 extends tr8 {
    public final ProfileActivity t1;

    public zo8(ProfileActivity profileActivity, Context context, long j, a aVar, po8 po8Var, yo8 yo8Var, pr8 pr8Var, lr8 lr8Var) {
        super(context, j, aVar, po8Var, yo8Var, pr8Var, lr8Var);
        this.t1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f) {
        ProfileActivity profileActivity = this.t1;
        profileActivity.y5 = f;
        profileActivity.J1();
    }
}
