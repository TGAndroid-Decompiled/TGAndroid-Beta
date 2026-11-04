package gi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class o6 extends q6 {
    public final TLRPC.User f13334b;

    public o6(String str, TLRPC.User user) {
        super(str);
        this.f13334b = user;
    }

    @Override
    public final String a() {
        return bd.M0(2131743556, null);
    }

    @Override
    public final String b() {
        return l10.p(this.f13334b);
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.d2 d2Var) {
        TLRPC.User user = this.f13334b;
        if (user.f27150id == h10.i(h10.f22829t0).e()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f27150id);
            bundle.putBoolean("my_profile", true);
            d2Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        d2Var.presentFragment(ProfileActivity.A4(user.f27150id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        TLRPC.User user = this.f13334b;
        u8Var.r(user);
        imageReceiver.i0(user, u8Var, null);
    }
}
