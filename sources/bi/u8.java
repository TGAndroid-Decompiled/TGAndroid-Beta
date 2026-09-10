package bi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class u8 extends w8 {
    public final TLRPC.User f3731b;

    public u8(String str, TLRPC.User user) {
        super(str);
        this.f3731b = user;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override
    public final String b() {
        return UserObject.getUserName(this.f3731b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.p2 p2Var) {
        TLRPC.User user = this.f3731b;
        if (user.f17342id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f17342id);
            bundle.putBoolean("my_profile", true);
            p2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        p2Var.presentFragment(ProfileActivity.m4(user.f17342id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.User user = this.f3731b;
        g9Var.r(user);
        imageReceiver.setForUserOrChat(user, g9Var);
    }
}
