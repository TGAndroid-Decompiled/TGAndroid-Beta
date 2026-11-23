package hi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class u6 extends w6 {
    public final TLRPC.User f15523b;

    public u6(String str, TLRPC.User user) {
        super(str);
        this.f15523b = user;
    }

    @Override
    public final String a() {
        return gd.N0(2131743296, null);
    }

    @Override
    public final String b() {
        return n10.q(this.f15523b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.g2 g2Var) {
        TLRPC.User user = this.f15523b;
        if (user.f28641id == i10.i(i10.f24637t0).e()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28641id);
            bundle.putBoolean("my_profile", true);
            g2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        g2Var.presentFragment(ProfileActivity.D4(user.f28641id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        TLRPC.User user = this.f15523b;
        a9Var.r(user);
        imageReceiver.j0(user, a9Var, null);
    }
}
