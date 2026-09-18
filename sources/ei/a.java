package ei;

import ci.b9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f8212a;
    public final l f8213b;

    public a(l lVar, int i10) {
        this.f8212a = i10;
        this.f8213b = lVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8212a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b9(15, this.f8213b, (TLRPC.UserFull) obj));
                return;
            case 1:
                l lVar = this.f8213b;
                lVar.Y.commission_permille = ((Integer) obj).intValue();
                lVar.I0();
                return;
            default:
                l lVar2 = this.f8213b;
                lVar2.Y.duration_months = ((Integer) lVar2.f8464a0.get(((Integer) obj).intValue())).intValue();
                lVar2.I0();
                return;
        }
    }
}
