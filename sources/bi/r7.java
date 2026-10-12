package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fy0;
public final class r7 implements RequestDelegate {
    public final int f3611a;
    public final Utilities.Callback f3612b;

    public r7(int i10, Utilities.Callback callback) {
        this.f3611a = i10;
        this.f3612b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3611a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.f(25, this.f3612b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fy0(tLObject, this.f3612b, 1));
                return;
        }
    }
}
