package di;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class t7 extends v7 {
    public final TLRPC.User f8229b;

    public t7(String str, TLRPC.User user) {
        super(str);
        this.f8229b = user;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override
    public final String b() {
        return UserObject.getUserName(this.f8229b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.n2 n2Var) {
        TLRPC.User user = this.f8229b;
        if (user.f20043id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f20043id);
            bundle.putBoolean("my_profile", true);
            n2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        n2Var.presentFragment(ProfileActivity.m4(user.f20043id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.User user = this.f8229b;
        i9Var.r(user);
        imageReceiver.setForUserOrChat(user, i9Var);
    }
}
