package ei;

import ci.b9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f8209a;
    public final l f8210b;

    public a(l lVar, int i10) {
        this.f8209a = i10;
        this.f8210b = lVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8209a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b9(15, this.f8210b, (TLRPC.UserFull) obj));
                return;
            case 1:
                l lVar = this.f8210b;
                lVar.Y.commission_permille = ((Integer) obj).intValue();
                lVar.I0();
                return;
            default:
                l lVar2 = this.f8210b;
                lVar2.Y.duration_months = ((Integer) lVar2.f8461a0.get(((Integer) obj).intValue())).intValue();
                lVar2.I0();
                return;
        }
    }
}
