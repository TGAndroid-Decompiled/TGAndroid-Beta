package gi;

import ei.p6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f11065a;
    public final l f11066b;

    public a(l lVar, int i10) {
        this.f11065a = i10;
        this.f11066b = lVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11065a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p6(14, this.f11066b, (TLRPC.UserFull) obj));
                return;
            case 1:
                l lVar = this.f11066b;
                lVar.Y.commission_permille = ((Integer) obj).intValue();
                lVar.J0();
                return;
            default:
                l lVar2 = this.f11066b;
                lVar2.Y.duration_months = ((Integer) lVar2.f11307a0.get(((Integer) obj).intValue())).intValue();
                lVar2.J0();
                return;
        }
    }
}
