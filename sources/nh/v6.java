package nh;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class v6 extends x6 {
    public final TLRPC.User f18759b;

    public v6(String str, TLRPC.User user) {
        super(str);
        this.f18759b = user;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override
    public final String b() {
        return UserObject.getUserName(this.f18759b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        TLRPC.User user = this.f18759b;
        if (user.f22539id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22539id);
            bundle.putBoolean("my_profile", true);
            o2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        o2Var.presentFragment(ProfileActivity.m4(user.f22539id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        TLRPC.User user = this.f18759b;
        e9Var.r(user);
        imageReceiver.setForUserOrChat(user, e9Var);
    }
}
