package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gy0;
public final class r7 implements RequestDelegate {
    public final int f3615a;
    public final Utilities.Callback f3616b;

    public r7(int i10, Utilities.Callback callback) {
        this.f3615a = i10;
        this.f3616b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3615a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.f(25, this.f3616b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gy0(tLObject, this.f3616b, 1));
                return;
        }
    }
}
