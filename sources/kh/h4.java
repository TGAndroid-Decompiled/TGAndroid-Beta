package kh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s00;
import org.telegram.ui.zn;
public final class h4 extends zn {
    public boolean Nc;
    public final TL_stars.TL_starGiftUnique Oc;
    public final long Pc;

    public h4(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
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
            O.f25679r = false;
            O.j();
            s00 s00Var = this.f40634j9;
            if (s00Var != null) {
                s00Var.c(true);
            }
        }
    }
}
