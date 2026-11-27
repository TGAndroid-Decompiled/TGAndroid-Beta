package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class ly1 extends zu1 {
    public boolean Jd;
    public final TLRPC.User Kd;
    public final TLRPC.User Ld;
    public final long Md;

    public ly1(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j) {
        super(bundle);
        this.Kd = user;
        this.Ld = user2;
        this.Md = j;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Jd) {
            this.Jd = true;
            d31.b0(this).I(2131623990, ob6.a0(null, null, 2131751704, lbc.r(this.Kd)), hl.N2(ob6.a0(null, null, 2131751705, lbc.r(this.Ld)), -1, 0, new kt(this, this.Md, (byte) 6), null)).j();
        }
    }
}
