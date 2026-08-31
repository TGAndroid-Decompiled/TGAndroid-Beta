package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xn;
public final class r2 implements Runnable {
    public final int f14666a;
    public final g5 f14667b;
    public final xn f14668c;
    public final long d;

    public r2(g5 g5Var, xn xnVar, long j10, int i10) {
        this.f14666a = i10;
        this.f14667b = g5Var;
        this.f14668c = xnVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f14666a;
        long j10 = this.d;
        xn xnVar = this.f14668c;
        g5 g5Var = this.f14667b;
        switch (i10) {
            case 0:
                ic M = qc.a0(xnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, g5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.f27755t = true;
                M.j();
                return;
            default:
                ic M2 = qc.a0(xnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, g5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.f27755t = true;
                M2.j();
                return;
        }
    }
}
