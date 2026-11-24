package defpackage;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class wn8 implements ue7, su2 {
    public final ProfileActivity a;
    public final TLRPC.User b;

    public wn8(ProfileActivity profileActivity, TLRPC.User user) {
        this.a = profileActivity;
        this.b = user;
    }

    @Override
    public final void a() {
        RectF rectF = ProfileActivity.e7;
        this.a.J2(this.b);
    }

    @Override
    public final void z(boolean z) {
        d dVar;
        RectF rectF = ProfileActivity.e7;
        ProfileActivity profileActivity = this.a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                dVar = (d) aq1.m(2, fragmentStack);
            } else {
                dVar = null;
            }
            if (dVar instanceof yv1) {
                ((ActionBarLayout) profileActivity.getParentLayout()).a0(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(nm7.K2, Long.valueOf(profileActivity.i1), this.b, profileActivity.F2, Boolean.valueOf(z));
    }
}
