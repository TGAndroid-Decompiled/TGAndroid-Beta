package ei;

import ci.y8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f8917a;
    public final l f8918b;

    public a(l lVar, int i10) {
        this.f8917a = i10;
        this.f8918b = lVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8917a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y8(15, this.f8918b, (TLRPC.UserFull) obj));
                return;
            case 1:
                l lVar = this.f8918b;
                lVar.Y.commission_permille = ((Integer) obj).intValue();
                lVar.J0();
                return;
            default:
                l lVar2 = this.f8918b;
                lVar2.Y.duration_months = ((Integer) lVar2.f9192a0.get(((Integer) obj).intValue())).intValue();
                lVar2.J0();
                return;
        }
    }
}
