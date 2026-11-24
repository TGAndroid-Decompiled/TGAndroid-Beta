package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
public final class c99 extends mu1 {
    public boolean wd;
    public final TL_stars.TL_starGiftUnique xd;
    public final long yd;

    public c99(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        super(bundle);
        this.xd = tL_starGiftUnique;
        this.yd = j;
        this.wd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.wd) {
            this.wd = true;
            m21 O = u21.b0(this).O(this.xd.getDocument(), k96.M0(2131752873, null), k96.a0(null, null, 2131752874, cf3.r(this.currentAccount, this.yd)));
            O.r = false;
            O.j();
            qh4 qh4Var = this.J9;
            if (qh4Var != null) {
                qh4Var.c(true);
            }
        }
    }
}
