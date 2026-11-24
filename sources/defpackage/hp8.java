package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class hp8 extends ke2 {
    public final boolean[] d1;
    public final TLRPC.User e1;
    public final ProfileActivity f1;

    public hp8(ProfileActivity profileActivity, long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i, boolean[] zArr, TLRPC.User user) {
        super(j, j2, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i, true, false, null);
        this.f1 = profileActivity;
        this.d1 = zArr;
        this.e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z && z2 && this.d1[0]) {
            ProfileActivity profileActivity = this.f1;
            if (c41.a(profileActivity)) {
                c41.C(this.e1.first_name, profileActivity).j();
            }
        }
    }
}
