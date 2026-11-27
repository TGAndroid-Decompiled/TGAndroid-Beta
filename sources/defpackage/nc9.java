package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
public final class nc9 extends zu1 {
    public boolean Jd;
    public final TL_stars.TL_starGiftUnique Kd;
    public final long Ld;

    public nc9(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        super(bundle);
        this.Kd = tL_starGiftUnique;
        this.Ld = j;
        this.Jd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Jd) {
            this.Jd = true;
            v21 O = d31.b0(this).O(this.Kd.getDocument(), ob6.M0(2131752866, null), ob6.a0(null, null, 2131752867, wf3.r(this.currentAccount, this.Ld)));
            O.s = false;
            O.j();
            tj4 tj4Var = this.J9;
            if (tj4Var != null) {
                tj4Var.c(true);
            }
        }
    }
}
