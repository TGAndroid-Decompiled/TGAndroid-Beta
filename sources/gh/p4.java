package gh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.mc;
import org.telegram.ui.rn;

public final class p4 extends rn {
    public boolean Mc;
    public final TL_stars.TL_starGiftUnique Nc;
    public final long Oc;

    public p4(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.Nc = tL_starGiftUnique;
        this.Oc = j10;
        this.Mc = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Mc) {
            return;
        }
        this.Mc = true;
        ec ecVarO = mc.a0(this).O(this.Nc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Oc)));
        ecVarO.f28028r = false;
        ecVarO.j();
        f00 f00Var = this.f42086i9;
        if (f00Var != null) {
            f00Var.c(true);
        }
    }
}
