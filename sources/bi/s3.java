package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.wn;
public final class s3 implements Runnable {
    public final int f5390a;
    public final h7 f5391b;
    public final wn f5392c;
    public final long d;

    public s3(h7 h7Var, wn wnVar, long j10, int i10) {
        this.f5390a = i10;
        this.f5391b = h7Var;
        this.f5392c = wnVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f5390a;
        long j10 = this.d;
        wn wnVar = this.f5392c;
        h7 h7Var = this.f5391b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(wnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h7Var.W1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.f31872u = true;
                M.j();
                return;
            default:
                org.telegram.ui.Components.qc M2 = org.telegram.ui.Components.wc.b0(wnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h7Var.W1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.f31872u = true;
                M2.j();
                return;
        }
    }
}
