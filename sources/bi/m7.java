package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gx0;
public final class m7 implements RequestDelegate {
    public final int f3346a;
    public final Utilities.Callback f3347b;

    public m7(int i10, Utilities.Callback callback) {
        this.f3346a = i10;
        this.f3347b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3346a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(23, this.f3347b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gx0(tLObject, this.f3347b, 1));
                return;
        }
    }
}
