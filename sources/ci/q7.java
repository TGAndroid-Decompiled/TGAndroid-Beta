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
    public final TLRPC.User f5838b;

    public q7(String str, TLRPC.User user) {
        super(str);
        this.f5838b = user;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override
    public final String b() {
        return UserObject.getUserName(this.f5838b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.m2 m2Var) {
        TLRPC.User user = this.f5838b;
        if (user.f20215id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f20215id);
            bundle.putBoolean("my_profile", true);
            m2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        m2Var.presentFragment(ProfileActivity.m4(user.f20215id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
        TLRPC.User user = this.f5838b;
        j9Var.r(user);
        imageReceiver.setForUserOrChat(user, j9Var);
    }
}
