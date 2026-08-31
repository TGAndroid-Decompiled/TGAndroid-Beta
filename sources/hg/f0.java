package hg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f0 implements RequestDelegate {
    public final int f7463a;
    public final Utilities.Callback f7464b;
    public final Utilities.Callback f7465c;

    public f0(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f7463a = i10;
        this.f7464b = callback;
        this.f7465c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f7463a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tL_error, this.f7464b, this.f7465c, 7));
                return;
            default:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(tL_error, this.f7464b, tLObject, this.f7465c, 4));
                return;
        }
    }
}
