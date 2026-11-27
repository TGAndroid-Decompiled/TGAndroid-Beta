package defpackage;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class au9 extends cu9 {
    public final TLRPC.User b;

    public au9(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override
    public final String b() {
        return lbc.r(this.b);
    }

    @Override
    public final void c(e eVar) {
        TLRPC.User user = this.b;
        if (user.id == yac.h(yac.t0).e()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            bundle.putBoolean("my_profile", true);
            eVar.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        eVar.presentFragment(ProfileActivity.Q2(user.id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        rb0 rb0Var = new rb0((vnb) null);
        TLRPC.User user = this.b;
        rb0Var.q(user);
        imageReceiver.U(user, rb0Var, null);
    }
}
