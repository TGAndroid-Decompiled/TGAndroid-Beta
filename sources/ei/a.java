package ei;

import ci.b9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f8207a;
    public final l f8208b;

    public a(l lVar, int i10) {
        this.f8207a = i10;
        this.f8208b = lVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8207a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b9(15, this.f8208b, (TLRPC.UserFull) obj));
                return;
            case 1:
                l lVar = this.f8208b;
                lVar.Y.commission_permille = ((Integer) obj).intValue();
                lVar.I0();
                return;
            default:
                l lVar2 = this.f8208b;
                lVar2.Y.duration_months = ((Integer) lVar2.f8459a0.get(((Integer) obj).intValue())).intValue();
                lVar2.I0();
                return;
        }
    }
}
