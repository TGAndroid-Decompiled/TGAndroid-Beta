package ki;

import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class l2 implements Runnable {
    public final int f18796a;
    public final n2 f18797b;

    public l2(n2 n2Var, int i7) {
        this.f18796a = i7;
        this.f18797b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f18796a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                n2 n2Var = this.f18797b;
                s2 s2Var = n2Var.d;
                toggleuseremojistatuspermission.bot = mp.u1(s2Var.I).q1(s2Var.J);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(s2Var.I).sendRequest(toggleuseremojistatuspermission, new m2(n2Var, 1));
                return;
            case 1:
                s2 s2Var2 = this.f18797b.d;
                r0.e(s2Var2.getContext(), s2Var2.I, s2Var2.J).l(false, null);
                return;
            default:
                s2 s2Var3 = this.f18797b.d;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null && T.getParentLayout() != null) {
                    r4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.D4(s2Var3.J));
                    org.telegram.messenger.g0.j3(parentLayout, "botPermissionLocation");
                    s2Var3.o(true);
                    return;
                }
                return;
        }
    }
}
