package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.sn;
public final class w3 implements Runnable {
    public final int f2349a;
    public final l7 f2350b;
    public final sn f2351c;
    public final long d;

    public w3(l7 l7Var, sn snVar, long j10, int i10) {
        this.f2349a = i10;
        this.f2350b = l7Var;
        this.f2351c = snVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f2349a;
        long j10 = this.d;
        sn snVar = this.f2351c;
        l7 l7Var = this.f2350b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.oc M = org.telegram.ui.Components.vc.a0(snVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, l7Var.W1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.f29213t = true;
                M.j();
                return;
            default:
                org.telegram.ui.Components.oc M2 = org.telegram.ui.Components.vc.a0(snVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, l7Var.W1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.f29213t = true;
                M2.j();
                return;
        }
    }
}
