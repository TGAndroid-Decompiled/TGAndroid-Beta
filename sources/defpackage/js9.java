package defpackage;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class js9 extends ls9 {
    public final TLRPC.User b;

    public js9(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override
    public final String b() {
        return m9c.r(this.b);
    }

    @Override
    public final void c(d dVar) {
        TLRPC.User user = this.b;
        if (user.id == z8c.h(z8c.t0).e()) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            bundle.putBoolean("my_profile", true);
            dVar.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        dVar.presentFragment(ProfileActivity.S2(user.id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        pc0 pc0Var = new pc0((ylb) null);
        TLRPC.User user = this.b;
        pc0Var.q(user);
        imageReceiver.U(user, pc0Var, null);
    }
}
