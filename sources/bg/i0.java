package bg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i0 implements RequestDelegate {
    public final int f1832a;
    public final Utilities.Callback f1833b;
    public final Utilities.Callback f1834c;

    public i0(Utilities.Callback callback, Utilities.Callback callback2, int i9) {
        this.f1832a = i9;
        this.f1833b = callback;
        this.f1834c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1832a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tL_error, this.f1833b, this.f1834c, 6));
                return;
            default:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(tL_error, this.f1833b, tLObject, this.f1834c, 2));
                return;
        }
    }
}
