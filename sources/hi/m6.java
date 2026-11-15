package hi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class m6 extends o6 {
    public final TLRPC.User f14704b;

    public m6(String str, TLRPC.User user) {
        super(str);
        this.f14704b = user;
    }

    @Override
    public final String a() {
        return hd.M0(2131743546, null);
    }

    @Override
    public final String b() {
        return q10.p(this.f14704b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.e2 e2Var) {
        TLRPC.User user = this.f14704b;
        if (user.f28200id == m10.i(m10.f24934t0).e()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28200id);
            bundle.putBoolean("my_profile", true);
            e2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        e2Var.presentFragment(ProfileActivity.C4(user.f28200id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        TLRPC.User user = this.f14704b;
        t8Var.r(user);
        imageReceiver.i0(user, t8Var, null);
    }
}
