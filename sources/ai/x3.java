package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.sn;
public final class x3 implements Runnable {
    public final int f2424a;
    public final k7 f2425b;
    public final sn f2426c;
    public final long d;

    public x3(k7 k7Var, sn snVar, long j10, int i10) {
        this.f2424a = i10;
        this.f2425b = k7Var;
        this.f2426c = snVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f2424a;
        long j10 = this.d;
        sn snVar = this.f2426c;
        k7 k7Var = this.f2425b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k7Var.Q1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.f29655t = true;
                M.j();
                return;
            default:
                org.telegram.ui.Components.qc M2 = org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k7Var.Q1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.f29655t = true;
                M2.j();
                return;
        }
    }
}
