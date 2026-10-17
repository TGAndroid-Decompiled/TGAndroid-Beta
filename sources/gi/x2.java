package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x2 implements RequestDelegate {
    public final int f11544a;
    public final y2 f11545b;

    public x2(y2 y2Var, int i10) {
        this.f11544a = i10;
        this.f11545b = y2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11544a) {
            case 0:
                d3 d3Var = this.f11545b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(d3Var.G).lambda$processUpdates$377((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new y1(d3Var, 16));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ei.z1(this.f11545b, tLObject, tL_error, false, 11));
                return;
        }
    }
}
