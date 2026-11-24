package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class vx1 extends mu1 {
    public boolean wd;
    public final TLRPC.User xd;
    public final TLRPC.User yd;
    public final long zd;

    public vx1(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j) {
        super(bundle);
        this.xd = user;
        this.yd = user2;
        this.zd = j;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.wd) {
            this.wd = true;
            u21.b0(this).I(2131623990, k96.a0(null, null, 2131751727, l7c.r(this.xd)), gl.N2(k96.a0(null, null, 2131751728, l7c.r(this.yd)), -1, 0, new et(this, this.zd, (byte) 6), null)).j();
        }
    }
}
