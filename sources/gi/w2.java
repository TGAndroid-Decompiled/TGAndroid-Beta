package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class w2 implements Runnable {
    public final int f11531a;
    public final y2 f11532b;

    public w2(y2 y2Var, int i10) {
        this.f11531a = i10;
        this.f11532b = y2Var;
    }

    @Override
    public final void run() {
        switch (this.f11531a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                y2 y2Var = this.f11532b;
                d3 d3Var = y2Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(d3Var.G).getInputUser(d3Var.H);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(d3Var.G).sendRequest(toggleuseremojistatuspermission, new x2(y2Var, 1));
                return;
            case 1:
                d3 d3Var2 = this.f11532b.d;
                u0.e(d3Var2.getContext(), d3Var2.G, d3Var2.H).l(false, null);
                return;
            default:
                d3 d3Var3 = this.f11532b.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    d5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(d3Var3.H));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    d3Var3.k(true);
                    return;
                }
                return;
        }
    }
}
