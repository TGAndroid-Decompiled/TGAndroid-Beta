package bi;

import android.os.Bundle;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.wz;
import org.telegram.ui.bn;
public final class i7 extends bn {
    public boolean f3726vd;
    public final TL_stars.TL_starGiftUnique f3727wd;
    public final long f3728xd;

    public i7(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.f3727wd = tL_starGiftUnique;
        this.f3728xd = j3;
        this.f3726vd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f3726vd) {
            this.f3726vd = true;
            gc O = lc.b0(this).O(this.f3727wd.getDocument(), gd.N0(2131752873, null), gd.a0(null, null, 2131752874, org.telegram.messenger.n5.s(this.currentAccount, this.f3728xd)));
            O.f35516r = false;
            O.j();
            wz wzVar = this.J9;
            if (wzVar != null) {
                wzVar.c(true);
            }
        }
    }
}
