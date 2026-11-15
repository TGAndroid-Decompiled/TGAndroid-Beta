package jg;

import android.location.Location;
import org.telegram.messenger.az;
import org.telegram.tgnet.TLRPC;
public final class x0 implements az {
    public final h1 f17332a;

    public x0(h1 h1Var) {
        this.f17332a = h1Var;
    }

    @Override
    public final void c() {
        this.f17332a.Q();
    }

    @Override
    public final void f(Location location) {
        h1 h1Var = this.f17332a;
        TLRPC.User user = h1Var.f17147x0;
        if (user != null && user.bot_inline_geo) {
            h1Var.A0 = location;
            h1Var.T(true, user, h1Var.f17140s0, "");
        }
    }
}
