package fi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class d7 extends f7 {
    public final TLRPC.User f10727b;

    public d7(String str, TLRPC.User user) {
        super(str);
        this.f10727b = user;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override
    public final String b() {
        return UserObject.getUserName(this.f10727b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.r2 r2Var) {
        TLRPC.User user = this.f10727b;
        if (user.f22176id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22176id);
            bundle.putBoolean("my_profile", true);
            r2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        r2Var.presentFragment(ProfileActivity.t4(user.f22176id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        TLRPC.User user = this.f10727b;
        j9Var.r(user);
        imageReceiver.setForUserOrChat(user, j9Var);
    }
}
