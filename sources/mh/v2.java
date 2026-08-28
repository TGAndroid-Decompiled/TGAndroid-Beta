package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class v2 implements Runnable {
    public final int f18167a;
    public final x2 f18168b;

    public v2(x2 x2Var, int i9) {
        this.f18167a = i9;
        this.f18168b = x2Var;
    }

    @Override
    public final void run() {
        switch (this.f18167a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                x2 x2Var = this.f18168b;
                c3 c3Var = x2Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(c3Var.C).getInputUser(c3Var.D);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(c3Var.C).sendRequest(toggleuseremojistatuspermission, new w2(x2Var, 1));
                return;
            case 1:
                c3 c3Var2 = this.f18168b.d;
                u0.e(c3Var2.getContext(), c3Var2.C, c3Var2.D).m(false, null);
                return;
            default:
                c3 c3Var3 = this.f18168b.d;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    b5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(c3Var3.D));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    c3Var3.k(true);
                    return;
                }
                return;
        }
    }
}
