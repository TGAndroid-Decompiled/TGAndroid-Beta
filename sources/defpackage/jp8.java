package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class jp8 extends tca {
    public final ProfileActivity U2;

    public jp8(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.U2 = profileActivity;
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        gm.d3(new mn8(this, vh6Var, i, (byte) 13), 250L);
    }
}
