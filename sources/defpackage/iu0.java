package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class iu0 extends mu1 {
    public boolean wd;
    public final TLRPC.User xd;
    public final long yd;
    public final hv0 zd;

    public iu0(hv0 hv0Var, Bundle bundle, TLRPC.User user, long j) {
        super(bundle);
        this.zd = hv0Var;
        this.xd = user;
        this.yd = j;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.wd) {
            this.wd = true;
            u21.b0(this).I(2131623990, k96.a0(null, null, 2131751727, l7c.r(this.xd)), gl.N2(k96.a0(null, null, 2131751728, l7c.r(this.zd.V)), -1, 0, new et(this, this.yd, (byte) 3), null)).j();
        }
    }
}
