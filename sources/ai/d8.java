package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sx0;
public final class d8 implements RequestDelegate {
    public final int f714a;
    public final Utilities.Callback f715b;

    public d8(int i10, Utilities.Callback callback) {
        this.f714a = i10;
        this.f715b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f714a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(14, this.f715b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sx0(tLObject, this.f715b, 1));
                return;
        }
    }
}
