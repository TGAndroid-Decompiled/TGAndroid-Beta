package gi;

import ei.p6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f11083a;
    public final l f11084b;

    public a(l lVar, int i10) {
        this.f11083a = i10;
        this.f11084b = lVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11083a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p6(14, this.f11084b, (TLRPC.UserFull) obj));
                return;
            case 1:
                l lVar = this.f11084b;
                lVar.f11328a0.commission_permille = ((Integer) obj).intValue();
                lVar.J0();
                return;
            default:
                l lVar2 = this.f11084b;
                lVar2.f11328a0.duration_months = ((Integer) lVar2.f11330c0.get(((Integer) obj).intValue())).intValue();
                lVar2.J0();
                return;
        }
    }
}
