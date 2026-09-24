package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rx0;
public final class f8 implements RequestDelegate {
    public final int f878a;
    public final Utilities.Callback f879b;

    public f8(int i10, Utilities.Callback callback) {
        this.f878a = i10;
        this.f879b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f878a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(14, this.f879b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new rx0(tLObject, this.f879b, 1));
                return;
        }
    }
}
