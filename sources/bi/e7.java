package bi;

import android.os.Bundle;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.uz;
import org.telegram.ui.bn;
public final class e7 extends bn {
    public boolean f3549vd;
    public final TL_stars.TL_starGiftUnique f3550wd;
    public final long f3551xd;

    public e7(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.f3550wd = tL_starGiftUnique;
        this.f3551xd = j3;
        this.f3549vd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f3549vd) {
            this.f3549vd = true;
            gc O = lc.b0(this).O(this.f3550wd.getDocument(), gd.M0(2131752874, null), gd.a0(null, null, 2131752875, org.telegram.messenger.n5.s(this.currentAccount, this.f3551xd)));
            O.f35469r = false;
            O.j();
            uz uzVar = this.J9;
            if (uzVar != null) {
                uzVar.c(true);
            }
        }
    }
}
