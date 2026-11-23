package bi;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.wz;
import org.telegram.ui.bn;
public final class h7 extends bn {
    public boolean f3709vd;
    public final TL_stars.TL_starGiftUnique f3710wd;
    public final long f3711xd;

    public h7(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.f3710wd = tL_starGiftUnique;
        this.f3711xd = j3;
        this.f3709vd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f3709vd) {
            this.f3709vd = true;
            gc O = lc.b0(this).O(this.f3710wd.getDocument(), hd.N0(2131752873, null), hd.a0(null, null, 2131752874, org.telegram.messenger.n5.s(this.currentAccount, this.f3711xd)));
            O.f35535r = false;
            O.j();
            wz wzVar = this.J9;
            if (wzVar != null) {
                wzVar.c(true);
            }
        }
    }
}
