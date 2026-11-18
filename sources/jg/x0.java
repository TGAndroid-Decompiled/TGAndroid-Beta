package jg;

import android.location.Location;
import org.telegram.messenger.vy;
import org.telegram.tgnet.TLRPC;
public final class x0 implements vy {
    public final h1 f17718a;

    public x0(h1 h1Var) {
        this.f17718a = h1Var;
    }

    @Override
    public final void b() {
        this.f17718a.Q();
    }

    @Override
    public final void f(Location location) {
        h1 h1Var = this.f17718a;
        TLRPC.User user = h1Var.f17533x0;
        if (user != null && user.bot_inline_geo) {
            h1Var.A0 = location;
            h1Var.T(true, user, h1Var.f17526s0, "");
        }
    }
}
