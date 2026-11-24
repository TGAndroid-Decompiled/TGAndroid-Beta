package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class rv0 extends yv1 {
    public boolean Gd;
    public final TLRPC.User Hd;
    public final long Id;
    public final qw0 Jd;

    public rv0(qw0 qw0Var, Bundle bundle, TLRPC.User user, long j) {
        super(bundle);
        this.Jd = qw0Var;
        this.Hd = user;
        this.Id = j;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Gd) {
            this.Gd = true;
            c41.b0(this).I(2131623990, jb6.a0(null, null, 2131751676, m9c.r(this.Hd)), gm.N2(jb6.a0(null, null, 2131751677, m9c.r(this.Jd.V)), -1, 0, new fu(this, this.Id, (byte) 3), null)).j();
        }
    }
}
