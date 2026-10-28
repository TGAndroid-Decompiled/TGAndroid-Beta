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
    public final TLRPC.User f10726b;

    public d7(String str, TLRPC.User user) {
        super(str);
        this.f10726b = user;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override
    public final String b() {
        return UserObject.getUserName(this.f10726b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.r2 r2Var) {
        TLRPC.User user = this.f10726b;
        if (user.f22177id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22177id);
            bundle.putBoolean("my_profile", true);
            r2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        r2Var.presentFragment(ProfileActivity.t4(user.f22177id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        TLRPC.User user = this.f10726b;
        j9Var.r(user);
        imageReceiver.setForUserOrChat(user, j9Var);
    }
}
