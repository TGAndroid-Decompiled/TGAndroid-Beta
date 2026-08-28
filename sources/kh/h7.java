package kh;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class h7 extends j7 {
    public final TLRPC.User f15399b;

    public h7(String str, TLRPC.User user) {
        super(str);
        this.f15399b = user;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override
    public final String b() {
        return UserObject.getUserName(this.f15399b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        TLRPC.User user = this.f15399b;
        if (user.f22527id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22527id);
            bundle.putBoolean("my_profile", true);
            o2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        o2Var.presentFragment(ProfileActivity.m4(user.f22527id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        TLRPC.User user = this.f15399b;
        z8Var.r(user);
        imageReceiver.setForUserOrChat(user, z8Var);
    }
}
