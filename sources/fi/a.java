package fi;

import di.x6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f9153a;
    public final l f9154b;

    public a(l lVar, int i10) {
        this.f9153a = i10;
        this.f9154b = lVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9153a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x6(25, this.f9154b, (TLRPC.UserFull) obj));
                return;
            case 1:
                l lVar = this.f9154b;
                lVar.Y.commission_permille = ((Integer) obj).intValue();
                lVar.J0();
                return;
            default:
                l lVar2 = this.f9154b;
                lVar2.Y.duration_months = ((Integer) lVar2.f9389a0.get(((Integer) obj).intValue())).intValue();
                lVar2.J0();
                return;
        }
    }
}
