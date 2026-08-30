package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v6 implements RequestDelegate {
    public final int f13249a;
    public final Utilities.Callback f13250b;

    public v6(int i10, Utilities.Callback callback) {
        this.f13249a = i10;
        this.f13250b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13249a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c7(tLObject, this.f13250b, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new nh.n4(1, this.f13250b, tL_error));
                return;
        }
    }
}
