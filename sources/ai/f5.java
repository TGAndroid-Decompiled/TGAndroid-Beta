package ai;

import android.os.Bundle;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gz;
import org.telegram.ui.wm;
public final class f5 extends wm {
    public boolean f648sd;
    public final TL_stars.TL_starGiftUnique f649td;
    public final long f650ud;

    public f5(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.f649td = tL_starGiftUnique;
        this.f650ud = j10;
        this.f648sd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f648sd) {
            this.f648sd = true;
            ac O = fc.a0(this).O(this.f649td.getDocument(), bd.M0(2131752885, null), bd.a0(null, null, 2131752886, org.telegram.messenger.m5.s(this.currentAccount, this.f650ud)));
            O.f31800r = false;
            O.j();
            gz gzVar = this.G9;
            if (gzVar != null) {
                gzVar.c(true);
            }
        }
    }
}
