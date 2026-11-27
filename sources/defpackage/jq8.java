package defpackage;

import android.content.Context;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ProfileActivity;
public final class jq8 extends et8 {
    public final ProfileActivity t1;

    public jq8(ProfileActivity profileActivity, Context context, long j, a aVar, zp8 zp8Var, iq8 iq8Var, at8 at8Var, ws8 ws8Var) {
        super(context, j, aVar, zp8Var, iq8Var, at8Var, ws8Var);
        this.t1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f) {
        ProfileActivity profileActivity = this.t1;
        profileActivity.t5 = f;
        profileActivity.I1();
    }
}
