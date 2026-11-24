package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class vx1 extends mu1 {
    public boolean vd;
    public final TLRPC.User wd;
    public final TLRPC.User xd;
    public final long yd;

    public vx1(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j) {
        super(bundle);
        this.wd = user;
        this.xd = user2;
        this.yd = j;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.vd) {
            this.vd = true;
            u21.b0(this).I(2131623990, k96.a0(null, null, 2131751727, l7c.q(this.wd)), gl.O2(k96.a0(null, null, 2131751728, l7c.q(this.xd)), -1, 0, new et(this, this.yd, (byte) 6), null)).j();
        }
    }
}
