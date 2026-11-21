package hi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class k6 extends m6 {
    public final TLRPC.User f14915b;

    public k6(String str, TLRPC.User user) {
        super(str);
        this.f14915b = user;
    }

    @Override
    public final String a() {
        return gd.N0(2131743303, null);
    }

    @Override
    public final String b() {
        return o10.q(this.f14915b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.g2 g2Var) {
        TLRPC.User user = this.f14915b;
        if (user.f28580id == j10.i(j10.f24798t0).e()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28580id);
            bundle.putBoolean("my_profile", true);
            g2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        g2Var.presentFragment(ProfileActivity.D4(user.f28580id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        TLRPC.User user = this.f14915b;
        b9Var.r(user);
        imageReceiver.i0(user, b9Var, null);
    }
}
