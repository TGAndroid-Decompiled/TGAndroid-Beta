package fi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class n6 extends p6 {
    public final TLRPC.User f12486b;

    public n6(String str, TLRPC.User user) {
        super(str);
        this.f12486b = user;
    }

    @Override
    public final String a() {
        return id.M0(2131743546, null);
    }

    @Override
    public final String b() {
        return t10.p(this.f12486b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.f2 f2Var) {
        TLRPC.User user = this.f12486b;
        if (user.f27109id == p10.i(p10.f24474s0).e()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f27109id);
            bundle.putBoolean("my_profile", true);
            f2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        f2Var.presentFragment(ProfileActivity.D4(user.f27109id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        TLRPC.User user = this.f12486b;
        v8Var.r(user);
        imageReceiver.i0(user, v8Var, null);
    }
}
