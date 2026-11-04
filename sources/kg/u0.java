package kg;

import android.location.Location;
import org.telegram.messenger.uy;
import org.telegram.tgnet.TLRPC;
public final class u0 implements uy {
    public final e1 f17201a;

    public u0(e1 e1Var) {
        this.f17201a = e1Var;
    }

    @Override
    public final void B(Location location) {
        e1 e1Var = this.f17201a;
        TLRPC.User user = e1Var.f17020x0;
        if (user != null && user.bot_inline_geo) {
            e1Var.A0 = location;
            e1Var.T(true, user, e1Var.f17013s0, "");
        }
    }

    @Override
    public final void y() {
        this.f17201a.Q();
    }
}
