package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class ru0 extends zu1 {
    public boolean Jd;
    public final TLRPC.User Kd;
    public final long Ld;
    public final rv0 Md;

    public ru0(rv0 rv0Var, Bundle bundle, TLRPC.User user, long j) {
        super(bundle);
        this.Md = rv0Var;
        this.Kd = user;
        this.Ld = j;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Jd) {
            this.Jd = true;
            d31.b0(this).I(2131623990, ob6.a0(null, null, 2131751704, lbc.r(this.Kd)), hl.N2(ob6.a0(null, null, 2131751705, lbc.r(this.Md.V)), -1, 0, new kt(this, this.Ld, (byte) 3), null)).j();
        }
    }
}
