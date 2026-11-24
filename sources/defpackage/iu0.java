package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class iu0 extends mu1 {
    public boolean vd;
    public final TLRPC.User wd;
    public final long xd;
    public final hv0 yd;

    public iu0(hv0 hv0Var, Bundle bundle, TLRPC.User user, long j) {
        super(bundle);
        this.yd = hv0Var;
        this.wd = user;
        this.xd = j;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.vd) {
            this.vd = true;
            u21.b0(this).I(2131623990, k96.a0(null, null, 2131751727, l7c.q(this.wd)), gl.O2(k96.a0(null, null, 2131751728, l7c.q(this.yd.V)), -1, 0, new et(this, this.xd, (byte) 3), null)).j();
        }
    }
}
