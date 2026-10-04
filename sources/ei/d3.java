package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class d3 implements Runnable {
    public final int f9000a;
    public final g3 f9001b;

    public d3(g3 g3Var, int i10) {
        this.f9000a = i10;
        this.f9001b = g3Var;
    }

    @Override
    public final void run() {
        switch (this.f9000a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                g3 g3Var = this.f9001b;
                l3 l3Var = g3Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(l3Var.G).getInputUser(l3Var.H);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(l3Var.G).sendRequest(toggleuseremojistatuspermission, new e3(g3Var, 1));
                return;
            case 1:
                l3 l3Var2 = this.f9001b.d;
                x0.e(l3Var2.getContext(), l3Var2.G, l3Var2.H).m(false, null);
                return;
            default:
                l3 l3Var3 = this.f9001b.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    org.telegram.ui.ActionBar.c5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(l3Var3.H));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    l3Var3.k(true);
                    return;
                }
                return;
        }
    }
}
