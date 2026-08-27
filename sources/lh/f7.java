package lh;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

public final class f7 extends h7 {

    public final TLRPC.User f16007b;

    public f7(String str, TLRPC.User user) {
        super(str);
        this.f16007b = user;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override
    public final String b() {
        return UserObject.getUserName(this.f16007b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.n2 n2Var) {
        TLRPC.User user = this.f16007b;
        if (user.f22527id != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            n2Var.presentFragment(ProfileActivity.m4(user.f22527id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f22527id);
        bundle.putBoolean("my_profile", true);
        n2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        TLRPC.User user = this.f16007b;
        y8Var.r(user);
        imageReceiver.setForUserOrChat(user, y8Var);
    }
}
