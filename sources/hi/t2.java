package hi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class t2 implements Runnable {
    public final int f14963a;
    public final v2 f14964b;

    public t2(v2 v2Var, int i7) {
        this.f14963a = i7;
        this.f14964b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f14963a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                v2 v2Var = this.f14964b;
                a3 a3Var = v2Var.d;
                toggleuseremojistatuspermission.bot = qp.s1(a3Var.H).o1(a3Var.I);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(a3Var.H).sendRequest(toggleuseremojistatuspermission, new u2(v2Var, 1));
                return;
            case 1:
                a3 a3Var2 = this.f14964b.d;
                r0.e(a3Var2.getContext(), a3Var2.H, a3Var2.I).l(false, null);
                return;
            default:
                a3 a3Var3 = this.f14964b.d;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null && T.getParentLayout() != null) {
                    r4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.D4(a3Var3.I));
                    org.telegram.messenger.g0.k3(parentLayout, "botPermissionLocation");
                    a3Var3.o(true);
                    return;
                }
                return;
        }
    }
}
