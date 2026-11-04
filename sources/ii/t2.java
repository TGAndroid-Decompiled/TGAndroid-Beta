package ii;

import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class t2 implements Runnable {
    public final int f15238a;
    public final v2 f15239b;

    public t2(v2 v2Var, int i3) {
        this.f15238a = i3;
        this.f15239b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f15238a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                v2 v2Var = this.f15239b;
                a3 a3Var = v2Var.d;
                toggleuseremojistatuspermission.bot = hp.s1(a3Var.I).o1(a3Var.J);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(a3Var.I).sendRequest(toggleuseremojistatuspermission, new u2(v2Var, 1));
                return;
            case 1:
                a3 a3Var2 = this.f15239b.d;
                s0.e(a3Var2.getContext(), a3Var2.I, a3Var2.J).l(false, null);
                return;
            default:
                a3 a3Var3 = this.f15239b.d;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null && T.getParentLayout() != null) {
                    org.telegram.ui.ActionBar.q4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.A4(a3Var3.J));
                    org.telegram.messenger.g0.k3(parentLayout, "botPermissionLocation");
                    a3Var3.o(true);
                    return;
                }
                return;
        }
    }
}
