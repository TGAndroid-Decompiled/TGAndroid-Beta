package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public final class u2 implements Runnable {

    public final int f18987a;

    public final w2 f18988b;

    public u2(w2 w2Var, int i10) {
        this.f18987a = i10;
        this.f18988b = w2Var;
    }

    @Override
    public final void run() {
        switch (this.f18987a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                w2 w2Var = this.f18988b;
                b3 b3Var = w2Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(b3Var.C).getInputUser(b3Var.D);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(b3Var.C).sendRequest(toggleuseremojistatuspermission, new v2(w2Var, 1));
                break;
            case 1:
                b3 b3Var2 = this.f18988b.d;
                t0.e(b3Var2.getContext(), b3Var2.C, b3Var2.D).m(false, null);
                break;
            default:
                b3 b3Var3 = this.f18988b.d;
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null && n2VarU.getParentLayout() != null) {
                    b5 parentLayout = n2VarU.getParentLayout();
                    n2VarU.presentFragment(ProfileActivity.m4(b3Var3.D));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    b3Var3.k(true);
                    break;
                }
                break;
        }
    }
}
