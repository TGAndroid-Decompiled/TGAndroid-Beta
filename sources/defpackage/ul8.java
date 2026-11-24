package defpackage;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class ul8 implements sc7, ht2 {
    public final ProfileActivity a;
    public final TLRPC.User b;

    public ul8(ProfileActivity profileActivity, TLRPC.User user) {
        this.a = profileActivity;
        this.b = user;
    }

    @Override
    public final void a() {
        RectF rectF = ProfileActivity.Z6;
        this.a.G2(this.b);
    }

    @Override
    public final void k(boolean z) {
        d dVar;
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                dVar = (d) oo1.m(2, fragmentStack);
            } else {
                dVar = null;
            }
            if (dVar instanceof mu1) {
                ((ActionBarLayout) profileActivity.getParentLayout()).a0(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(kk7.J2, Long.valueOf(profileActivity.i1), this.b, profileActivity.F2, Boolean.valueOf(z));
    }
}
