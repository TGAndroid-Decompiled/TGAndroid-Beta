package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j6 implements RequestDelegate {
    public final int f14298a;
    public final t7 f14299b;

    public j6(t7 t7Var, int i10) {
        this.f14298a = i10;
        this.f14299b = t7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14298a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r6(this.f14299b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new r6(this.f14299b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new r6(this.f14299b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new r6(this.f14299b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r6(this.f14299b, tLObject, 4));
                return;
        }
    }
}
