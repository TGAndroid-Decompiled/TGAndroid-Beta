package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class br8 implements md2 {
    public final uj3 a;
    public final cr8 b;

    public br8(cr8 cr8Var, uj3 uj3Var) {
        this.b = cr8Var;
        this.a = uj3Var;
    }

    @Override
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.b.b;
        profileActivity.N1 = true;
        this.a.removeSelfFromStack();
        jn7 notificationCenter = profileActivity.getNotificationCenter();
        int i2 = jn7.s;
        notificationCenter.n(profileActivity, i2);
        profileActivity.getNotificationCenter().k(i2, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
