package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hx0;
public final class d8 implements RequestDelegate {
    public final int f709a;
    public final Utilities.Callback f710b;

    public d8(int i10, Utilities.Callback callback) {
        this.f709a = i10;
        this.f710b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f709a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(14, this.f710b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new hx0(tLObject, this.f710b, 1));
                return;
        }
    }
}
