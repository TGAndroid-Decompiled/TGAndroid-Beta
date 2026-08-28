package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;
public final class t2 implements Runnable {
    public final int f8909a;
    public final k5 f8910b;
    public final qn f8911c;
    public final long d;

    public t2(k5 k5Var, qn qnVar, long j10, int i9) {
        this.f8909a = i9;
        this.f8910b = k5Var;
        this.f8911c = qnVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i9 = this.f8909a;
        long j10 = this.d;
        qn qnVar = this.f8911c;
        k5 k5Var = this.f8910b;
        switch (i9) {
            case 0:
                gc M = oc.a0(qnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.f28747t = true;
                M.j();
                return;
            default:
                gc M2 = oc.a0(qnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.f28747t = true;
                M2.j();
                return;
        }
    }
}
