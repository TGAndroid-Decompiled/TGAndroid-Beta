package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.sn;
public final class p3 implements Runnable {
    public final int f2000a;
    public final k7 f2001b;
    public final sn f2002c;
    public final long d;

    public p3(k7 k7Var, sn snVar, long j10, int i10) {
        this.f2000a = i10;
        this.f2001b = k7Var;
        this.f2002c = snVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f2000a;
        long j10 = this.d;
        sn snVar = this.f2002c;
        k7 k7Var = this.f2001b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k7Var.P1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.f29649t = true;
                M.j();
                return;
            default:
                org.telegram.ui.Components.qc M2 = org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k7Var.P1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.f29649t = true;
                M2.j();
                return;
        }
    }
}
