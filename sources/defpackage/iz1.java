package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class iz1 extends yv1 {
    public boolean Gd;
    public final TLRPC.User Hd;
    public final TLRPC.User Id;
    public final long Jd;

    public iz1(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j) {
        super(bundle);
        this.Hd = user;
        this.Id = user2;
        this.Jd = j;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Gd) {
            this.Gd = true;
            c41.b0(this).I(2131623990, jb6.a0(null, null, 2131751676, m9c.r(this.Hd)), gm.N2(jb6.a0(null, null, 2131751677, m9c.r(this.Id)), -1, 0, new fu(this, this.Jd, (byte) 6), null)).j();
        }
    }
}
