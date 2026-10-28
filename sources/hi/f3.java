package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class f3 implements Runnable {
    public final int f12982a;
    public final h3 f12983b;

    public f3(h3 h3Var, int i10) {
        this.f12982a = i10;
        this.f12983b = h3Var;
    }

    @Override
    public final void run() {
        switch (this.f12982a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                h3 h3Var = this.f12983b;
                m3 m3Var = h3Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(m3Var.H).getInputUser(m3Var.I);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(m3Var.H).sendRequest(toggleuseremojistatuspermission, new g3(h3Var, 1));
                return;
            case 1:
                m3 m3Var2 = this.f12983b.d;
                b1.e(m3Var2.getContext(), m3Var2.H, m3Var2.I).l(false, null);
                return;
            default:
                m3 m3Var3 = this.f12983b.d;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    j5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.t4(m3Var3.I));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    m3Var3.k(true);
                    return;
                }
                return;
        }
    }
}
