package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements RequestDelegate {
    public final int f9172a;
    public final Utilities.Callback f9173b;

    public x6(int i9, Utilities.Callback callback) {
        this.f9172a = i9;
        this.f9173b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9172a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e7(tLObject, this.f9173b, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h3.g0(16, this.f9173b, tL_error));
                return;
        }
    }
}
