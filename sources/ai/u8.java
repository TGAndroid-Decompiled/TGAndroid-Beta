package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u8 implements RequestDelegate {
    public final int f2264a;
    public final ga f2265b;

    public u8(ga gaVar, int i10) {
        this.f2264a = i10;
        this.f2265b = gaVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2264a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c9(this.f2265b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new c9(this.f2265b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new c9(this.f2265b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new c9(this.f2265b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c9(this.f2265b, tLObject, 4));
                return;
        }
    }
}
