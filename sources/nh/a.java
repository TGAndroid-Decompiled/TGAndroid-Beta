package nh;

import lh.k7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class a implements Utilities.Callback {

    public final int f18524a;

    public final k f18525b;

    public a(k kVar, int i10) {
        this.f18524a = i10;
        this.f18525b = kVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18524a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k7(9, this.f18525b, (TLRPC.UserFull) obj));
                break;
            case 1:
                k kVar = this.f18525b;
                kVar.U.commission_permille = ((Integer) obj).intValue();
                kVar.I0();
                break;
            default:
                k kVar2 = this.f18525b;
                kVar2.U.duration_months = ((Integer) kVar2.W.get(((Integer) obj).intValue())).intValue();
                kVar2.I0();
                break;
        }
    }
}
