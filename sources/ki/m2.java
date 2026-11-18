package ki;

import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class m2 implements Runnable {
    public final int f18789a;
    public final o2 f18790b;

    public m2(o2 o2Var, int i7) {
        this.f18789a = i7;
        this.f18790b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f18789a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                o2 o2Var = this.f18790b;
                t2 t2Var = o2Var.d;
                toggleuseremojistatuspermission.bot = mp.u1(t2Var.I).q1(t2Var.J);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(t2Var.I).sendRequest(toggleuseremojistatuspermission, new n2(o2Var, 1));
                return;
            case 1:
                t2 t2Var2 = this.f18790b.d;
                s0.e(t2Var2.getContext(), t2Var2.I, t2Var2.J).l(false, null);
                return;
            default:
                t2 t2Var3 = this.f18790b.d;
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null && T.getParentLayout() != null) {
                    s4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.D4(t2Var3.J));
                    org.telegram.messenger.g0.j3(parentLayout, "botPermissionLocation");
                    t2Var3.o(true);
                    return;
                }
                return;
        }
    }
}
