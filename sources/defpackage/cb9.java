package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
public final class cb9 extends yv1 {
    public boolean Gd;
    public final TL_stars.TL_starGiftUnique Hd;
    public final long Id;

    public cb9(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        super(bundle);
        this.Hd = tL_starGiftUnique;
        this.Id = j;
        this.Gd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Gd) {
            this.Gd = true;
            u31 O = c41.b0(this).O(this.Hd.getDocument(), jb6.M0(2131752838, null), jb6.a0(null, null, 2131752839, pg3.r(this.currentAccount, this.Id)));
            O.s = false;
            O.j();
            uj4 uj4Var = this.J9;
            if (uj4Var != null) {
                uj4Var.c(true);
            }
        }
    }
}
