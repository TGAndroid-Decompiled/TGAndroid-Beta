package ei;

import ci.y8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f8206a;
    public final l f8207b;

    public a(l lVar, int i10) {
        this.f8206a = i10;
        this.f8207b = lVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8206a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y8(15, this.f8207b, (TLRPC.UserFull) obj));
                return;
            case 1:
                l lVar = this.f8207b;
                lVar.Y.commission_permille = ((Integer) obj).intValue();
                lVar.I0();
                return;
            default:
                l lVar2 = this.f8207b;
                lVar2.Y.duration_months = ((Integer) lVar2.f8458a0.get(((Integer) obj).intValue())).intValue();
                lVar2.I0();
                return;
        }
    }
}
