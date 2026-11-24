package defpackage;

import android.location.Location;
import org.telegram.tgnet.TLRPC;
public final class b17 implements w5a {
    public final k17 a;

    public b17(k17 k17Var) {
        this.a = k17Var;
    }

    @Override
    public final void Q() {
        this.a.Q();
    }

    @Override
    public final void U(Location location) {
        k17 k17Var = this.a;
        TLRPC.User user = k17Var.x0;
        if (user != null && user.bot_inline_geo) {
            k17Var.A0 = location;
            k17Var.T(true, user, k17Var.s0, "");
        }
    }
}
