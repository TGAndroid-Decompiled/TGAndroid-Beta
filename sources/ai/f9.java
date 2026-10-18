package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements RequestDelegate {
    public final int f1293a;
    public final Utilities.Callback f1294b;

    public f9(int i10, Utilities.Callback callback) {
        this.f1293a = i10;
        this.f1294b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1293a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m9(tLObject, this.f1294b, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pa(18, this.f1294b, tL_error));
                return;
        }
    }
}
