package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class c3 implements Runnable {
    public final int f9594a;
    public final f3 f9595b;

    public c3(f3 f3Var, int i10) {
        this.f9594a = i10;
        this.f9595b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f9594a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                f3 f3Var = this.f9595b;
                k3 k3Var = f3Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(k3Var.G).getInputUser(k3Var.H);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(k3Var.G).sendRequest(toggleuseremojistatuspermission, new d3(f3Var, 1));
                return;
            case 1:
                k3 k3Var2 = this.f9595b.d;
                w0.e(k3Var2.getContext(), k3Var2.G, k3Var2.H).m(false, null);
                return;
            default:
                k3 k3Var3 = this.f9595b.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    org.telegram.ui.ActionBar.d5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(k3Var3.H));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    k3Var3.k(true);
                    return;
                }
                return;
        }
    }
}
