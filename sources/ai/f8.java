package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cy0;
public final class f8 implements RequestDelegate {
    public final int f949a;
    public final Utilities.Callback f950b;

    public f8(int i10, Utilities.Callback callback) {
        this.f949a = i10;
        this.f950b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f949a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(14, this.f950b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new cy0(tLObject, this.f950b, 1));
                return;
        }
    }
}
