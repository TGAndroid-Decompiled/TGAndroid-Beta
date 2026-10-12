package di;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class p7 extends r7 {
    public final TLRPC.User f7589b;

    public p7(String str, TLRPC.User user) {
        super(str);
        this.f7589b = user;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override
    public final String b() {
        return UserObject.getUserName(this.f7589b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.m2 m2Var) {
        TLRPC.User user = this.f7589b;
        if (user.f19363id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19363id);
            bundle.putBoolean("my_profile", true);
            m2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        m2Var.presentFragment(ProfileActivity.m4(user.f19363id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        TLRPC.User user = this.f7589b;
        k9Var.r(user);
        imageReceiver.setForUserOrChat(user, k9Var);
    }
}
