package kh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.xn;
public final class i4 extends xn {
    public boolean Nc;
    public final TL_stars.TL_starGiftUnique Oc;
    public final long Pc;

    public i4(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.Oc = tL_starGiftUnique;
        this.Pc = j10;
        this.Nc = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Nc) {
            this.Nc = true;
            ic O = qc.a0(this).O(this.Oc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Pc)));
            O.f25680r = false;
            O.j();
            r00 r00Var = this.f40068j9;
            if (r00Var != null) {
                r00Var.c(true);
            }
        }
    }
}
