package bi;

import android.os.Bundle;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.tz;
import org.telegram.ui.bn;
public final class k7 extends bn {
    public boolean f3761vd;
    public final TL_stars.TL_starGiftUnique f3762wd;
    public final long f3763xd;

    public k7(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.f3762wd = tL_starGiftUnique;
        this.f3763xd = j3;
        this.f3761vd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f3761vd) {
            this.f3761vd = true;
            fc O = kc.b0(this).O(this.f3762wd.getDocument(), gd.N0(2131752873, null), gd.a0(null, null, 2131752874, org.telegram.messenger.n5.s(this.currentAccount, this.f3763xd)));
            O.f35099r = false;
            O.j();
            tz tzVar = this.J9;
            if (tzVar != null) {
                tzVar.c(true);
            }
        }
    }
}
