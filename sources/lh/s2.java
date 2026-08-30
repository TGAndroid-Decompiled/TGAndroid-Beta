package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xn;
public final class s2 implements Runnable {
    public final int f13061a;
    public final g5 f13062b;
    public final xn f13063c;
    public final long d;

    public s2(g5 g5Var, xn xnVar, long j10, int i10) {
        this.f13061a = i10;
        this.f13062b = g5Var;
        this.f13063c = xnVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f13061a;
        long j10 = this.d;
        xn xnVar = this.f13063c;
        g5 g5Var = this.f13062b;
        switch (i10) {
            case 0:
                ic M = qc.a0(xnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, g5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.f25682t = true;
                M.j();
                return;
            default:
                ic M2 = qc.a0(xnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, g5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.f25682t = true;
                M2.j();
                return;
        }
    }
}
