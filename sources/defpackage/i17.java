package defpackage;

import android.location.Location;
import org.telegram.tgnet.TLRPC;
public final class i17 implements n7a {
    public final r17 a;

    public i17(r17 r17Var) {
        this.a = r17Var;
    }

    @Override
    public final void O() {
        this.a.Q();
    }

    @Override
    public final void T(Location location) {
        r17 r17Var = this.a;
        TLRPC.User user = r17Var.x0;
        if (user != null && user.bot_inline_geo) {
            r17Var.A0 = location;
            r17Var.T(true, user, r17Var.s0, "");
        }
    }
}
