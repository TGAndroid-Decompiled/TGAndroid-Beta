package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ky0;
public final class g8 implements RequestDelegate {
    public final int f1057a;
    public final Utilities.Callback f1058b;

    public g8(int i10, Utilities.Callback callback) {
        this.f1057a = i10;
        this.f1058b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1057a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.f(14, this.f1058b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ky0(tLObject, this.f1058b, 1));
                return;
        }
    }
}
