package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class c3 implements Runnable {
    public final int f9210a;
    public final f3 f9211b;

    public c3(f3 f3Var, int i10) {
        this.f9210a = i10;
        this.f9211b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f9210a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                f3 f3Var = this.f9211b;
                k3 k3Var = f3Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(k3Var.G).getInputUser(k3Var.H);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(k3Var.G).sendRequest(toggleuseremojistatuspermission, new d3(f3Var, 1));
                return;
            case 1:
                k3 k3Var2 = this.f9211b.d;
                v0.e(k3Var2.getContext(), k3Var2.G, k3Var2.H).l(false, null);
                return;
            default:
                k3 k3Var3 = this.f9211b.d;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    org.telegram.ui.ActionBar.b5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(k3Var3.H));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    k3Var3.k(true);
                    return;
                }
                return;
        }
    }
}
