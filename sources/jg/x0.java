package jg;

import android.location.Location;
import org.telegram.messenger.wy;
import org.telegram.tgnet.TLRPC;
public final class x0 implements wy {
    public final h1 f17743a;

    public x0(h1 h1Var) {
        this.f17743a = h1Var;
    }

    @Override
    public final void b() {
        this.f17743a.Q();
    }

    @Override
    public final void f(Location location) {
        h1 h1Var = this.f17743a;
        TLRPC.User user = h1Var.f17558x0;
        if (user != null && user.bot_inline_geo) {
            h1Var.A0 = location;
            h1Var.T(true, user, h1Var.f17551s0, "");
        }
    }
}
