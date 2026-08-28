package mh;

import kh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f17688a;
    public final l f17689b;

    public a(l lVar, int i9) {
        this.f17688a = i9;
        this.f17689b = lVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17688a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o8(3, this.f17689b, (TLRPC.UserFull) obj));
                return;
            case 1:
                l lVar = this.f17689b;
                lVar.U.commission_permille = ((Integer) obj).intValue();
                lVar.H0();
                return;
            default:
                l lVar2 = this.f17689b;
                lVar2.U.duration_months = ((Integer) lVar2.W.get(((Integer) obj).intValue())).intValue();
                lVar2.H0();
                return;
        }
    }
}
