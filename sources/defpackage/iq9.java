package defpackage;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class iq9 extends kq9 {
    public final TLRPC.User b;

    public iq9(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override
    public final String b() {
        return l7c.r(this.b);
    }

    @Override
    public final void c(d dVar) {
        TLRPC.User user = this.b;
        if (user.id == y6c.h(y6c.t0).e()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            bundle.putBoolean("my_profile", true);
            dVar.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        dVar.presentFragment(ProfileActivity.P2(user.id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        pb0 pb0Var = new pb0((wjb) null);
        TLRPC.User user = this.b;
        pb0Var.q(user);
        imageReceiver.U(user, pb0Var, null);
    }
}
