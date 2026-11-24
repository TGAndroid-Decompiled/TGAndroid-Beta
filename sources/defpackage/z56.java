package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class z56 extends yv1 {
    public boolean Gd;
    public final TLRPC.User Hd;
    public final TLRPC.User[] Id;
    public final long Jd;

    public z56(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j) {
        super(bundle);
        this.Hd = user;
        this.Id = userArr;
        this.Jd = j;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Gd) {
            this.Gd = true;
            c41.b0(this).I(2131623990, jb6.a0(null, null, 2131751676, m9c.r(this.Hd)), gm.N2(jb6.a0(null, null, 2131751677, m9c.r(this.Id[0])), -1, 0, new fu(this, this.Jd, (byte) 18), null)).j();
        }
    }
}
