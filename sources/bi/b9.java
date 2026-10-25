package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b9 implements RequestDelegate {
    public final int f4383a;
    public final Utilities.Callback f4384b;

    public b9(int i10, Utilities.Callback callback) {
        this.f4383a = i10;
        this.f4384b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4383a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i9(tLObject, this.f4384b, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new di.b4(2, this.f4384b, tL_error));
                return;
        }
    }
}
