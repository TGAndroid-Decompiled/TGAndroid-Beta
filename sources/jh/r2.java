package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.tn;
public final class r2 implements Runnable {
    public final int f12692a;
    public final h5 f12693b;
    public final tn f12694c;
    public final long d;

    public r2(h5 h5Var, tn tnVar, long j10, int i10) {
        this.f12692a = i10;
        this.f12693b = h5Var;
        this.f12694c = tnVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f12692a;
        long j10 = this.d;
        tn tnVar = this.f12694c;
        h5 h5Var = this.f12693b;
        switch (i10) {
            case 0:
                mc M = tc.a0(tnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.f30662t = true;
                M.j();
                return;
            default:
                mc M2 = tc.a0(tnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.f30662t = true;
                M2.j();
                return;
        }
    }
}
