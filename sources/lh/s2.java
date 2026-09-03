package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.zn;
public final class s2 implements Runnable {
    public final int f13045a;
    public final g5 f13046b;
    public final zn f13047c;
    public final long d;

    public s2(g5 g5Var, zn znVar, long j10, int i10) {
        this.f13045a = i10;
        this.f13046b = g5Var;
        this.f13047c = znVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f13045a;
        long j10 = this.d;
        zn znVar = this.f13047c;
        g5 g5Var = this.f13046b;
        switch (i10) {
            case 0:
                ic M = qc.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, g5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.f25681t = true;
                M.j();
                return;
            default:
                ic M2 = qc.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, g5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.f25681t = true;
                M2.j();
                return;
        }
    }
}
