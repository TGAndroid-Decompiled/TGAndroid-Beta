package ih;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.tc;
import org.telegram.ui.tn;
public final class i4 extends tn {
    public boolean Mc;
    public final TL_stars.TL_starGiftUnique Nc;
    public final long Oc;

    public i4(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.Nc = tL_starGiftUnique;
        this.Oc = j10;
        this.Mc = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Mc) {
            this.Mc = true;
            mc O = tc.a0(this).O(this.Nc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Oc)));
            O.f30660r = false;
            O.j();
            n00 n00Var = this.f42847i9;
            if (n00Var != null) {
                n00Var.c(true);
            }
        }
    }
}
