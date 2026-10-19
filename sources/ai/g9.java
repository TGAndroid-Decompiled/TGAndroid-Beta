package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g9 implements RequestDelegate {
    public final int f1361a;
    public final Utilities.Callback f1362b;

    public g9(int i10, Utilities.Callback callback) {
        this.f1361a = i10;
        this.f1362b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1361a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n9(tLObject, this.f1362b, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pa(18, this.f1362b, tL_error));
                return;
        }
    }
}
