package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w2 implements RequestDelegate {
    public final int f18187a;
    public final x2 f18188b;

    public w2(x2 x2Var, int i9) {
        this.f18187a = i9;
        this.f18188b = x2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18187a) {
            case 0:
                c3 c3Var = this.f18188b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(c3Var.C).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new y1(c3Var, 17));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ih.h3(this.f18188b, tLObject, tL_error, 21));
                return;
        }
    }
}
