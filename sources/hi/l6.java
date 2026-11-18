package hi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class l6 extends n6 {
    public final TLRPC.User f14943b;

    public l6(String str, TLRPC.User user) {
        super(str);
        this.f14943b = user;
    }

    @Override
    public final String a() {
        return gd.M0(2131743309, null);
    }

    @Override
    public final String b() {
        return o10.q(this.f14943b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.h2 h2Var) {
        TLRPC.User user = this.f14943b;
        if (user.f28554id == j10.i(j10.f24773t0).e()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28554id);
            bundle.putBoolean("my_profile", true);
            h2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        h2Var.presentFragment(ProfileActivity.D4(user.f28554id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        TLRPC.User user = this.f14943b;
        b9Var.r(user);
        imageReceiver.i0(user, b9Var, null);
    }
}
