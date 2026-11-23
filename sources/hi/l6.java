package hi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class l6 extends n6 {
    public final TLRPC.User f14930b;

    public l6(String str, TLRPC.User user) {
        super(str);
        this.f14930b = user;
    }

    @Override
    public final String a() {
        return hd.N0(2131743303, null);
    }

    @Override
    public final String b() {
        return p10.q(this.f14930b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.g2 g2Var) {
        TLRPC.User user = this.f14930b;
        if (user.f28547id == k10.i(k10.f24932t0).e()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28547id);
            bundle.putBoolean("my_profile", true);
            g2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        g2Var.presentFragment(ProfileActivity.D4(user.f28547id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        TLRPC.User user = this.f14930b;
        b9Var.r(user);
        imageReceiver.i0(user, b9Var, null);
    }
}
