package ei;

import ci.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f8905a;
    public final m f8906b;

    public a(m mVar, int i10) {
        this.f8905a = i10;
        this.f8906b = mVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8905a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x8(15, this.f8906b, (TLRPC.UserFull) obj));
                return;
            case 1:
                m mVar = this.f8906b;
                mVar.Y.commission_permille = ((Integer) obj).intValue();
                mVar.N0();
                return;
            default:
                m mVar2 = this.f8906b;
                mVar2.Y.duration_months = ((Integer) mVar2.f9189a0.get(((Integer) obj).intValue())).intValue();
                mVar2.N0();
                return;
        }
    }
}
