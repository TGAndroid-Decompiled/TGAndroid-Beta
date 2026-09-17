package fi;

import di.b7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f9552a;
    public final m f9553b;

    public a(m mVar, int i10) {
        this.f9552a = i10;
        this.f9553b = mVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9552a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b7(23, this.f9553b, (TLRPC.UserFull) obj));
                return;
            case 1:
                m mVar = this.f9553b;
                mVar.Y.commission_permille = ((Integer) obj).intValue();
                mVar.I0();
                return;
            default:
                m mVar2 = this.f9553b;
                mVar2.Y.duration_months = ((Integer) mVar2.f9842a0.get(((Integer) obj).intValue())).intValue();
                mVar2.I0();
                return;
        }
    }
}
