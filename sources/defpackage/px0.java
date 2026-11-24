package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class px0 implements Runnable {
    public final byte a;
    public final rx0 b;

    public px0(rx0 rx0Var, byte b) {
        this.a = b;
        this.b = rx0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        rx0 rx0Var = this.b;
        switch (b) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                wx0 wx0Var = rx0Var.d;
                toggleuseremojistatuspermission.bot = oc7.r1(wx0Var.I).n1(wx0Var.J);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(wx0Var.I).sendRequest(toggleuseremojistatuspermission, new qx0(rx0Var, (byte) 1));
                return;
            case 1:
                wx0 wx0Var2 = rx0Var.d;
                tr0.d(wx0Var2.getContext(), wx0Var2.I, wx0Var2.J).k(false, null);
                return;
            default:
                wx0 wx0Var3 = rx0Var.d;
                d S = LaunchActivity.S();
                if (S != null && S.getParentLayout() != null) {
                    tk5 parentLayout = S.getParentLayout();
                    S.presentFragment(ProfileActivity.S2(wx0Var3.J));
                    gm.f3(parentLayout, "botPermissionLocation");
                    wx0Var3.m(true);
                    return;
                }
                return;
        }
    }
}
