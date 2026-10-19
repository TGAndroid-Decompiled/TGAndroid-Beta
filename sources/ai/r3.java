package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.qn;
public final class r3 implements Runnable {
    public final int f2097a;
    public final k7 f2098b;
    public final qn f2099c;
    public final long d;

    public r3(k7 k7Var, qn qnVar, long j10, int i10) {
        this.f2097a = i10;
        this.f2098b = k7Var;
        this.f2099c = qnVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f2097a;
        long j10 = this.d;
        qn qnVar = this.f2099c;
        k7 k7Var = this.f2098b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(qnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k7Var.X1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.f29606t = true;
                M.j();
                return;
            default:
                org.telegram.ui.Components.qc M2 = org.telegram.ui.Components.xc.a0(qnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k7Var.X1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.f29606t = true;
                M2.j();
                return;
        }
    }
}
