package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class f3 implements Runnable {
    public final int f6628a;
    public final i3 f6629b;

    public f3(i3 i3Var, int i10) {
        this.f6628a = i10;
        this.f6629b = i3Var;
    }

    @Override
    public final void run() {
        switch (this.f6628a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                i3 i3Var = this.f6629b;
                n3 n3Var = i3Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(n3Var.G).getInputUser(n3Var.H);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(n3Var.G).sendRequest(toggleuseremojistatuspermission, new g3(i3Var, 1));
                return;
            case 1:
                n3 n3Var2 = this.f6629b.d;
                z0.e(n3Var2.getContext(), n3Var2.G, n3Var2.H).m(false, null);
                return;
            default:
                n3 n3Var3 = this.f6629b.d;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    org.telegram.ui.ActionBar.f5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(n3Var3.H));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    n3Var3.k(true);
                    return;
                }
                return;
        }
    }
}
