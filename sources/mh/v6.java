package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v6 implements RequestDelegate {
    public final int f14941a;
    public final Utilities.Callback f14942b;

    public v6(int i10, Utilities.Callback callback) {
        this.f14941a = i10;
        this.f14942b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14941a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c7(tLObject, this.f14942b, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new oh.z1(4, this.f14942b, tL_error));
                return;
        }
    }
}
