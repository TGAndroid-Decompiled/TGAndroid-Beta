package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.qn;
public final class w3 implements Runnable {
    public final int f2346a;
    public final l7 f2347b;
    public final qn f2348c;
    public final long d;

    public w3(l7 l7Var, qn qnVar, long j10, int i10) {
        this.f2346a = i10;
        this.f2347b = l7Var;
        this.f2348c = qnVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f2346a;
        long j10 = this.d;
        qn qnVar = this.f2348c;
        l7 l7Var = this.f2347b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(qnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, l7Var.X1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.f29545t = true;
                M.j();
                return;
            default:
                org.telegram.ui.Components.qc M2 = org.telegram.ui.Components.xc.a0(qnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, l7Var.X1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.f29545t = true;
                M2.j();
                return;
        }
    }
}
