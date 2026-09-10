package di;

import bi.af;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f6500a;
    public final m f6501b;

    public a(m mVar, int i10) {
        this.f6500a = i10;
        this.f6501b = mVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6500a) {
            case 0:
                AndroidUtilities.runOnUIThread(new af(9, this.f6501b, (TLRPC.UserFull) obj));
                return;
            case 1:
                m mVar = this.f6501b;
                mVar.Y.commission_permille = ((Integer) obj).intValue();
                mVar.I0();
                return;
            default:
                m mVar2 = this.f6501b;
                mVar2.Y.duration_months = ((Integer) mVar2.f6753a0.get(((Integer) obj).intValue())).intValue();
                mVar2.I0();
                return;
        }
    }
}
