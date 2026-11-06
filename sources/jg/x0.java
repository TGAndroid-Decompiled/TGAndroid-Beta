package jg;

import android.location.Location;
import org.telegram.messenger.cz;
import org.telegram.tgnet.TLRPC;
public final class x0 implements cz {
    public final i1 f16977a;

    public x0(i1 i1Var) {
        this.f16977a = i1Var;
    }

    @Override
    public final void C() {
        this.f16977a.Q();
    }

    @Override
    public final void K(Location location) {
        i1 i1Var = this.f16977a;
        TLRPC.User user = i1Var.f16799w0;
        if (user != null && user.bot_inline_geo) {
            i1Var.f16804z0 = location;
            i1Var.T(true, user, i1Var.f16792r0, "");
        }
    }
}
