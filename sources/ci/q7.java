package ci;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class q7 extends s7 {
    public final TLRPC.User f5384b;

    public q7(String str, TLRPC.User user) {
        super(str);
        this.f5384b = user;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override
    public final String b() {
        return UserObject.getUserName(this.f5384b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        TLRPC.User user = this.f5384b;
        if (user.f18476id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f18476id);
            bundle.putBoolean("my_profile", true);
            o2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        o2Var.presentFragment(ProfileActivity.m4(user.f18476id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.e6) null);
        TLRPC.User user = this.f5384b;
        h9Var.r(user);
        imageReceiver.setForUserOrChat(user, h9Var);
    }
}
