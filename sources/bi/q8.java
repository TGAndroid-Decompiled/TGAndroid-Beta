package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q8 implements RequestDelegate {
    public final int f5289a;
    public final ca f5290b;

    public q8(ca caVar, int i10) {
        this.f5289a = i10;
        this.f5290b = caVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5289a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x8(this.f5290b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new x8(this.f5290b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new x8(this.f5290b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new x8(this.f5290b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new x8(this.f5290b, tLObject, 4));
                return;
        }
    }
}
