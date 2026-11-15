package bi;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.xb;
import org.telegram.ui.an;
public final class w4 extends an {
    public boolean f3960ud;
    public final TL_stars.TL_starGiftUnique f3961vd;
    public final long f3962wd;

    public w4(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.f3961vd = tL_starGiftUnique;
        this.f3962wd = j3;
        this.f3960ud = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f3960ud) {
            this.f3960ud = true;
            xb O = cc.a0(this).O(this.f3961vd.getDocument(), hd.M0(2131752885, null), hd.a0(null, null, 2131752886, org.telegram.messenger.m5.s(this.currentAccount, this.f3962wd)));
            O.f41643r = false;
            O.j();
            nz nzVar = this.I9;
            if (nzVar != null) {
                nzVar.c(true);
            }
        }
    }
}
