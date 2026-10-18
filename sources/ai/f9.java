package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements RequestDelegate {
    public final int f1294a;
    public final Utilities.Callback f1295b;

    public f9(int i10, Utilities.Callback callback) {
        this.f1294a = i10;
        this.f1295b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1294a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m9(tLObject, this.f1295b, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pa(18, this.f1295b, tL_error));
                return;
        }
    }
}
