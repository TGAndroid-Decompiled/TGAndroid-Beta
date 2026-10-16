package fi;

import di.y6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f9156a;
    public final l f9157b;

    public a(l lVar, int i10) {
        this.f9156a = i10;
        this.f9157b = lVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9156a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y6(25, this.f9157b, (TLRPC.UserFull) obj));
                return;
            case 1:
                l lVar = this.f9157b;
                lVar.Y.commission_permille = ((Integer) obj).intValue();
                lVar.J0();
                return;
            default:
                l lVar2 = this.f9157b;
                lVar2.Y.duration_months = ((Integer) lVar2.f9392a0.get(((Integer) obj).intValue())).intValue();
                lVar2.J0();
                return;
        }
    }
}
