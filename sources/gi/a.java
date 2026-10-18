package gi;

import ei.p6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f11067a;
    public final l f11068b;

    public a(l lVar, int i10) {
        this.f11067a = i10;
        this.f11068b = lVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11067a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p6(14, this.f11068b, (TLRPC.UserFull) obj));
                return;
            case 1:
                l lVar = this.f11068b;
                lVar.Y.commission_permille = ((Integer) obj).intValue();
                lVar.J0();
                return;
            default:
                l lVar2 = this.f11068b;
                lVar2.Y.duration_months = ((Integer) lVar2.f11309a0.get(((Integer) obj).intValue())).intValue();
                lVar2.J0();
                return;
        }
    }
}
