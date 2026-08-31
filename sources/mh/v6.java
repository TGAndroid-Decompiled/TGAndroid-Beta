package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v6 implements RequestDelegate {
    public final int f14939a;
    public final Utilities.Callback f14940b;

    public v6(int i10, Utilities.Callback callback) {
        this.f14939a = i10;
        this.f14940b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14939a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c7(tLObject, this.f14940b, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new oh.z1(4, this.f14940b, tL_error));
                return;
        }
    }
}
