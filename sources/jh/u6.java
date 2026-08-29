package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u6 implements RequestDelegate {
    public final int f12917a;
    public final Utilities.Callback f12918b;

    public u6(int i10, Utilities.Callback callback) {
        this.f12917a = i10;
        this.f12918b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12917a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b7(tLObject, this.f12918b, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lh.r3(2, this.f12918b, tL_error));
                return;
        }
    }
}
