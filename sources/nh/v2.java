package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class v2 implements RequestDelegate {

    public final int f19004a;

    public final w2 f19005b;

    public v2(w2 w2Var, int i10) {
        this.f19004a = i10;
        this.f19005b = w2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19004a) {
            case 0:
                b3 b3Var = this.f19005b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(b3Var.C).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new y1(b3Var, 17));
                break;
            default:
                AndroidUtilities.runOnUIThread(new j3.m(this.f19005b, tLObject, tL_error, 21));
                break;
        }
    }
}
