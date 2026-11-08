package jg;

import android.location.Location;
import org.telegram.messenger.cz;
import org.telegram.tgnet.TLRPC;
public final class x0 implements cz {
    public final i1 f16980a;

    public x0(i1 i1Var) {
        this.f16980a = i1Var;
    }

    @Override
    public final void C() {
        this.f16980a.Q();
    }

    @Override
    public final void K(Location location) {
        i1 i1Var = this.f16980a;
        TLRPC.User user = i1Var.f16802w0;
        if (user != null && user.bot_inline_geo) {
            i1Var.f16807z0 = location;
            i1Var.T(true, user, i1Var.f16795r0, "");
        }
    }
}
