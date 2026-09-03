package gg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f0 implements RequestDelegate {
    public final int f6606a;
    public final Utilities.Callback f6607b;
    public final Utilities.Callback f6608c;

    public f0(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f6606a = i10;
        this.f6607b = callback;
        this.f6608c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6606a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tL_error, this.f6607b, this.f6608c, 7));
                return;
            default:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(tL_error, this.f6607b, tLObject, this.f6608c, 4));
                return;
        }
    }
}
