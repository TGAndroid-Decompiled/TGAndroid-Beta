package defpackage;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class wp8 implements cf7, bu2 {
    public final ProfileActivity a;
    public final TLRPC.User b;

    public wp8(ProfileActivity profileActivity, TLRPC.User user) {
        this.a = profileActivity;
        this.b = user;
    }

    @Override
    public final void A(boolean z) {
        e eVar;
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                eVar = (e) bp1.m(2, fragmentStack);
            } else {
                eVar = null;
            }
            if (eVar instanceof zu1) {
                ((ActionBarLayout) profileActivity.getParentLayout()).a0(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(jn7.K2, Long.valueOf(profileActivity.i1), this.b, profileActivity.F2, Boolean.valueOf(z));
    }

    @Override
    public final void a() {
        RectF rectF = ProfileActivity.Z6;
        this.a.H2(this.b);
    }
}
