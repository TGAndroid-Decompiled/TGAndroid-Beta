package defpackage;

import android.location.Location;
import org.telegram.tgnet.TLRPC;
public final class bz6 implements v3a {
    public final kz6 a;

    public bz6(kz6 kz6Var) {
        this.a = kz6Var;
    }

    @Override
    public final void S() {
        this.a.Q();
    }

    @Override
    public final void X(Location location) {
        kz6 kz6Var = this.a;
        TLRPC.User user = kz6Var.x0;
        if (user != null && user.bot_inline_geo) {
            kz6Var.A0 = location;
            kz6Var.T(true, user, kz6Var.s0, "");
        }
    }
}
