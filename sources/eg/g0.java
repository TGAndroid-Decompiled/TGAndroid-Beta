package eg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f5996a;
    public final Utilities.Callback f5997b;
    public final Utilities.Callback f5998c;

    public g0(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f5996a = i10;
        this.f5997b = callback;
        this.f5998c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5996a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tL_error, this.f5997b, this.f5998c, 7));
                return;
            default:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(tL_error, this.f5997b, tLObject, this.f5998c, 4));
                return;
        }
    }
}
