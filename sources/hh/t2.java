package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.rn;

public final class t2 implements Runnable {

    public final int f10051a;

    public final i5 f10052b;

    public final rn f10053c;
    public final long d;

    public t2(i5 i5Var, rn rnVar, long j10, int i10) {
        this.f10051a = i10;
        this.f10052b = i5Var;
        this.f10053c = rnVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f10051a;
        long j10 = this.d;
        rn rnVar = this.f10053c;
        i5 i5Var = this.f10052b;
        switch (i10) {
            case 0:
                ec ecVarM = mc.a0(rnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, i5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                ecVarM.f28030t = true;
                ecVarM.j();
                break;
            default:
                ec ecVarM2 = mc.a0(rnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, i5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                ecVarM2.f28030t = true;
                ecVarM2.j();
                break;
        }
    }
}
