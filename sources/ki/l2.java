package ki;

import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class l2 implements Runnable {
    public final int f18868a;
    public final o2 f18869b;

    public l2(o2 o2Var, int i7) {
        this.f18868a = i7;
        this.f18869b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f18868a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                o2 o2Var = this.f18869b;
                t2 t2Var = o2Var.d;
                toggleuseremojistatuspermission.bot = mp.u1(t2Var.I).q1(t2Var.J);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(t2Var.I).sendRequest(toggleuseremojistatuspermission, new m2(o2Var, 1));
                return;
            case 1:
                t2 t2Var2 = this.f18869b.d;
                r0.e(t2Var2.getContext(), t2Var2.I, t2Var2.J).l(false, null);
                return;
            default:
                t2 t2Var3 = this.f18869b.d;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null && T.getParentLayout() != null) {
                    r4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.D4(t2Var3.J));
                    org.telegram.messenger.g0.j3(parentLayout, "botPermissionLocation");
                    t2Var3.o(true);
                    return;
                }
                return;
        }
    }
}
