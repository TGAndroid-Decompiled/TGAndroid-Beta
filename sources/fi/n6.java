package fi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class n6 extends p6 {
    public final TLRPC.User f12482b;

    public n6(String str, TLRPC.User user) {
        super(str);
        this.f12482b = user;
    }

    @Override
    public final String a() {
        return hd.M0(2131743547, null);
    }

    @Override
    public final String b() {
        return t10.p(this.f12482b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.f2 f2Var) {
        TLRPC.User user = this.f12482b;
        if (user.f27102id == p10.i(p10.f24467s0).e()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f27102id);
            bundle.putBoolean("my_profile", true);
            f2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        f2Var.presentFragment(ProfileActivity.A4(user.f27102id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        TLRPC.User user = this.f12482b;
        w8Var.r(user);
        imageReceiver.i0(user, w8Var, null);
    }
}
