package ki;

import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class q2 implements Runnable {
    public final int f18508a;
    public final s2 f18509b;

    public q2(s2 s2Var, int i7) {
        this.f18508a = i7;
        this.f18509b = s2Var;
    }

    @Override
    public final void run() {
        switch (this.f18508a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                s2 s2Var = this.f18509b;
                x2 x2Var = s2Var.d;
                toggleuseremojistatuspermission.bot = np.s1(x2Var.I).o1(x2Var.J);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(x2Var.I).sendRequest(toggleuseremojistatuspermission, new r2(s2Var, 1));
                return;
            case 1:
                x2 x2Var2 = this.f18509b.d;
                s0.e(x2Var2.getContext(), x2Var2.I, x2Var2.J).l(false, null);
                return;
            default:
                x2 x2Var3 = this.f18509b.d;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null && T.getParentLayout() != null) {
                    o4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.C4(x2Var3.J));
                    org.telegram.messenger.g0.k3(parentLayout, "botPermissionLocation");
                    x2Var3.o(true);
                    return;
                }
                return;
        }
    }
}
